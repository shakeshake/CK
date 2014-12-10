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
public class Complex {

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