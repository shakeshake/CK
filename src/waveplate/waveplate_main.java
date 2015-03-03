/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waveplate;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Horang
 */
public class waveplate_main extends javax.swing.JApplet {
    
    private double amplangle;
    private double phasediff;
    
    private double nx;
    private double ny;
    
    private double kd;
    
    private double tranampangle;
    private double tranphasediff;
  
  
  

    /**
     * Initializes the applet waveplate_main
     */
    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(waveplate_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waveplate_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waveplate_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waveplate_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    amplangle = Math.toRadians((double)(jSlider_angle.getValue()));
                    phasediff = Math.toRadians((double)(jSlider_phase.getValue()));
                    nx = (double)(jSlider_nx.getValue())/1000.0 + 1.5;
                    ny = (double)(jSlider_ny.getValue())/1000.0 + 1.5;
                    kd = (double)(jSlider_thickness.getValue()) * 2.0 * Math.PI;
                    txtFieldUpdate();
                    
                    refreshPhasePlot(panel_inc, amplangle, phasediff);
                    refreshPhasePlot(panel_trans,amplangle,calcBirefringence());
                    //refreshPhasePlot(panel1, Math.toRadians((double)jSlider_angle.getValue()), Math.toRadians((double)jSlider_phase.getValue()) );
                    
                    
                    
           
                    
                    
                    
                    
                    
                    
//                    panel1.setPreferredSize(new Dimension(776,453));
//                    
//                    //draw.removeAll();
//                    
//                    //panel1.setLayout(new java.awt.BorderLayout());
//        
//                       
//                
//                    panel1.add(panel1, BorderLayout.CENTER);
//                    draw = (Graphics2D) panel1.getGraphics();
//                    
//                    //panel1.validate();
//                    draw.setColor(Color.black);
//                    draw.fillRect(0,0,getWidth()-1,getHeight()-1);
//                    
                    
                    
     
                    //draw.fillRect(0,0,100,100);
                    
                    
                    
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

 
    
    
    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSlider_phase = new javax.swing.JSlider();
        jSlider_thickness = new javax.swing.JSlider();
        jSlider_nx = new javax.swing.JSlider();
        jSlider_angle = new javax.swing.JSlider();
        jSlider_ny = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nx = new javax.swing.JTextField();
        jTextField_ny = new javax.swing.JTextField();
        jTextField_thickness = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        panel_inc = new java.awt.Panel();
        panel_trans = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSlider_phase.setMaximum(90);
        jSlider_phase.setValue(0);
        jSlider_phase.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_phaseStateChanged(evt);
            }
        });

        jSlider_thickness.setMaximum(1100);
        jSlider_thickness.setMinimum(990);
        jSlider_thickness.setValue(1010);
        jSlider_thickness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_thicknessStateChanged(evt);
            }
        });

        jSlider_nx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_nxStateChanged(evt);
            }
        });

        jSlider_angle.setMaximum(90);
        jSlider_angle.setToolTipText("");
        jSlider_angle.setValue(45);
        jSlider_angle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_angleStateChanged(evt);
            }
        });

        jSlider_ny.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_nyStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waveplate/nx.JPG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waveplate/ny.JPG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waveplate/dlambda.JPG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waveplate/amratio.JPG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waveplate/pdiff.JPG"))); // NOI18N

        jTextField_nx.setEditable(false);
        jTextField_nx.setText("jTextField1");

        jTextField_ny.setEditable(false);
        jTextField_ny.setText("jTextField2");
        jTextField_ny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nyActionPerformed(evt);
            }
        });

        jTextField_thickness.setEditable(false);
        jTextField_thickness.setText("1000");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Properties of Incident light");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("Properties of waveplate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider_angle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSlider_phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider_ny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSlider_nx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_thickness)
                            .addComponent(jTextField_ny)
                            .addComponent(jTextField_nx)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSlider_nx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_nx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_ny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSlider_ny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jSlider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_thickness, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSlider_angle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSlider_phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_incLayout = new javax.swing.GroupLayout(panel_inc);
        panel_inc.setLayout(panel_incLayout);
        panel_incLayout.setHorizontalGroup(
            panel_incLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        panel_incLayout.setVerticalGroup(
            panel_incLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_transLayout = new javax.swing.GroupLayout(panel_trans);
        panel_trans.setLayout(panel_transLayout);
        panel_transLayout.setHorizontalGroup(
            panel_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        panel_transLayout.setVerticalGroup(
            panel_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setText("Incident light");

        jLabel7.setText("Transmitted light");

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setText("Waveplate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(panel_inc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_trans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_inc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider_angleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_angleStateChanged
        // TODO add your handling code here:
        amplangle = Math.toRadians((double)jSlider_angle.getValue());
        refreshPhasePlot(panel_inc, amplangle, phasediff);
        
        refreshPhasePlot(panel_trans,amplangle,calcBirefringence());
        txtFieldUpdate();
    }//GEN-LAST:event_jSlider_angleStateChanged

    private void jSlider_phaseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_phaseStateChanged
        // TODO add your handling code here:
        phasediff = Math.toRadians((double)jSlider_phase.getValue());
        refreshPhasePlot(panel_inc, amplangle, phasediff);    
        refreshPhasePlot(panel_trans,amplangle,calcBirefringence());
        txtFieldUpdate();
    }//GEN-LAST:event_jSlider_phaseStateChanged

    private void jSlider_nxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_nxStateChanged
        // TODO add your handling code here:
        nx = (double)(jSlider_nx.getValue())/1000.0 + 1.5;
        //System.out.println(nx);
        refreshPhasePlot(panel_inc, amplangle, phasediff);    
        refreshPhasePlot(panel_trans,amplangle,calcBirefringence());     
        txtFieldUpdate();
    }//GEN-LAST:event_jSlider_nxStateChanged

    private void jSlider_nyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_nyStateChanged
        // TODO add your handling code here:
        ny = (double)(jSlider_ny.getValue())/1000.0 + 1.5;
        //System.out.println(ny);
        refreshPhasePlot(panel_inc, amplangle, phasediff);    
        refreshPhasePlot(panel_trans,amplangle,calcBirefringence());      
        txtFieldUpdate();
    }//GEN-LAST:event_jSlider_nyStateChanged

    private void jSlider_thicknessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_thicknessStateChanged
        // TODO add your handling code here:
        kd = (double)(jSlider_thickness.getValue()) * 2.0 * Math.PI;
        
        //System.out.println(kd);
        refreshPhasePlot(panel_inc, amplangle, phasediff);    
        refreshPhasePlot(panel_trans,amplangle,calcBirefringence());   
        txtFieldUpdate();
    }//GEN-LAST:event_jSlider_thicknessStateChanged

    private void jTextField_nyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider_angle;
    private javax.swing.JSlider jSlider_nx;
    private javax.swing.JSlider jSlider_ny;
    private javax.swing.JSlider jSlider_phase;
    private javax.swing.JSlider jSlider_thickness;
    private javax.swing.JTextField jTextField_nx;
    private javax.swing.JTextField jTextField_ny;
    private javax.swing.JTextField jTextField_thickness;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Panel panel_inc;
    private java.awt.Panel panel_trans;
    // End of variables declaration//GEN-END:variables

//    public void paintComponent(Graphics g) {
//        
//        
//    }
  
    private void refreshPhasePlot(java.awt.Panel graph, double inangle, double inphase) {
        // The angle describes amplitude ratio of a wave. Ex = cos[angle], Ey = sin[angle]
        // The phase describes phase difference between Ex and Ey.
        // Ex = cos[angle] sin[omega * t] , Ey = sin[angle] sin[omega*t - phase]
        // omega is for speed of oscillation of the wave.
        
        graph.setPreferredSize(new Dimension(345,345));
        graph.removeAll();
        graph.setLayout(new java.awt.BorderLayout());
        
        
        DrawPhase gpanel = new DrawPhase(inangle, inphase);
        gpanel.setParam(inangle, inphase);
        //DrawPhase gpanel = new DrawPhase(xreal,ximag,yreal,yimag);
        //gpanel.setTitle(Title);
        //gpanel.setXoffset(xoffset);
        graph.add(gpanel, BorderLayout.CENTER);
        graph.validate();
        
        
    }
    
    private double calcBirefringence() {
        //double m11 = Math.sin(nx * 2*Math.PI * thickness);
        //double m22 = Math.sin(ny * 2*Math.PI * thickness);
        
        //double tmpanglediff = Math.acos( Math.cos(phasediff) * Math.sin(ny * kd) / Math.sin(nx * kd) );
        //double tmpanglediff = Math.acos(Math.cos(phasediff) - Math.sin(phasediff)) * Math.sin(ny * kd) / Math.sin(nx * kd) ;
        double tmpanglediff = (kd * (ny-nx));
        System.out.println(tmpanglediff);
        return tmpanglediff;
        
        
    }
    
    private void txtFieldUpdate() {
        //String sliderval = String.format("%.2f",(double)(n_slider1.getValue())/100.);
        jTextField_nx.setText(String.format("%.3f", nx));
        jTextField_ny.setText(String.format("%.3f", ny));
        jTextField_thickness.setText(String.format("%.0f", kd/(2.0*Math.PI)));
        
    }
    
}
//
//class draw_background {
//        int d = 10;      // thickness of waveplate. width of box.
//        int dgraph = 100;       // width of box for phase diagram of waves.
//        
//        
//        
//        
//        //@Override
//        public void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            
//        }
//        
//    }