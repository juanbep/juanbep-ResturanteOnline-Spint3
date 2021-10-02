/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IRestaurantAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Admin;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.service.RestaurantService;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beca98
 */
public class GUIListarRestaurantes1 extends javax.swing.JInternalFrame {

    /*
     * administrador del restaurante
     */
    private Admin admin;

    /**
     * Almacena una lista de restaurantes
     */
    private List<Restaurant> restaurants;

    /*
     * Restaurante seleccionado
     */
    private Restaurant restaurantSelect;

    /**
     *
     */
    private JDesktopPane dskEscritorio;

    /**
     * Creates new form GUIListarRestaurantes
     */
    ImageIcon iconobtnActualizar = new ImageIcon("src/main/java/resource/actualizar.jpeg");
    ImageIcon iconobtnMirarMenu = new ImageIcon("src/main/java/resource/mirarMenu.jpeg");
    ImageIcon iconobtnEliminar = new ImageIcon("src/main/java/resource/eliminar.jpeg");
    ImageIcon iconobtnSeleccionar = new ImageIcon("src/main/java/resource/seleccionar.jpeg");
    ImageIcon iconobtnMirarPlatos = new ImageIcon("src/main/java/resource/mirarPlato.jpeg");
    ImageIcon iconobtnCancelar = new ImageIcon("src/main/java/resource/cancelar.jpeg");
    ImageIcon iconolblLogo = new ImageIcon("src/main/java/resource/bienvenido.png");

    public GUIListarRestaurantes1() {
        initComponents();
        lblLogo.setIcon(iconolblLogo);
        btnActualizar.setIcon(iconobtnActualizar);
        btnMenu.setIcon(iconobtnMirarMenu);
        btnEliminar.setIcon(iconobtnEliminar);
        //    btnSeleccionar.setIcon(iconobtnSeleccionar);
        //  btnPlatos.setIcon(iconobtnMirarPlatos);
        btnRecargar.setIcon(iconobtnCancelar);
        this.tblListarRest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public GUIListarRestaurantes1(Admin admin) {
        initComponents();
        lblLogo.setIcon(iconolblLogo);
        btnActualizar.setIcon(iconobtnActualizar);
        btnMenu.setIcon(iconobtnMirarMenu);
        btnEliminar.setIcon(iconobtnEliminar);
        //  btnSeleccionar.setIcon(iconobtnSeleccionar);
        //  btnPlatos.setIcon(iconobtnMirarPlatos);
        btnRecargar.setIcon(iconobtnCancelar);
        this.admin = admin;
        cargarLista();
        cargarDatosTabla();
        admin.setRestaurants(restaurants);
        //  btnSeleccionar.setVisible(false);

        botones(false);
    }

    GUIListarRestaurantes1(JDesktopPane dskEscritorio, Admin admin) {
        initComponents();
        lblLogo.setIcon(iconolblLogo);
        btnActualizar.setIcon(iconobtnActualizar);
        btnMenu.setIcon(iconobtnMirarMenu);
        btnEliminar.setIcon(iconobtnEliminar);
        // btnSeleccionar.setIcon(iconobtnSeleccionar);
        //  btnPlatos.setIcon(iconobtnMirarPlatos);
        btnRecargar.setIcon(iconobtnCancelar);
        this.admin = admin;
        this.dskEscritorio = dskEscritorio;
        cargarLista();
        cargarDatosTabla();
        admin.setRestaurants(restaurants);
        //  btnSeleccionar.setVisible(false);
        botones(false);
    }

    private void botones(boolean var) {

        btnActualizar.setEnabled(var);
        btnEliminar.setEnabled(var);
        btnMenu.setEnabled(var);
        //btnPlatos.setEnabled(var);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSur = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListarRest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Restaurantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlSur.setLayout(new java.awt.GridLayout());

        tblListarRest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Restaurante", "Nombre", "Direccion", "Telefono", "Email", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarRest.setShowGrid(true);
        tblListarRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListarRestMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListarRest);

        pnlSur.add(jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(393, 140));
        jPanel1.setLayout(new java.awt.GridLayout(2, 3));

        btnMenu.setText("Ver Menus");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        btnActualizar.setText("Actualizar Restaurante");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar);

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecargar);

        pnlNorte.setBackground(new java.awt.Color(255, 255, 255));
        pnlNorte.setLayout(new java.awt.GridLayout());

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setMaximumSize(new java.awt.Dimension(393, 56));
        lblLogo.setMinimumSize(new java.awt.Dimension(393, 56));
        lblLogo.setPreferredSize(new java.awt.Dimension(393, 28));
        pnlNorte.add(lblLogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSur, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void seleccionRest() {
// TODO add your handling code here:
        int seleccionar = tblListarRest.getSelectedRow();
        restaurantSelect = restaurants.get(seleccionar);
        cargarLista();
        cargarDatosTabla();
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

        seleccionRest();
        GUICrearRest1 objActualizarRest = new GUICrearRest1(admin);
        objActualizarRest.restaurantUpdate = restaurantSelect;
        objActualizarRest.activarActualizar();

        dskEscritorio.add(objActualizarRest);
        try {
            objActualizarRest.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarRestaurantes1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarRestaurantes1.class.getName()).log(Level.SEVERE, null, ex);
        }
        objActualizarRest.show();

        botones(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
        cargarLista();
        cargarDatosTabla();
        botones(false);
    }//GEN-LAST:event_btnRecargarActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        seleccionRest();
        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            IRestaurantAccess service = Factory.getInstance().getRestaurantService();
            // Inyecta la dependencia
            RestaurantService restaurant = new RestaurantService(service);

            try {
                restaurant.delete(restaurantSelect.getAtrNitRest());
            } catch (Exception ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargarLista();
            cargarDatosTabla();
        }

        botones(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblListarRestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListarRestMouseClicked
        // TODO add your handling code here:
        botones(true);
    }//GEN-LAST:event_tblListarRestMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        seleccionRest();
        GUIListarMenu objListarMenu = new GUIListarMenu(dskEscritorio, restaurantSelect);
        dskEscritorio.add(objListarMenu);
        try {
            objListarMenu.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        objListarMenu.show();

    }//GEN-LAST:event_btnMenuActionPerformed

    /**
     * Carga un lista a traves de una API REST
     */
    private void cargarLista() {
        IRestaurantAccess service = Factory.getInstance().getRestaurantService();
        // Inyecta la dependencia
        RestaurantService restaurant = new RestaurantService(service);

        try {
            restaurants = restaurant.findRestaurantByUserAdmin(admin.getAtrUserName());
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }
    }

    public void cargarDatosTabla() {
        tblListarRest.setDefaultRenderer(Object.class, new Render());

        DefaultTableModel model = (DefaultTableModel) tblListarRest.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[6];
        for (Restaurant restaurent : restaurants) {
            rowData[0] = restaurent.getAtrNitRest();
            rowData[1] = restaurent.getAtrNameRest();
            rowData[2] = restaurent.getAtrAddressRest();
            rowData[3] = restaurent.getAtrMobileRest();
            rowData[4] = restaurent.getAtrEmailRest();
            rowData[5] = restaurent.getAtrCityRest();
            model.addRow(rowData);
        }
    }

    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListarRest;
    // End of variables declaration//GEN-END:variables
}
