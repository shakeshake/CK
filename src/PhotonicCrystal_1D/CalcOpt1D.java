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
    public double angle;
    double pi = 3.14159;
//    public int wlimUpper, wlimLower; // Wavelength limit to calculate...
    
    public CalcOpt1D(){
   
    }
   
     
    public CalcOpt1D(List<Double> paramMaterial1, List<Double> paramMaterial2, List<Integer> paramStructure) {
// ===========================
//      ParamMaterial
// ===========================
//      0 : n1
//      1 : k1
//      2 : d1
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
        //JonesMatrix testt = new JonesMatrix();
        angle = paramStructure.get(3);
        
        
             
    }
    
    static List<Double> testdata(int nOfData, double maxValue) {
        
        List<Double> testdata = new ArrayList<>();
        Random random = new Random();
        int maxDataPoints = nOfData;
        //double maxScore = maxvalue;
                     
        for (int i = 0; i < maxDataPoints; i++) {
            //double tempnum;
            testdata.add((double) random.nextDouble() * maxValue);
            
//            plotdata.add((double) i);
        }  // Making data in here
        
        return testdata;
    }
    
//    public List<Double> testdata(int nOfData) {
//        
//        //return this.testdata(nOfData, 100);
//        return this.testdata(nOfData, 100);
//    }
    
    //HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE 
    public Matrix matrixCalc() { // HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE 
        Matrix matrix = new Matrix();
        //matrix[0][0].
        return matrix;
    }
    //HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE HERE 
    
    
    
    
    
    
        
    static List<Double> calcT(List<Double> params) { // for transmittance
        List<Double> tran = new ArrayList<>();

        
        
        return tran;
    }
    
    static List<Double> calcR(List<Double> params) { // for reflectance
        List<Double> refl = new ArrayList<>();
        
        return refl;
    }
    
    public void updateParam(List<Double> paramMaterial1, List<Double> paramMaterial2, List<Integer> paramStructure) {
    // 아... 이건 고민 좀 해보자... 
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
    

}