/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Horang
 */


public class DrawingPanel extends JPanel {
    
    double angle;
    private int padding = 25;
    private double boxnarrowside = 0.4;
    private double boxheight = 0.3;
    //private int x_offset = 0;
    private int y_offset = 0;
    private double linelength;  // 100 is temporary value. MUST initialize;
    private int material1_thickness = 20;
    private int material2_thickness = 50;
    private int substrate_thickness = 30;
    private int nol = 0; // the number of layer
    
    public DrawingPanel(double angle) {
        this.angle = angle;      
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int width = (int)getWidth();
        int height = (int)getHeight();
        linelength = getWidth()*0.5-padding;
        
        //g2.drawLine(padding, height-1*padding-substrate_thickness-y_offset, width-padding, height-1*padding-substrate_thickness-y_offset); // bottom side
        g2.drawLine(padding, height-1*padding-substrate_thickness-y_offset, (int)(width*0.5-boxnarrowside*width*0.5),(int)(height-1*padding-boxheight*height-substrate_thickness-y_offset));  // left side
        g2.drawLine(width-padding, height-1*padding-substrate_thickness-y_offset, (int)(width*0.5+boxnarrowside*width*0.5), (int)(height-1*padding-boxheight*height-substrate_thickness-y_offset));  // right side
        g2.drawLine( (int)(width*0.5-boxnarrowside*width*0.5),(int)(height-1*padding-boxheight*height-substrate_thickness-y_offset), (int)(width*0.5+boxnarrowside*width*0.5), (int)(height-1*padding-boxheight*height-substrate_thickness-y_offset));  // top side
        
        g2.drawRect(padding, height-1*padding-substrate_thickness, width-2*padding,substrate_thickness);
        
        for (int i = 0 ; i < nol ; i++) {
            g2.drawRect(padding, height-1*padding-1*substrate_thickness-(material1_thickness+material2_thickness)*i-(material1_thickness+material2_thickness), width-2*padding, material2_thickness);
            g2.drawRect(padding, height-1*padding-1*substrate_thickness-(material1_thickness+material2_thickness)*i-material2_thickness, width-2*padding, material1_thickness);
        }
        g2.drawRect(0,0, 100, 200);
        
        double xf = (width*0.5);
        double yf = ((height-1*padding-boxheight*height+ height-1*padding)*0.5 - linelength-substrate_thickness);
        double xi = width*0.5;
        double yi = (height-1*padding-boxheight*height+ height-1*padding)*0.5-substrate_thickness;
        g2.drawLine((int)(xi), (int)(yi-y_offset), (int)(xf), (int)(yf-y_offset) );  // perpendicular line
        
        
        
        
        double incident_x = -1*((xf-xi)*Math.cos(angle) - (yf-yi)*Math.sin(angle))+xi;
        double incident_y = ((xf-xi)*Math.sin(angle) + (yf-yi)*Math.cos(angle))+yi;
        
        g2.drawLine((int)(width*0.5), (int)((height-1*padding-boxheight*height+ height-1*padding)*0.5-y_offset-substrate_thickness), (int)(incident_x), (int)(incident_y-y_offset-substrate_thickness));
        
        
        
      
        
        //g2.drawLine(0, 0, 100, 100);
      
        
    }
    
    public void set_yoffset(int offset) {
        y_offset = offset;
        
    }
    
    public void set_thickenss_material1(int thickness) {
        
    }
    
    public void set_thickness_material2(int thickness) { 
        
    }
    
    public void set_number_of_layer(int inol) {
        nol = inol;
        
    }
    
}
