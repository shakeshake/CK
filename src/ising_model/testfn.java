/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ising_model;

import java.util.Random;

/**
 *
 * @author Horang
 */
public class testfn {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        int cnt = 0;
        Boolean r;
        for (int i = 0 ; i<100 ; i++) {
            r = rand.nextBoolean();
            if (r==true) {
                cnt++;
                
            }
            
            
            
            
            //System.out.println(rand.nextBoolean());
        }
        
        System.out.println(cnt);
        System.out.println(false? 1:-1);
        System.out.println(rand.nextDouble());
        Boolean[][] testmatrix = new Boolean[4][7];
        System.out.println(testmatrix.length);
        System.out.println(testmatrix[0].length);
        System.out.println(testmatrix[1].length);
        
        
    }
    
}
