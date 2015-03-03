/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waveplate;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JPanel;

/**
 *
 * @author Horang
 */
public class DrawPhase extends JPanel {
    private double angle = 0;
    
//    private double xreal = 0;
//    private double ximag = 0;
//    private double yreal = 0;
//    private double yimag = 0;
    
    private double Ex;
    private double Ey;
    private double phase;
    private double pi = Math.PI;
    
    
    
    private double omega = 1;

 
    
    DrawPhase() {
    }

    DrawPhase(double inangle, double inphasediff) {
        Ex = Math.cos(inangle);
        Ey = Math.sin(inangle);
        phase = inphasediff;
    }
    
    public void setParam(double inangle, double inphasediff) {
        Ex = Math.cos(inangle);
        Ey = Math.sin(inangle);
        phase = inphasediff;
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(0,0,getWidth()-1,getHeight()-1);
        g2.setColor(Color.black);
        g2.drawRect(0,0,getWidth()-1,getHeight()-1);
        
        g2.setColor(Color.lightGray);
        
        int circlediameter = 20;
        g2.fillOval(getWidth()/2 - circlediameter/2, getHeight()/2 - circlediameter/2, circlediameter, circlediameter);
        
        g2.setStroke(new BasicStroke(2f));
        g2.drawLine(1, getHeight()/2, getWidth()-2, getHeight()/2);
        g2.drawLine(getWidth()/2, 1, getWidth()/2, getHeight()-2);
        
        g2.setColor(new Color(91,155,213));
        
        int angleres = 50;
        for (int i = 0 ; i < angleres ; i++) {
            double anglediff = 2.0 * pi / (double) angleres;

            g2.setStroke(new BasicStroke(3f));
            g2.drawLine(
                    Xcoordinate(Ex*Math.sin(i * anglediff)), 
                    Ycoordinate(-1*Ey*Math.sin(i * anglediff-phase)), 
                    Xcoordinate(Ex*Math.sin((i+1) * anglediff)), 
                    Ycoordinate(-1*Ey*Math.sin((i+1)*anglediff-phase))
            );
        }
   
        
    }
    
    private int Xcoordinate(double ix) {
        int xmax = getWidth()-1;
        //return (int)((ix+1)/2.0)*xmax;
        return Math.round((float)((ix+1.0)/2.0*xmax));
        
    }
    
    private int Ycoordinate(double iy) {
        int ymax = getHeight()-1;
        // return (int)((iy+1)/2.0*ymax);
        return Math.round((float)((iy+1.0)/2.0*ymax));        
    }
    
    
}
