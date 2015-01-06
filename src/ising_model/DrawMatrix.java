/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ising_model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import java.util.Random;
import static sun.swing.SwingUtilities2.drawRect;


/**
 *
 * @author Horang
 */
public class DrawMatrix extends JPanel{

    private int matrixsize = 50;
    private double J = 2;
    private Boolean[][] Matrix = new Boolean[matrixsize][matrixsize];
    




    private static Random rand = new Random();
    
    
    
//    public DrawMatrix() {
//        
//    }
    
    public DrawMatrix(int syssize) {
        matrixsize = syssize;
        Matrix = new Boolean[matrixsize][matrixsize];
    }
    
    public void setMatrix(Boolean[][] iMatrix) {
        Matrix = iMatrix;
        matrixsize = Matrix.length;
    }
    
    
        
    public void set_rand_matrix() {
        
        for (int i=0;i<matrixsize;i++) {
            for (int j=0;j<matrixsize;j++) {
                Matrix[i][j] =  rand.nextBoolean();
                
            }
        }
    }
    
    
    
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        for (int i=0;i<matrixsize;i++) {
            for (int j=0;j<matrixsize;j++) {
                if (Matrix[i][j]==true) {
                    g2.setPaint(Color.RED);
                }
                else {
                    g2.setPaint(Color.BLACK);
                }
                
                g2.fill(new Rectangle2D.Float(getWidth()/matrixsize*i, getHeight()/matrixsize*j, getWidth()/matrixsize, getHeight()/matrixsize));
                
                
            }
        }
        
        
        
    }
    
    
    
    
}
