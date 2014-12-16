/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Horang
 */
public class CalcOpt1D {
    

    public double n1,k1,d1;  
    public double n2,k2,d2;
    public int nol;  // Number of layers
    public double angle;  // in radian
    private static double pi = 3.14159;
    
//    private JonesMatrix M;
    
    //public double theta;
    static private int wlimUpper = 300;
    static private int wlimLower = 1500; // Wavelength limit to calculate...
    
    Complex pa = new Complex(1,0);
    Complex ps = new Complex(2,0);
    
////////////////////////////////////////////////////////////////////////////////
    
    public CalcOpt1D(){
    }
   

    
    public CalcOpt1D(List<Double> paramMaterial1, List<Double> paramMaterial2, List<Integer> paramStructure) {
// ===========================
//      ParamMaterial
// ===========================
//      0 : n1
//      1 : k1
//      2 : d1 , thickness in nm
//                 
// ===========================
//      paramStructure
// ===========================       
//      0 : nol
//      1 : angle
//       
        n1 = paramMaterial1.get(0);
        k1 = paramMaterial1.get(1);
        d1 = paramMaterial1.get(2);
        
        n2 = paramMaterial2.get(0);
        k2 = paramMaterial2.get(1);
        d2 = paramMaterial2.get(2);
        
        nol = paramStructure.get(0);
        angle = paramStructure.get(1);
//        wlimUpper = paramStructure.get(1);
//        wlimLower = paramStructure.get(2);
    }
    
    
    
    static List<Double> testdata(int nOfData, double maxValue) {
        List<Double> testdata = new ArrayList<>();
        Random random = new Random();
        int maxDataPoints = nOfData;
        //double maxScore = maxvalue;
                     
        for (int i = 0; i < maxDataPoints; i++) {
            //double tempnum;
            testdata.add((double) random.nextDouble() * maxValue);
        }  // Making data in here
        
        return testdata;
    }
    
    
    
    public List<Double> testdata(int nOfData) {
        return this.testdata(nOfData, 100);
    }
    

    
    public JonesMatrix matrixCalc(double lambda) { ///////////////////////////

        JonesMatrix matrix0 = new JonesMatrix(n1,k1,d1,angle);
        
        double n0 = 1;
        double theta0 = angle;
        double theta1 = Math.asin(Math.sin(theta0)/n0);
        double theta2 = Math.asin(Math.sin(theta0)/n0);
        
        
        JonesMatrix matrix1 = new JonesMatrix(n1,k1,d1,theta2);
        JonesMatrix matrix2 = new JonesMatrix(n2,k2,d2,theta1);
 
        JonesMatrix M = new JonesMatrix();
        //matrix1.N=new Complex(n1,k1,)
        
        matrix0.setmatrix(lambda);
        matrix1.setmatrix(lambda);
        matrix2.setmatrix(lambda);
        
        M = matrix2.product(matrix1);
     
        

        
        for (int i=1;i<(nol-1);i++){
            M = M.product(M);
        }

        M = matrix0.product(M);
        M = M.product(matrix2);
        
        
        

        return M;
    }
    
    
           
    public List<Double> calcT(int points) {
//    static List<Double> calcT(List<Double> params) { // for transmittance
        List<Double> tran = new ArrayList<>();
        
        double dw = (wlimLower-wlimUpper)/points;
        double lambda;
        Complex tmpr;
        Complex tmpc = new Complex(0,0);
        Complex tmpc1, tmpc2, tmpc3, tmpc4;
        //double pa = Math.cos(angle);
        //double ps = 3.5 * Math.cos(angle);
        //double ps = pa;

        JonesMatrix M = new JonesMatrix();// = new JonesMatrix();        
        
        for (int i = 0 ; i < points ; i++) {
            lambda = wlimUpper+dw*i;
            M.setmatrix(matrixCalc(lambda).getmatrix()); ////////////////////////////
            Complex matrix[][] = M.getmatrix();
            tmpr = pa.product(2);
            tmpc1 = matrix[0][0].product(pa);
            tmpc2 = matrix[0][1].product(pa.product(ps));
            tmpc3 = matrix[1][0];
            tmpc4 = matrix[1][1].product(ps);
//            tmpc = tmpc.add(tmpc1).add(tmpc2).add(tmpc3).add(tmpc4);


            tmpc = tmpc.add(tmpc1);
            tmpc = tmpc.add(tmpc2);
            tmpc = tmpc.add(tmpc3);
            tmpc = tmpc.add(tmpc4);
            
            // tmpc.show();
            
            tmpc=tmpc.inverse();
            tmpc=tmpc.product(tmpr);
            
            double tmp;
            tmp=tmpc.abs();
            tmp=tmp*tmp;
        
            // Check validity of the value
            if (tmp<0 || tmp>1) {
                tmp = 1;
                
            }
            
            tran.add(tmp*100);
            
        }

        
        return tran;
    }
    
    
    public List<Double> calcR(int points) {
//    static List<Double> calcR(List<Double> params) { // for reflectance      
        List<Double> refl = new ArrayList<>();

        
        double dw = (wlimLower-wlimUpper)/points;
        double lambda;
        double tmp;
        Complex tmpc;
        Complex tmpca = new Complex(0,0);
        Complex tmpcb = new Complex(0,0);
        Complex tmpc1, tmpc2, tmpc3, tmpc4;
        //double pa = Math.cos(angle);
//        Complex pa = new Complex(1,0);
//        Complex ps = new Complex(1.7,0);
        //double ps = pa;

        JonesMatrix M;// = new JonesMatrix();        
        
        for (int i = 0 ; i < points ; i++) {
            lambda = wlimUpper+dw*i;
            M=matrixCalc(lambda); ////////////////////////////
            Complex matrix[][] = M.getmatrix();

            tmpc1 = matrix[0][0].product(pa);
            tmpc2 = matrix[0][1].product(pa.product(ps));
            tmpc3 = matrix[1][0];
            tmpc4 = matrix[1][1].product(ps);
            
            
            //tmpca = tmpca.add(tmpc1).add(tmpc2).substrate(tmpc3).substrate(tmpc4);
            tmpca = tmpca.add(tmpc1);
            tmpca = tmpca.add(tmpc2);
            tmpca = tmpca.substrate(tmpc3);
            tmpca = tmpca.substrate(tmpc4);
            
            
            
            //tmpcb = tmpcb.add(tmpc1).add(tmpc2).add(tmpc3).add(tmpc4);
            tmpcb = tmpcb.add(tmpc1);
            tmpcb = tmpcb.add(tmpc2);
            tmpcb = tmpcb.add(tmpc3);
            tmpcb = tmpcb.add(tmpc4);            
            
            tmpcb=tmpcb.inverse();
            //tmpcb=tmpca.inverse();
            tmpc=tmpca.product(tmpcb);
            tmp=tmpc.abs();
            tmp=tmp*tmp;
            refl.add(tmp*100);
            
        }

        return refl;
    }
    
//    public void updateParam(List<Double> paramMaterial1, List<Double> paramMaterial2, List<Integer> paramStructure) {
//    // 아... 이건 고민 좀 해보자... 
//        n1 = paramMaterial1.get(0);
//        k1 = paramMaterial1.get(1);
//        d1 = paramMaterial1.get(2);
//        
//        n2 = paramMaterial2.get(0);
//        k2 = paramMaterial2.get(1);
//        d2 = paramMaterial2.get(2);
//        
//        nol = paramStructure.get(0);
//        angle = paramStructure.get(1);
////        wlimUpper = paramStructure.get(1);
////        wlimLower = paramStructure.get(2);
//    }
 
    public void setps(double n,double k) {
        ps.real = n;
        ps.imag = k;
        
    }

}