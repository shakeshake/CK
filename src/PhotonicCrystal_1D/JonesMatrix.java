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
    
    Complex matrix[][];
    
    
    
    public JonesMatrix(){
        
    }
    
    static JonesMatrix product(JonesMatrix jm1, JonesMatrix jm2) {
        JonesMatrix jmtmp = new JonesMatrix();
        
        Complex matrix[][] = new Complex[2][2];
        Complex matrix1[][] = jm1.getmatrix();
        Complex matrix2[][] = jm2.getmatrix();

        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                
                matrix[i][j]=Complex.add(matrix1[i][0].product(matrix2[0][j]) , matrix1[i][1].product(matrix2[1][j]));
                
            }
        }
        
        jmtmp.setmatrix(matrix);
        
        return jmtmp;
        
    } // 아.. 전혀 객체지향적이지 않네... 나중에 바꿔야지
    
    public JonesMatrix product(JonesMatrix jm2) {
        return this.product(this, jm2);
    }
    
    
    static JonesMatrix add(JonesMatrix jm1, JonesMatrix jm2) {
        JonesMatrix jmtmp = new JonesMatrix();
        
        Complex matrix[][] = new Complex[2][2];
        Complex matrix1[][] = jm1.getmatrix();
        Complex matrix2[][] = jm2.getmatrix();

        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
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

        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
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
    
    
    
    
    
    
}

class Complex {
    double real, imag;
    public Complex(){
        
    } 

    public Complex(double re, double im){
        real = re;
        imag = im;
    }
    
    static Complex product(Complex a, Complex b) { 
        return new Complex(a.real*b.real - a.imag*b.imag , a.real*b.imag + a.imag*b.real); 
    }
    
    public Complex product(Complex b) {
        return this.product(this, b);
    }
    
    static Complex add(Complex a, Complex b) {
        return new Complex(a.real+b.real,a.imag+b.imag);
    }
    
    public Complex add(Complex b) {
        return this.product(this, b);
    }
    
    static Complex substrate(Complex a, Complex b) {
        return new Complex(a.real-b.real, a.imag-b.imag);
    }
    
    public Complex substrate(Complex b) {
        return this.substrate(this,b);
    }
    
}