/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

/**
 *
 * @author sanghun
 */
public class JonesMatrix { 
//                 |  [0][0]    [0][1]  |
//    Structure =  |                    |
//                 |  [1][0]    [1][1]  | 
    Complex matrix[][] = new Complex[2][2];
    

    Complex N;   // N = n - ik
    double d; // thickness
    double theta;
    
//    Complex p;
    
    private static double pi = 3.14159;

//    double lambda;
  
//////////////////////////////////////////////////////////////////////////    
    
    
    public JonesMatrix(){        
//        matrix= new Complex();
    }
    
    
    public JonesMatrix(double in, double ik, double id, double itheta) {
        N = new Complex(in,-1*ik); 
        d = id;
        theta = itheta;
//        p = N.product(Math.cos(theta));
    }
    
    
    
    static JonesMatrix product(JonesMatrix jm1, JonesMatrix jm2) {
        JonesMatrix jmtmp = new JonesMatrix();
        
        Complex matrix[][] = new Complex[2][2];
        Complex matrix1[][] = jm1.getmatrix();
        Complex matrix2[][] = jm2.getmatrix();

//        for (int i=0 ; i<2 ; i++) {
//            for (int j=0 ; j<2 ; j++) {
//                
//                matrix[i][j]=Complex.add(matrix1[i][0].product(matrix2[0][j]) , matrix1[i][1].product(matrix2[1][j]));
//                
//            }
//        }
        
        matrix[0][0] = Complex.add(matrix1[0][0].product(matrix2[0][0]),matrix1[0][1].product(matrix2[1][0]));
        matrix[0][1] = Complex.add(matrix1[0][0].product(matrix2[0][1]),matrix1[0][1].product(matrix2[1][1]));
        matrix[1][0] = Complex.add(matrix1[1][0].product(matrix2[0][0]),matrix1[1][1].product(matrix2[1][0]));
        matrix[1][1] = Complex.add(matrix1[1][0].product(matrix2[0][1]),matrix1[1][1].product(matrix2[1][1]));        
        
        jmtmp.setmatrix(matrix);
        
        return jmtmp;
        
    } 
    
    
    
    public JonesMatrix product(JonesMatrix jm2) {
        return this.product(this, jm2);
    }
    
    
    
    static JonesMatrix add(JonesMatrix jm1, JonesMatrix jm2) {
        JonesMatrix jmtmp = new JonesMatrix();
        
        Complex matrix[][] = new Complex[2][2];
        Complex matrix1[][] = jm1.getmatrix();
        Complex matrix2[][] = jm2.getmatrix();

        for (int i=0 ; i<2 ; i++) {
            for (int j=0 ; j<2 ; j++) {
                matrix[i][j]=Complex.add(matrix1[i][j],matrix2[i][j]);
            }
        }
        
        jmtmp.setmatrix(matrix);
        
        return jmtmp;        
    }
    
    
    
    public JonesMatrix add(JonesMatrix jm2) {
        return this.product(this, jm2);
    }
    
    
    
    static JonesMatrix substrate(JonesMatrix jm1, JonesMatrix jm2) {
        JonesMatrix jmtmp = new JonesMatrix();
        
        Complex matrix[][] = new Complex[2][2];
        Complex matrix1[][] = jm1.getmatrix();
        Complex matrix2[][] = jm2.getmatrix();

        for (int i=0 ; i<2 ; i++) {
            for (int j=0 ; j<2 ; j++) {
                matrix[i][j]=Complex.substrate(matrix1[i][j],matrix2[i][j]);
            }
        }
        
        jmtmp.setmatrix(matrix);
        
        return jmtmp;                
    }
    
    
    
    public JonesMatrix substrate(JonesMatrix jm2) {
        return this.substrate(this, jm2);
    }
    
    
        
    public Complex[][] getmatrix() {
        return matrix;
    }
    
    
    
    public void setmatrix(Complex imatrix[][]) {
        matrix = imatrix;
    }
    
 
    
    public void setmatrix(double lambda) {
//        double lambda = ilambda;
        Complex J = new Complex(0,1);
        Complex temp1, temp2;
        Complex a;
                
        Complex p = N.product(Math.cos(theta));        
        a = p.product((double) (2.0 * pi / lambda) * d);
        matrix[0][0] = a.cos();
       
        temp1 = J.product(p.inverse());
        matrix[0][1] = temp1.product(a.sin());        
        
        temp2 = J.product(p);
        matrix[1][0] = temp2.product(a.sin());
        
        matrix[1][1] = matrix[0][0];
        
    }
    

  public void show() {
      System.out.printf("%f+i%f\t%f+i%f\n%f+i%f\t%f+i%f\n", matrix[0][0].real,matrix[0][0].imag,matrix[0][1].real,matrix[0][1].imag,matrix[1][0].real,matrix[1][0].imag,matrix[1][1].real,matrix[1][1].imag);
              
  }

  
  public Complex[][] inverse() {
      Complex tmp = (matrix[0][0].product(matrix[1][1])).substrate(matrix[0][1].product(matrix[1][0]));
      tmp = tmp.inverse();
      
      Complex MM[][] = {{matrix[1][1].product(tmp),matrix[0][1].product(-1).product(tmp)},{matrix[1][0].product(-1).product(tmp),matrix[0][0].product(tmp)}};
      
      
//      JonesMatrix returnM = new JonesMatrix();
//      returnM.setmatrix(MM);
      
      return MM;
      
  }
 
  
}

