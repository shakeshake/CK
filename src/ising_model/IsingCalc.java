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
public class IsingCalc {
    private double temperature = 0;
    private int systemsize = 50;
    private final Boolean[][] SysMat =  new Boolean[systemsize][systemsize];            
    private double J=2;
        
    static Random rand = new Random();
    
    
    public IsingCalc() {
        
    }
    
    public float get_netEnergy() {
        float sumEnergy = 0;
        for (int i=0 ; i<systemsize ; i++) {
            for (int j=0 ; j<systemsize ; j++) {
                sumEnergy -= deltaU(i,j);
            }
        }
        return sumEnergy/(systemsize^2);
    }
    
    
    public int get_netMagnetization() {
        int sumMagnetization = 0;
        for (int i = 0 ; i < systemsize ; i++) {
            for (int j = 0 ; j < systemsize ; j++) {
                if (SysMat[i][j]==true) {
                    sumMagnetization++;
                } else {
                    sumMagnetization--;
                }
                
            }
        }
        return sumMagnetization;
    }
    
    
    
    
    
    public void set_temperature(double temp) {
        temperature = temp;
    }
    
    public double get_temperature() {
        return temperature;
    }
    
    public void setJ(double iJ) {
        J = iJ;
    }
    

    public void set_rand_matrix() {
        for (int i=0;i<systemsize;i++) {
            for (int j=0;j<systemsize;j++) {
                SysMat[i][j] =  rand.nextBoolean();
            }
        }
    }
    
    
    public int getSystemSize() {
        return systemsize;
    }

    public void setSystemSize(int systemsize) {
        this.systemsize = systemsize;
    }
    
    public void metroIsing() {
        int i = rand.nextInt(systemsize);
        int j = rand.nextInt(systemsize);
        
        if (deltaU(i, j) < 0) {
            SysMat[i][j] = !SysMat[i][j];
        } 
        else if(rand.nextDouble() < Math.exp(-1*deltaU(i, j)/temperature) ) {
            SysMat[i][j] = !SysMat[i][j];
        }
        
    }
    
    public Boolean[][] getMatrix() {
        return SysMat;
    }
    
    
    private double deltaU(int i, int j) {
        int top, bottom, left, right, center;
            
        if (i==0) { 
            left = SysMat[systemsize-1][j]? 1:-1;
        } else {
            left = SysMat[i-1][j]? 1:-1;
        }
        
        if (i==systemsize-1) {
            right = SysMat[0][j]? 1:-1;
        } else {
            right = SysMat[i+1][j]? 1:-1;
        }
        
        if (j==0) {
            top = SysMat[i][systemsize-1]? 1:-1;            
        } else {
            top = SysMat[i][j-1]? 1:-1;
        }
        
        if(j==systemsize-1) {
            bottom = SysMat[i][0]? 1:-1;
        } else {
            bottom = SysMat[i][j+1]? 1:-1;
        }
        
        center = SysMat[i][j]? 1:-1;
                
        
        return J*center*(top+bottom+left+right);
    }

        
}
