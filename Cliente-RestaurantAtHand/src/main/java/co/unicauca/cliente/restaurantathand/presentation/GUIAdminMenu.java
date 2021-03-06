/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.domain.entity.Admin;
import co.unicauca.cliente.restaurantathand.domain.entity.Dish;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.entity.User;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beca98
 */
public class GUIAdminMenu extends javax.swing.JFrame {

    /*
     * Administrador
     */
    
    public  Admin admin;
    /**
     * Creates new form GUIAdminMenu
     */
    public Restaurant restaurante;
    
    public Menu menu;
    
    public GUIAdminMenu() {
        initComponents();
    }
    
    public GUIAdminMenu(Menu menu) {
        initComponents();
        this.menu = menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGestRestaurant = new javax.swing.JMenu();
        mnuCrearRest = new javax.swing.JMenuItem();
        mnuGestCrearMenu = new javax.swing.JMenu();
        mnuCrearMenu = new javax.swing.JMenuItem();
        mnuListarMenu = new javax.swing.JMenuItem();
        mnuGestCrearPlato = new javax.swing.JMenu();
        mnuCrearPlato = new javax.swing.JMenuItem();
        mnuListarPlato = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        dskEscritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout dskEscritorioLayout = new javax.swing.GroupLayout(dskEscritorio);
        dskEscritorio.setLayout(dskEscritorioLayout);
        dskEscritorioLayout.setHorizontalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        dskEscritorioLayout.setVerticalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        getContentPane().add(dskEscritorio);

        mnuGestRestaurant.setText("Gestionar Restaurante");

        mnuCrearRest.setText("Crear Restaurante");
        mnuCrearRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearRestActionPerformed(evt);
            }
        });
        mnuGestRestaurant.add(mnuCrearRest);

        jMenuBar1.add(mnuGestRestaurant);

        mnuGestCrearMenu.setText("Gestion Menu");

        mnuCrearMenu.setText("Crear Menu");
        mnuCrearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearMenuActionPerformed(evt);
            }
        });
        mnuGestCrearMenu.add(mnuCrearMenu);

        mnuListarMenu.setText("Listar Menu");
        mnuListarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarMenuActionPerformed(evt);
            }
        });
        mnuGestCrearMenu.add(mnuListarMenu);

        jMenuBar1.add(mnuGestCrearMenu);

        mnuGestCrearPlato.setText("Gestion Plato");

        mnuCrearPlato.setText("Crear Plato");
        mnuCrearPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearPlatoActionPerformed(evt);
            }
        });
        mnuGestCrearPlato.add(mnuCrearPlato);

        mnuListarPlato.setText("Listar Plato");
        mnuListarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarPlatoActionPerformed(evt);
            }
        });
        mnuGestCrearPlato.add(mnuListarPlato);

        jMenuBar1.add(mnuGestCrearPlato);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCrearRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearRestActionPerformed
        // TODO add your handling code here:
        GUICrearRest1 objCrearRest  = new GUICrearRest1(admin);
        dskEscritorio.add(objCrearRest);
        
        try {
                objCrearRest.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            objCrearRest.show();
        
    }//GEN-LAST:event_mnuCrearRestActionPerformed

    private void mnuCrearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearMenuActionPerformed
        // TODO add your handling code here:
        GUICrearMenu objCrearMenu  = new GUICrearMenu(restaurante);
        dskEscritorio.add(objCrearMenu);
        
        try {
                objCrearMenu.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objCrearMenu.show();
    }//GEN-LAST:event_mnuCrearMenuActionPerformed

    private void mnuCrearPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearPlatoActionPerformed
        // TODO add your handling code here:
        GUICrearPlato objCrearPlato  = new GUICrearPlato(menu);
        dskEscritorio.add(objCrearPlato);
        
        try {
                objCrearPlato.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objCrearPlato.show();
    }//GEN-LAST:event_mnuCrearPlatoActionPerformed

    private void mnuListarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarMenuActionPerformed
        // TODO add your handling code here:
          GUIListarMenu objListarMenu  = new GUIListarMenu();
        dskEscritorio.add(objListarMenu);
        
        try {
                objListarMenu.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objListarMenu.show();
    }//GEN-LAST:event_mnuListarMenuActionPerformed

    private void mnuListarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarPlatoActionPerformed
        // TODO add your handling code here:
          GUIListarPlato objListarPlato  = new GUIListarPlato();
        dskEscritorio.add(objListarPlato);
        
        try {
                objListarPlato.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objListarPlato.show();
    }//GEN-LAST:event_mnuListarPlatoActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAdminMenu().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCrearMenu;
    private javax.swing.JMenuItem mnuCrearPlato;
    private javax.swing.JMenuItem mnuCrearRest;
    private javax.swing.JMenu mnuGestCrearMenu;
    private javax.swing.JMenu mnuGestCrearPlato;
    private javax.swing.JMenu mnuGestRestaurant;
    private javax.swing.JMenuItem mnuListarMenu;
    private javax.swing.JMenuItem mnuListarPlato;
    // End of variables declaration//GEN-END:variables
}
