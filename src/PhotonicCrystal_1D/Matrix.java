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
public class Matrix {
    



      
//                 |  [0][0]    [0][1]  |
//    Structure =  |                    |
//                 |  [1][0]    [1][1]  |
    
    double matrix[][];
    
    
    
    public Matrix(){
        
    }
    
    public Matrix product(Matrix jm1, Matrix jm2) {
        Matrix jmtmp = new Matrix();
        
        double matrix[][] = new double[2][2];
        double matrix1[][] = jm1.getmatrix();
        double matrix2[][] = jm2.getmatrix();

        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                matrix[i][j]=matrix1[i][0]*matrix2[0][j] + matrix1[i][1]*matrix2[1][j];
            }
        }
        
        jmtmp.setmatrix(matrix);
        
        return jmtmp;
        
    } // 아.. 전혀 객체지향적이지 않네... 나중에 바꿔야지
        
    public double[][] getmatrix() {
        return matrix;
    }
    
    public void setmatrix(double imatrix[][]) {
        matrix = imatrix;
    }
    
    
    
    
    
    
}

