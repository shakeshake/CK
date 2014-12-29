/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//import pkg1d.photonic.crystal.MThumbSlider;

/**
 *
 * @author Horang
 */
public class opticalbandgap extends javax.swing.JApplet {

    
    private List<Double> tdata;
    private List<Double> rdata;
    CalcOpt1D optConst = new CalcOpt1D();
    
    /**
     * Initializes the applet opticalbandgap
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
            java.util.logging.Logger.getLogger(opticalbandgap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opticalbandgap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opticalbandgap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opticalbandgap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    
                    //CalcOptConst optConst = new CalcOptConst();
                    
                    updateAllParam();
                    graphRefreshAll();
                    

            
                    
                    
                    
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    

    public void graphRefresh(java.awt.Panel graph, List<Double> data) {
        
        updateAllParam();
        graph.setPreferredSize(new Dimension(450,260));
        
        graph.removeAll();
        graph.setLayout(new java.awt.BorderLayout());
        //GraphPanel tmpgraph = new GraphPanel(data);
        GraphPanel gpanel = new GraphPanel(data);

        gpanel.setXoffset(300);        
        gpanel.setXmultiplier((double)(1500-300)/data.size());
        
        graph.add(gpanel, BorderLayout.CENTER);
//        graph.add(new GraphPanel(data), BorderLayout.CENTER);

        graph.validate();
    }   
    
    public void graphRefreshAll() {
        //graphRefresh(panel_tgraph,optConst.testdata(50,10));  
        updateAllParam();
        
        graphRefresh(panel_tgraph,optConst.calcT(1000));
        //System.out.println(optConst.calcT(10));
//        graphRefresh(panel_rgraph,optConst.testdata(50,10)); /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //graphRefresh(panel_rgraph,optConst.calcR(100));
        
        // Change test method to calculating method after make it!
    }
    
    
//   public void updateAllParam() {
//       // Method to update parameters from values on each interface.  
//   }
//   
   public void updateAllParam() {
       
        optConst.n1 = Double.valueOf(n_txtbox1.getText());
        optConst.k1 = Double.valueOf(k_txtbox1.getText());
        optConst.d1 = Double.valueOf(d_txtbox1.getText());
                
        optConst.n2 = Double.valueOf(n_txtbox2.getText());
        optConst.k2 = Double.valueOf(k_txtbox2.getText());
        optConst.d2 = Double.valueOf(d_txtbox2.getText());        
        
        optConst.ps.real = Double.valueOf(n_txtbox3.getText());
        optConst.ps.imag = Double.valueOf(k_txtbox3.getText());       
        
        
        optConst.nol = Integer.valueOf(nol_txtbox.getText());
//        optConst.wlimLower = 1000;  // in nanometer. Modified to be changable in the future
//        optConst.wlimUpper = 300;   // also, in nanometer
        
//        optConst.angle = (double) angle_slider.getValue();
        optConst.angle = Double.valueOf(angle_txtbox.getText()) * 3.14159/180;
        
        //System.out.printf("n=%f , k=%f , d = %f , nol = %d , angle = %d \n",optConst.n1,optConst.k1, optConst.d1,optConst.nol, optConst.angle);        
    }
  
    
    
    
    
    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_material1 = new javax.swing.JPanel();
        n_txtbox1 = new javax.swing.JTextField();
        n_slider1 = new javax.swing.JSlider();
        n_label1 = new javax.swing.JLabel();
        k_slider1 = new javax.swing.JSlider();
        k_txtbox1 = new javax.swing.JTextField();
        k_label2 = new javax.swing.JLabel();
        d_label1 = new javax.swing.JLabel();
        d_txtbox1 = new javax.swing.JTextField();
        d_slider1 = new javax.swing.JSlider();
        m_label1 = new javax.swing.JLabel();
        jPanel_material2 = new javax.swing.JPanel();
        n_txtbox2 = new javax.swing.JTextField();
        n_slider2 = new javax.swing.JSlider();
        n_label2 = new javax.swing.JLabel();
        k_slider2 = new javax.swing.JSlider();
        k_txtbox2 = new javax.swing.JTextField();
        k_label3 = new javax.swing.JLabel();
        d_label2 = new javax.swing.JLabel();
        d_txtbox2 = new javax.swing.JTextField();
        d_slider2 = new javax.swing.JSlider();
        m_label2 = new javax.swing.JLabel();
        jPanel_etc = new javax.swing.JPanel();
        nol_slider = new javax.swing.JSlider();
        nol_txtbox = new javax.swing.JTextField();
        d_label3 = new javax.swing.JLabel();
        angle_slider = new javax.swing.JSlider();
        angle_txtbox = new javax.swing.JTextField();
        d_label4 = new javax.swing.JLabel();
        panel_tgraph = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_material3 = new javax.swing.JPanel();
        n_txtbox3 = new javax.swing.JTextField();
        n_slider3 = new javax.swing.JSlider();
        n_label3 = new javax.swing.JLabel();
        k_slider3 = new javax.swing.JSlider();
        k_txtbox3 = new javax.swing.JTextField();
        k_label4 = new javax.swing.JLabel();
        m_label3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel_material1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n_txtbox1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        n_txtbox1.setText("2.7");
        n_txtbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_txtbox1ActionPerformed(evt);
            }
        });

        n_slider1.setMaximum(500);
        n_slider1.setMinimum(100);
        n_slider1.setValue(270);
        n_slider1.setPreferredSize(new java.awt.Dimension(170, 23));
        n_slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                n_slider1StateChanged(evt);
            }
        });

        n_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n_label1.setText("n");

        k_slider1.setMaximum(50);
        k_slider1.setValue(0);
        k_slider1.setPreferredSize(new java.awt.Dimension(170, 23));
        k_slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                k_slider1StateChanged(evt);
            }
        });

        k_txtbox1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        k_txtbox1.setText("0");
        k_txtbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_txtbox1ActionPerformed(evt);
            }
        });

        k_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        k_label2.setText("k");

        d_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        d_label1.setText("d (nm)");

        d_txtbox1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        d_txtbox1.setText("80");
        d_txtbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_txtbox1ActionPerformed(evt);
            }
        });

        d_slider1.setMaximum(150);
        d_slider1.setValue(80);
        d_slider1.setPreferredSize(new java.awt.Dimension(170, 23));
        d_slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                d_slider1StateChanged(evt);
            }
        });

        m_label1.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        m_label1.setText("Material 1");

        javax.swing.GroupLayout jPanel_material1Layout = new javax.swing.GroupLayout(jPanel_material1);
        jPanel_material1.setLayout(jPanel_material1Layout);
        jPanel_material1Layout.setHorizontalGroup(
            jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material1Layout.createSequentialGroup()
                        .addComponent(n_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material1Layout.createSequentialGroup()
                        .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d_label1)
                            .addComponent(k_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_material1Layout.createSequentialGroup()
                                .addComponent(k_txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_material1Layout.createSequentialGroup()
                                .addComponent(d_txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel_material1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_material1Layout.setVerticalGroup(
            jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(m_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(n_txtbox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n_label1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(k_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k_txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(k_label2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_material1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(d_txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d_label1))
                    .addComponent(d_slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_material2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n_txtbox2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        n_txtbox2.setText("1.6");
        n_txtbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_txtbox2ActionPerformed(evt);
            }
        });

        n_slider2.setMaximum(500);
        n_slider2.setMinimum(100);
        n_slider2.setValue(160);
        n_slider2.setPreferredSize(new java.awt.Dimension(170, 23));
        n_slider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                n_slider2StateChanged(evt);
            }
        });

        n_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n_label2.setText("n");

        k_slider2.setMaximum(50);
        k_slider2.setValue(0);
        k_slider2.setPreferredSize(new java.awt.Dimension(170, 23));
        k_slider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                k_slider2StateChanged(evt);
            }
        });

        k_txtbox2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        k_txtbox2.setText("0");
        k_txtbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_txtbox2ActionPerformed(evt);
            }
        });

        k_label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        k_label3.setText("k");

        d_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        d_label2.setText("d (nm)");

        d_txtbox2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        d_txtbox2.setText("90");
        d_txtbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_txtbox2ActionPerformed(evt);
            }
        });

        d_slider2.setMaximum(1000);
        d_slider2.setValue(90);
        d_slider2.setPreferredSize(new java.awt.Dimension(170, 23));
        d_slider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                d_slider2StateChanged(evt);
            }
        });

        m_label2.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        m_label2.setText("Material 2");

        javax.swing.GroupLayout jPanel_material2Layout = new javax.swing.GroupLayout(jPanel_material2);
        jPanel_material2.setLayout(jPanel_material2Layout);
        jPanel_material2Layout.setHorizontalGroup(
            jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material2Layout.createSequentialGroup()
                        .addComponent(n_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material2Layout.createSequentialGroup()
                        .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d_label2)
                            .addComponent(k_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_material2Layout.createSequentialGroup()
                                .addComponent(k_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_material2Layout.createSequentialGroup()
                                .addComponent(d_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel_material2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_label2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_material2Layout.setVerticalGroup(
            jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(m_label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n_label2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(k_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(k_label3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_material2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(d_txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d_label2))
                    .addComponent(d_slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_etc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_etc.setPreferredSize(new java.awt.Dimension(326, 125));

        nol_slider.setMaximum(10);
        nol_slider.setValue(5);
        nol_slider.setPreferredSize(new java.awt.Dimension(170, 23));
        nol_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nol_sliderStateChanged(evt);
            }
        });

        nol_txtbox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nol_txtbox.setText("5");
        nol_txtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nol_txtboxActionPerformed(evt);
            }
        });

        d_label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        d_label3.setText("Number of layers");

        angle_slider.setMaximum(90);
        angle_slider.setValue(0);
        angle_slider.setPreferredSize(new java.awt.Dimension(170, 23));
        angle_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                angle_sliderStateChanged(evt);
            }
        });

        angle_txtbox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        angle_txtbox.setText("0");
        angle_txtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angle_txtboxActionPerformed(evt);
            }
        });

        d_label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        d_label4.setText("Incidence angle");

        javax.swing.GroupLayout jPanel_etcLayout = new javax.swing.GroupLayout(jPanel_etc);
        jPanel_etc.setLayout(jPanel_etcLayout);
        jPanel_etcLayout.setHorizontalGroup(
            jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_etcLayout.createSequentialGroup()
                .addGroup(jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_etcLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d_label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nol_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nol_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_etcLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d_label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angle_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angle_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_etcLayout.setVerticalGroup(
            jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_etcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nol_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d_label3))
                    .addComponent(nol_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(angle_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(angle_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d_label4)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panel_tgraph.setPreferredSize(new java.awt.Dimension(450, 260));

        javax.swing.GroupLayout panel_tgraphLayout = new javax.swing.GroupLayout(panel_tgraph);
        panel_tgraph.setLayout(panel_tgraphLayout);
        panel_tgraphLayout.setHorizontalGroup(
            panel_tgraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panel_tgraphLayout.setVerticalGroup(
            panel_tgraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Transmittance");

        jPanel_material3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n_txtbox3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        n_txtbox3.setText("1.7");
        n_txtbox3.setToolTipText("");
        n_txtbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_txtbox3ActionPerformed(evt);
            }
        });

        n_slider3.setMaximum(500);
        n_slider3.setMinimum(150);
        n_slider3.setValue(170);
        n_slider3.setPreferredSize(new java.awt.Dimension(170, 23));
        n_slider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                n_slider3StateChanged(evt);
            }
        });

        n_label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n_label3.setText("n");

        k_slider3.setValue(10);
        k_slider3.setPreferredSize(new java.awt.Dimension(170, 23));
        k_slider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                k_slider3StateChanged(evt);
            }
        });

        k_txtbox3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        k_txtbox3.setText("0.10");
        k_txtbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_txtbox3ActionPerformed(evt);
            }
        });

        k_label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        k_label4.setText("k");

        m_label3.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        m_label3.setText("Substrate");

        javax.swing.GroupLayout jPanel_material3Layout = new javax.swing.GroupLayout(jPanel_material3);
        jPanel_material3.setLayout(jPanel_material3Layout);
        jPanel_material3Layout.setHorizontalGroup(
            jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material3Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material3Layout.createSequentialGroup()
                        .addComponent(n_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_txtbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_material3Layout.createSequentialGroup()
                        .addComponent(k_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k_txtbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k_slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel_material3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_label3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_material3Layout.setVerticalGroup(
            jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_material3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(m_label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n_slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n_txtbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n_label3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(k_slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_material3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k_txtbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(k_label4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_tgraph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_material2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_material1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_etc, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jPanel_material3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_material1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_material2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_material3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_etc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_tgraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
// EVENT of Control panel for material 1
// EVENT of Control panel for material 1
// EVENT of Control panel for material 1   
    private void n_slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_n_slider1StateChanged
        // TODO add your handling code here:
        // String sliderval = String.valueOf((double)(n_slider1.getValue()) / 100.);
        String sliderval = String.format("%.2f",(double)(n_slider1.getValue())/100.);
        n_txtbox1.setText(sliderval);
        graphRefreshAll();
                     
    }//GEN-LAST:event_n_slider1StateChanged

    private void n_txtbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_txtbox1ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(n_txtbox1.getText());
        n_slider1.setValue((int)(tmp)*100);
        graphRefreshAll();

    }//GEN-LAST:event_n_txtbox1ActionPerformed

    private void k_slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_k_slider1StateChanged
        // TODO add your handling code here:
        //String sliderval = String.valueOf((double)(k_slider1.getValue()) / 100.);
        String sliderval = String.format("%.2f",(double)(k_slider1.getValue())/100.);
        k_txtbox1.setText(sliderval);
        graphRefreshAll();
    }//GEN-LAST:event_k_slider1StateChanged

    private void k_txtbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_txtbox1ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(k_txtbox1.getText());
        k_slider1.setValue((int)(tmp)*10);
        graphRefreshAll();
    }//GEN-LAST:event_k_txtbox1ActionPerformed

    private void d_txtbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_txtbox1ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(d_txtbox1.getText());
        d_slider1.setValue((int)(tmp)*1);     
        graphRefreshAll();
    }//GEN-LAST:event_d_txtbox1ActionPerformed

    private void d_slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_d_slider1StateChanged
        // TODO add your handling code here:
 
        //String sliderval = String.valueOf((double)(d_slider1.getValue()) / 1.);
        String sliderval = String.format("%.0f",(double)(d_slider1.getValue())/1.);
        d_txtbox1.setText(sliderval);
        graphRefreshAll();
    }//GEN-LAST:event_d_slider1StateChanged

    
// EVENT of Control panel for material 2
// EVENT of Control panel for material 2
// EVENT of Control panel for material 2 
    private void n_txtbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_txtbox2ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(n_txtbox2.getText());
        n_slider2.setValue((int)(tmp)*100);
        graphRefreshAll();
    }//GEN-LAST:event_n_txtbox2ActionPerformed

    private void n_slider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_n_slider2StateChanged
        // TODO add your handling code here:
        String sliderval = String.format("%.2f",(double)(n_slider2.getValue())/100.);
        n_txtbox2.setText(sliderval);
        graphRefreshAll();
    }//GEN-LAST:event_n_slider2StateChanged

    private void k_slider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_k_slider2StateChanged
        // TODO add your handling code here:
        String sliderval = String.format("%.2f",(double)(k_slider2.getValue())/100.);
        k_txtbox2.setText(sliderval);        
     
        graphRefreshAll();
    }//GEN-LAST:event_k_slider2StateChanged

    private void k_txtbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_txtbox2ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(k_txtbox2.getText());
        k_slider2.setValue((int)(tmp)*10);        
    
        graphRefreshAll();
    }//GEN-LAST:event_k_txtbox2ActionPerformed

    private void d_txtbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_txtbox2ActionPerformed
        // TODO add your handling code here:
        double tmp = Double.valueOf(d_txtbox2.getText());
        d_slider2.setValue((int)(tmp)*1);           

        graphRefreshAll();
    }//GEN-LAST:event_d_txtbox2ActionPerformed

    private void d_slider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_d_slider2StateChanged
        // TODO add your handling code here:
        String sliderval = String.format("%.0f",(double)(d_slider2.getValue())/1.);
        d_txtbox2.setText(sliderval);        
        
        graphRefreshAll();
    }//GEN-LAST:event_d_slider2StateChanged

    private void nol_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nol_sliderStateChanged
        // TODO add your handling code here:
        String sliderval = String.format("%.0f",(double)(nol_slider.getValue())/1.);
        nol_txtbox.setText(sliderval);     

        graphRefreshAll();
        
    }//GEN-LAST:event_nol_sliderStateChanged

    
// Event of Control panel for etc.
    private void nol_txtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nol_txtboxActionPerformed

                
        graphRefreshAll();
        
        
        
    }//GEN-LAST:event_nol_txtboxActionPerformed

    private void angle_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_angle_sliderStateChanged
 
        String sliderval = String.format("%.0f",(double)(angle_slider.getValue())/1.);
        angle_txtbox.setText(sliderval);        
                
        graphRefreshAll();        
        
        
    }//GEN-LAST:event_angle_sliderStateChanged

    private void angle_txtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angle_txtboxActionPerformed

        double tmp = Double.valueOf(angle_txtbox.getText());
        angle_slider.setValue((int)(tmp)*1);           
        
        graphRefreshAll();        
    }//GEN-LAST:event_angle_txtboxActionPerformed

    private void n_txtbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_txtbox3ActionPerformed

        double tmp = Double.valueOf(n_txtbox3.getText());
        n_slider3.setValue((int)(tmp)*100);
        graphRefreshAll();
    }//GEN-LAST:event_n_txtbox3ActionPerformed

    private void n_slider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_n_slider3StateChanged

        String sliderval = String.format("%.2f",(double)(n_slider3.getValue())/100.);
        n_txtbox3.setText(sliderval);
        graphRefreshAll();        
    }//GEN-LAST:event_n_slider3StateChanged

    private void k_slider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_k_slider3StateChanged

        String sliderval = String.format("%.2f",(double)(k_slider3.getValue())/100.);
        k_txtbox3.setText(sliderval);        
     
        graphRefreshAll();        
    }//GEN-LAST:event_k_slider3StateChanged

    private void k_txtbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_txtbox3ActionPerformed

        double tmp = Double.valueOf(k_txtbox3.getText());
        k_slider3.setValue((int)(tmp)*10);        
    
        graphRefreshAll();        
    }//GEN-LAST:event_k_txtbox3ActionPerformed


    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider angle_slider;
    private javax.swing.JTextField angle_txtbox;
    private javax.swing.JLabel d_label1;
    private javax.swing.JLabel d_label2;
    private javax.swing.JLabel d_label3;
    private javax.swing.JLabel d_label4;
    private javax.swing.JSlider d_slider1;
    private javax.swing.JSlider d_slider2;
    private javax.swing.JTextField d_txtbox1;
    private javax.swing.JTextField d_txtbox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_etc;
    private javax.swing.JPanel jPanel_material1;
    private javax.swing.JPanel jPanel_material2;
    private javax.swing.JPanel jPanel_material3;
    private javax.swing.JLabel k_label2;
    private javax.swing.JLabel k_label3;
    private javax.swing.JLabel k_label4;
    private javax.swing.JSlider k_slider1;
    private javax.swing.JSlider k_slider2;
    private javax.swing.JSlider k_slider3;
    private javax.swing.JTextField k_txtbox1;
    private javax.swing.JTextField k_txtbox2;
    private javax.swing.JTextField k_txtbox3;
    private javax.swing.JLabel m_label1;
    private javax.swing.JLabel m_label2;
    private javax.swing.JLabel m_label3;
    private javax.swing.JLabel n_label1;
    private javax.swing.JLabel n_label2;
    private javax.swing.JLabel n_label3;
    private javax.swing.JSlider n_slider1;
    private javax.swing.JSlider n_slider2;
    private javax.swing.JSlider n_slider3;
    private javax.swing.JTextField n_txtbox1;
    private javax.swing.JTextField n_txtbox2;
    private javax.swing.JTextField n_txtbox3;
    private javax.swing.JSlider nol_slider;
    private javax.swing.JTextField nol_txtbox;
    private java.awt.Panel panel_tgraph;
    // End of variables declaration//GEN-END:variables
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//class GraphPanel extends JPanel {    
//    
//// Parameters for plotting a graph    
////    private int width = 800;
////    private int heigth = 400;
//    private int padding = 25;  // margin on each side... 
//    private int labelPadding = 25;   // margin on axis side...
//    private Color lineColor = new Color(44, 102, 230, 180);
//    private Color pointColor = new Color(100, 100, 100, 180);
//    private Color gridColor = new Color(200, 200, 200, 200);
//    private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
//    private int pointWidth = 0; 
//    private int numberYDivisions = 10;
//    private List<Double> plotdata;
//    private double x_offset = 0;
//    private double x_multiplier = 1;
// 
//    private String x_format = "%.0f";
//    public GraphPanel(List<Double> plotdata) {
//        this.plotdata = plotdata;
//      
//    }
//
//  
//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
// 
//        double xScale = ((double) getWidth() - (2 * padding) - labelPadding) / (plotdata.size() - 1);
//        double yScale = ((double) getHeight() - 2 * padding - labelPadding) / (getMaxScore() - getMinScore());
//         
// 
//        List<Point> graphPoints = new ArrayList<>();
//        for (int i = 0; i < plotdata.size(); i++) {
//            int x1 = (int) (i * xScale + padding + labelPadding);
//            int y1 = (int) ((getMaxScore() - plotdata.get(i)) * yScale + padding);
//            graphPoints.add(new Point(x1, y1));
//        }
// 
//        // draw white background
//        g2.setColor(Color.WHITE);
//        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
//        g2.setColor(Color.BLACK);
// 
//        // create hatch marks and grid lines for y axis.
//        for (int i = 0; i < numberYDivisions + 1; i++) {
//            int x0 = padding + labelPadding;
//            int x1 = pointWidth + padding + labelPadding;
//            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
//            int y1 = y0;
//            if (plotdata.size() > 0) {
//                g2.setColor(gridColor);
//                g2.drawLine(padding + labelPadding + 1 + pointWidth, y0, getWidth() - padding, y1);
//                g2.setColor(Color.BLACK);
//                String yLabel = ((int) ((getMinScore() + (getMaxScore() - getMinScore()) * ((i * 1.0) / numberYDivisions)) * 100)) / 100.0 + "";
//                FontMetrics metrics = g2.getFontMetrics();
//                int labelWidth = metrics.stringWidth(yLabel);
//                g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3);
//            }
//            g2.drawLine(x0, y0, x1, y1);
//        }
// 
//        // and for x axis
//        for (int i = 0; i < plotdata.size()+1; i++) {
//            if (plotdata.size() > 1) {
//                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (plotdata.size() - 1) + padding + labelPadding;
//                int x1 = x0;
//                int y0 = getHeight() - padding - labelPadding;
//                int y1 = y0 - pointWidth;
//                //if ((i % ((int) ((plotdata.size() / 20.0)) + 1)) == 0) {
//                if ((i % 100 ) == 0) {    
//                    g2.setColor(gridColor);
//                    g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - pointWidth, x1, padding);
//                    g2.setColor(Color.BLACK);
//                    String xLabel = String.format(x_format,x_multiplier*i+ x_offset) + "";   ///  change x_offset if wavelength region have to be changed....
//                    FontMetrics metrics = g2.getFontMetrics();
//                    int labelWidth = metrics.stringWidth(xLabel);
//                    
//                    g2.drawString(xLabel, x0 - labelWidth / 2, y0 + metrics.getHeight() + 3);
//                }
//                g2.drawLine(x0, y0, x1, y1);
//            }
//        }
//        
//        
// 
//        // create x and y axes 
//        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
//        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);
// 
//        Stroke oldStroke = g2.getStroke();
//        g2.setColor(lineColor);
//        g2.setStroke(GRAPH_STROKE);
//        for (int i = 0; i < graphPoints.size() - 1; i++) {
//            int x1 = graphPoints.get(i).x;
//            int y1 = graphPoints.get(i).y;
//            int x2 = graphPoints.get(i + 1).x;
//            int y2 = graphPoints.get(i + 1).y;
//            g2.drawLine(x1, y1, x2, y2);
//        }
// 
//        g2.setStroke(oldStroke);
//        g2.setColor(pointColor);
//        for (int i = 0; i < graphPoints.size(); i++) {
//            int x = graphPoints.get(i).x - pointWidth / 2;
//            int y = graphPoints.get(i).y - pointWidth / 2;
//            int ovalW = pointWidth;
//            int ovalH = pointWidth;
//            g2.fillOval(x, y, ovalW, ovalH);
//        }
//    }
// 
////    @Override
////    public Dimension getPreferredSize() {
////        return new Dimension(width, heigth);
////    }
// 
//    private double getMinScore() {
//        double minScore = Double.MAX_VALUE;
//        for (Double score : plotdata) {
//            minScore = Math.min(minScore, score);
//        }
//        // return minScore;
//        //return Math.floor(minScore/10)*10; // For making min value increase by 10
//        return 0;
//    }
// 
//    private double getMaxScore() {
//        double maxScore = Double.MIN_VALUE;
//        for (Double score : plotdata) {
//            maxScore = Math.max(maxScore, score);
//        }
//        // return maxScore;
//        // return Math.ceil(maxScore/10)*10;  // For making max value increase by 10
//        return 100.0;
//    }
// 
//    public void setScores(List<Double> plotdata) {
//        this.plotdata = plotdata;
//        invalidate();
//        this.repaint();
//    }
// 
//    public List<Double> getScores() {
//        return plotdata;
//    }
//    
//    public void setXmultiplier(double xm) {
//        x_multiplier = xm;
//    }
//    
//    public void setXoffset(double offset) {
//        x_offset = offset;
//    }
//    
//    public void setXformat(String formatstring) {
//        x_format = formatstring;
//    }
//    
//    
////    static void createAndShowGui(javax.swing.JPanel panel) {   // Garbage...
//////    static void createAndShowGui() {        
//////    default static void createAndShowGui() {
////        List<Double> plotdata = new ArrayList<>();
////        Random random = new Random();   
////        int maxDataPoints = 10;
////        int maxScore = 10;
////           
////        
////        for (int i = 0; i < maxDataPoints; i++) {
////            plotdata.add((double) random.nextDouble() * maxScore);
//////            plotdata.add((double) i);
////        }  // Make garbage data in here
////
////        JFrame frame = new JFrame("DrawGraph");
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.getContentPane().add(mainPanel);
////        frame.pack();
////        frame.setLocationRelativeTo(null);
////        frame.setVisible(true);     
////    }






