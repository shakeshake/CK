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
    
    
    
    public double abs() {
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
        //return this.real*this.real + this.imag*this.imag;
    }
    
    
    
    public Complex inverse() {
        return new Complex(this.real/(this.real*this.real + this.imag*this.imag),-1*this.imag/(this.real*this.real + this.imag*this.imag));
    }
    
    
    
    static Complex product(Complex a, Complex b) { 
        return new Complex(a.real*b.real - a.imag*b.imag , a.real*b.imag + a.imag*b.real); 
    }
    
    
    
    public Complex product(Complex b) {
        return this.product(this, b);
    }
    
    
    
    public Complex product(Complex a, double b) {
        return new Complex (a.real * b , a.imag * b);
    }
    

    
    public Complex product(double b) {
        return this.product(this,b);
    }
    
    
    
    static Complex add(Complex a, Complex b) {
        return new Complex(a.real+b.real , a.imag+b.imag);
    }
    
    
    
    public Complex add(Complex a, double b) {
        return new Complex(a.real+b , a.imag);
    }
    
    
    
    public Complex add(Complex b) {
        return this.add(this, b);
    }
    
    
    
    static Complex substrate(Complex a, Complex b) {
        return new Complex(a.real-b.real, a.imag-b.imag);
    }
    
    
    
    public Complex substrate(Complex b) {
        return this.substrate(this,b);
    }
    
    
    
    private double cosh(double theta) { 
        return (Math.exp(theta)+Math.exp(-1*theta))/2 ;
    }
    
    
    
    private double sinh(double theta) {
        return (Math.exp(theta)-Math.exp(-1*theta))/2 ;
    }
    
    
    
    public Complex cos() {
        return new Complex (cosh(imag)*Math.cos(real) , -1*sinh(imag)*Math.sin(real));
        //return new Complex (cosh(this.imag)*Math.cos(this.real) , -1*sinh(this.imag)*Math.sin(this.real));
    }
    
    
    
    public Complex sin() {
        return new Complex (cosh(imag)*Math.sin(real) , sinh(imag)*Math.cos(real));
        //return new Complex (cosh(this.imag)*Math.sin(this.real) , sinh(this.imag)*Math.cos(this.real));
    }
    
    public void show() {
        System.out.printf("%f + i %f \n", this.real, this.imag);
    }

}