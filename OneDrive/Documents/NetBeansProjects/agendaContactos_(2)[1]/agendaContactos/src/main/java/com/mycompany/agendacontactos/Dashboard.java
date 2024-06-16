/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendacontactos;

import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


public class Dashboard extends javax.swing.JFrame {

    
    
    public Dashboard() {
        initComponents();
        // Se utiliza para centrar la ventana
        this.setLocationRelativeTo(null);
        // Instancias de los iconos
        crearIcono(icDashboard, "1.png");
        crearIcono(icElements, "2.png");
        crearIcono(icComponents, "3.png");
        crearIcono(icFormStuff, "4.png");
        crearIcono(icDateTable, "5.png");
        crearIcono(icIcon, "6.png");
        crearIcono(icSamplePage, "7.png");
        crearIcono(icExtra, "8.png");
        crearIcono(icMore, "9.png");
        crearIcono(icLogOut, "10.png");
         
        // Instancia del logo
        crearLogo(icLogo, "logo.png");
    }
    
    // Metodo para agregar los iconos
    public void crearIcono(JLabel label, String icono){
    URL recursos = getClass().getResource("/icon/"+icono);
    ImageIcon imgIcono = new ImageIcon(Toolkit.getDefaultToolkit().getImage(recursos).getScaledInstance(20, 20,Image.SCALE_SMOOTH ));
   
    label.setText("");
    label.setIcon(imgIcono);
    }
    
    // Metodo para agregar el logo
    public void crearLogo(JLabel label, String logo){
    URL logotipo = getClass().getResource("/icon/"+logo);
    ImageIcon imgIcono = new ImageIcon(Toolkit.getDefaultToolkit().getImage(logotipo).getScaledInstance(30, 30,Image.SCALE_SMOOTH ));
   
    label.setText("");
    label.setIcon(imgIcono);
    }
    
    
   
    
   /* public void iconSetUp(){
    URL Dashboard = getClass().getResource("/icon/1.png");
    ImageIcon icDash = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Dashboard).getScaledInstance(20, 20,Image.SCALE_SMOOTH ));
   
    icDashboard.setText("");
    icDashboard.setIcon(icDash);
    
    // Icono dos
    URL Elements = getClass().getResource("/icon/2.png");
    ImageIcon icE = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Elements).getScaledInstance(20, 20,Image.SCALE_SMOOTH ));
   
    icElements.setText("");
    icElements.setIcon(icE);
    
    
    //Icono tres
    URL Components = getClass().getResource("/icon/3.png");
    ImageIcon icC = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Components).getScaledInstance(20, 20,Image.SCALE_SMOOTH ));
   
    icComponents.setText("");
    icComponents.setIcon(icC);
    
    
    }
    
    
    */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sider = new javax.swing.JPanel();
        icLogo = new javax.swing.JLabel();
        icDashboard = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        icElements = new javax.swing.JLabel();
        elements = new javax.swing.JLabel();
        icComponents = new javax.swing.JLabel();
        Components = new javax.swing.JLabel();
        icFormStuff = new javax.swing.JLabel();
        formsStuff = new javax.swing.JLabel();
        icDateTable = new javax.swing.JLabel();
        dateTable = new javax.swing.JLabel();
        Icons = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        samplePage = new javax.swing.JLabel();
        icIcon = new javax.swing.JLabel();
        icSamplePage = new javax.swing.JLabel();
        extra = new javax.swing.JLabel();
        more = new javax.swing.JLabel();
        icExtra = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        icMore = new javax.swing.JLabel();
        icLogOut = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        Sider.setBackground(new java.awt.Color(0, 0, 102));

        icLogo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        icLogo.setForeground(new java.awt.Color(204, 204, 255));
        icLogo.setText("Mi Logo Tipo");

        icDashboard.setText("Icono");

        dashboard.setForeground(new java.awt.Color(204, 204, 255));
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        icElements.setText("Icono");

        elements.setForeground(new java.awt.Color(204, 204, 255));
        elements.setText("Ui Elementos");
        elements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elementsMouseClicked(evt);
            }
        });

        icComponents.setText("Icono");

        Components.setForeground(new java.awt.Color(204, 204, 255));
        Components.setText("Components");
        Components.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Components.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComponentsMouseClicked(evt);
            }
        });

        icFormStuff.setText("Icono");

        formsStuff.setForeground(new java.awt.Color(204, 204, 255));
        formsStuff.setText("Forms Stuff");
        formsStuff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        formsStuff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formsStuffMouseClicked(evt);
            }
        });

        icDateTable.setText("Icono");

        dateTable.setForeground(new java.awt.Color(204, 204, 255));
        dateTable.setText("Date Table");
        dateTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTableMouseClicked(evt);
            }
        });

        Icons.setForeground(new java.awt.Color(204, 204, 255));
        Icons.setText("Icons");
        Icons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Icons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconsMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("My Data");

        samplePage.setForeground(new java.awt.Color(204, 204, 255));
        samplePage.setText("Sample page");
        samplePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        samplePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samplePageMouseClicked(evt);
            }
        });

        icIcon.setText("Icono");

        icSamplePage.setText("Icono");

        extra.setForeground(new java.awt.Color(204, 204, 255));
        extra.setText("Extra");
        extra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extraMouseClicked(evt);
            }
        });

        more.setForeground(new java.awt.Color(204, 204, 255));
        more.setText("More");
        more.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        more.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreMouseClicked(evt);
            }
        });

        icExtra.setText("Icono");

        logout.setForeground(new java.awt.Color(204, 204, 255));
        logout.setText("LogOut");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        icMore.setText("Icono");

        icLogOut.setText("Icono");

        javax.swing.GroupLayout SiderLayout = new javax.swing.GroupLayout(Sider);
        Sider.setLayout(SiderLayout);
        SiderLayout.setHorizontalGroup(
            SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SiderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icFormStuff, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(formsStuff, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Components, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icDateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Icons, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icSamplePage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(samplePage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icMore, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addComponent(icLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SiderLayout.createSequentialGroup()
                                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icElements, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elements, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(SiderLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        SiderLayout.setVerticalGroup(
            SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiderLayout.createSequentialGroup()
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SiderLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icElements, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elements, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Components, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icFormStuff, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formsStuff, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icDateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(icLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Icons, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icSamplePage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samplePage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icMore, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // Ventana de los Componentes
    private void ComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComponentsMouseClicked
        // TODO add your handling code here:
         JInternalFrame ventana = new JInternalFrame("Components", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComponentsMouseClicked

    // Ventana de las formas
    private void formsStuffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formsStuffMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("forms Stuff", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formsStuffMouseClicked

    // Ventana de tabla de edades o Date Table
    private void dateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTableMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Date Table", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateTableMouseClicked

    // Ventana de Iconos
    private void IconsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconsMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Icons", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IconsMouseClicked

    // Ventana de pagina de ejemplo
    private void samplePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samplePageMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Sample Page", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_samplePageMouseClicked

    // Ventana de Extra
    private void extraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Extra", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extraMouseClicked

    // Ventana de mas
    private void moreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("More", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moreMouseClicked

    // Ventana para cerrar sesion
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Log Out", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutMouseClicked

    // Ventana del elemento
    private void elementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elementsMouseClicked
        // TODO add your handling code here:
        JInternalFrame ventana = new JInternalFrame("Elements", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_elementsMouseClicked

    // Ventana del Dashboard
    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        
         JInternalFrame ventana = new JInternalFrame("Dashboard", true, true, true, true);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        
        Content.add(ventana);
        
        try {
            ventana.setSelected(true);
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dashboardMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Components;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Icons;
    private javax.swing.JPanel Sider;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel dateTable;
    private javax.swing.JLabel elements;
    private javax.swing.JLabel extra;
    private javax.swing.JLabel formsStuff;
    private javax.swing.JLabel icComponents;
    private javax.swing.JLabel icDashboard;
    private javax.swing.JLabel icDateTable;
    private javax.swing.JLabel icElements;
    private javax.swing.JLabel icExtra;
    private javax.swing.JLabel icFormStuff;
    private javax.swing.JLabel icIcon;
    private javax.swing.JLabel icLogOut;
    private javax.swing.JLabel icLogo;
    private javax.swing.JLabel icMore;
    private javax.swing.JLabel icSamplePage;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel more;
    private javax.swing.JLabel samplePage;
    // End of variables declaration//GEN-END:variables
}
