/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

/**
 *
 * @author Horang
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JonesMatrix testm = new JonesMatrix();
        Complex a = new Complex(2,0);
        Complex b = new Complex(0,0);
        Complex c = new Complex(0,0);
        Complex d = new Complex(2,0);        
        Complex[][] mm = new Complex[2][2];
        mm[0][0] = a;
        mm[0][1] = b;
        mm[1][0] = c;
        mm[1][1] = d;
        
        testm.setmatrix(mm);

        testm.show();
        
        System.out.println();
        
        for(int i = 0 ; i<1 ; i++) {
            testm = testm.product(testm);
        }
        testm.show();
        
//        Complex t = new Complex(2,1);
//        System.out.println();
//        for (int i = 0 ; i < 10 ; i++){      
//            t= t.product(a);
//            t.show();
//        }
        
    }
    
}
