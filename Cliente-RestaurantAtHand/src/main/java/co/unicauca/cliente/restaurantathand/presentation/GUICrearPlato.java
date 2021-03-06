/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IMenuAccess;
import co.unicauca.cliente.restaurantathand.access.IPlatoAccess;
import co.unicauca.cliente.restaurantathand.access.IRestaurantAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Dish;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.entity.User;
import co.unicauca.cliente.restaurantathand.domain.service.MenuService;
import co.unicauca.cliente.restaurantathand.domain.service.PlatoService;
import co.unicauca.cliente.restaurantathand.domain.service.RestaurantService;
import co.unicauca.cliente.restaurantathand.infra.Messages;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import static co.unicauca.cliente.restaurantathand.infra.Messages.warningMessage;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Beca98
 */
public class GUICrearPlato extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICrearPlato
     */
    ImageIcon iconolbl = new ImageIcon("src/main/java/resource/crearplato.png");

    private Restaurant restaurante;
    private User Admin;
    private Menu menu;
    private Menu atrMenu;
    public Dish platoUpdate;

    public GUICrearPlato() {
        initComponents();
        lblLogo.setIcon(iconolbl);
        botones(false);
    }

    public GUICrearPlato(Menu menu) {
        initComponents();
        lblLogo.setIcon(iconolbl);
        botones(false);
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

        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        lblIdMenuPlato = new javax.swing.JLabel();
        txtIdMenuPlato = new javax.swing.JTextField();
        btnBuscarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIdPlato = new javax.swing.JLabel();
        txtIdPlato = new javax.swing.JTextField();
        lblReqIdPlato = new javax.swing.JLabel();
        lblNombrePlato = new javax.swing.JLabel();
        txtNombrePlato = new javax.swing.JTextField();
        lblReqNombrePlato = new javax.swing.JLabel();
        lblPrecioPlato = new javax.swing.JLabel();
        txtPrecioPlato = new javax.swing.JTextField();
        lblReqPrecioPlato = new javax.swing.JLabel();
        lblCategoriaPlato = new javax.swing.JLabel();
        cbxCategoriaPlato = new javax.swing.JComboBox<>();
        lblReqCategoriaPlato = new javax.swing.JLabel();
        lblDescripcionPlato = new javax.swing.JLabel();
        txtDescripcionPlato = new javax.swing.JTextField();
        lblReqDescripcionPlato = new javax.swing.JLabel();
        lblTipoPlato = new javax.swing.JLabel();
        cbxTipoPlato = new javax.swing.JComboBox<>();
        lblReqTipoPlato = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCrearPlato = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlNorte.setBackground(new java.awt.Color(255, 255, 255));
        pnlNorte.setLayout(new java.awt.GridLayout(1, 0));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlNorte.add(lblLogo);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentro.setLayout(new java.awt.GridLayout(13, 3));

        lblIdMenuPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdMenuPlato.setText("Id menu:");
        pnlCentro.add(lblIdMenuPlato);
        pnlCentro.add(txtIdMenuPlato);

        btnBuscarMenu.setText("Buscar");
        btnBuscarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMenuActionPerformed(evt);
            }
        });
        pnlCentro.add(btnBuscarMenu);
        pnlCentro.add(jLabel1);
        pnlCentro.add(jLabel2);
        pnlCentro.add(jLabel3);

        lblIdPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdPlato.setText("Id plato:");
        pnlCentro.add(lblIdPlato);
        pnlCentro.add(txtIdPlato);
        pnlCentro.add(lblReqIdPlato);

        lblNombrePlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePlato.setText("Nombre:");
        pnlCentro.add(lblNombrePlato);
        pnlCentro.add(txtNombrePlato);
        pnlCentro.add(lblReqNombrePlato);

        lblPrecioPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioPlato.setText("Precio:");
        pnlCentro.add(lblPrecioPlato);
        pnlCentro.add(txtPrecioPlato);
        pnlCentro.add(lblReqPrecioPlato);

        lblCategoriaPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoriaPlato.setText("Categoria:");
        pnlCentro.add(lblCategoriaPlato);

        cbxCategoriaPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Platos fuertes", "Ensaladas", "Postres", "Bebidas", " " }));
        cbxCategoriaPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaPlatoActionPerformed(evt);
            }
        });
        pnlCentro.add(cbxCategoriaPlato);
        pnlCentro.add(lblReqCategoriaPlato);

        lblDescripcionPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcionPlato.setText("Descripcion:");
        pnlCentro.add(lblDescripcionPlato);

        txtDescripcionPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionPlatoActionPerformed(evt);
            }
        });
        pnlCentro.add(txtDescripcionPlato);
        pnlCentro.add(lblReqDescripcionPlato);

        lblTipoPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoPlato.setText("Tipo plato:");
        pnlCentro.add(lblTipoPlato);

        cbxTipoPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especial", "Del d??a", "Completo", "Ejecutivo", " " }));
        pnlCentro.add(cbxTipoPlato);
        pnlCentro.add(lblReqTipoPlato);
        pnlCentro.add(jLabel4);
        pnlCentro.add(jLabel7);
        pnlCentro.add(jLabel8);
        pnlCentro.add(jLabel9);

        btnCrearPlato.setText("Crear ");
        btnCrearPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlatoActionPerformed(evt);
            }
        });
        pnlCentro.add(btnCrearPlato);
        pnlCentro.add(jLabel10);
        pnlCentro.add(jLabel11);

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        pnlCentro.add(btnGuardarCambios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMenuActionPerformed
        String idMenu = txtIdMenuPlato.getText();
        IMenuAccess service = Factory.getInstance().getMenuService();
        MenuService menuService = new MenuService(service);
        Menu menu = null;
        if (idMenu.equals("") || idMenu.isEmpty()) {

            Messages.warningMessage("ERROR Menu:  \nCampo vacios", "Warning");
            return;
        }

        try {
            menu = menuService.findMenu(idMenu);
        } catch (Exception ex) {
            Logger.getLogger(GUICrearPlato.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (menu != null) {
            IRestaurantAccess serviceR = Factory.getInstance().getRestaurantService();
            RestaurantService restaurantService = new RestaurantService(serviceR);
            Restaurant restaurant = new Restaurant();

            try {
                restaurant = restaurantService.findRestaurantByNit(menu.getAtrIdRest());
            } catch (Exception ex) {
                Logger.getLogger(GUICrearPlato.class.getName()).log(Level.SEVERE, null, ex);
            }
//            if (restaurant.getAtrAdmiRest().equals(Admin.getAtrUserName())) {
                botones(true);
                 
                btnGuardarCambios.setVisible(false);
                atrMenu = menu;
//            } else {
//                warningMessage("No es el administrador del Restaurante que tiene este menu", "Atenci??n");
//            }
        } else {
            warningMessage("No hay un menu registrado con ese nit", "Atenci??n");
        }
    }//GEN-LAST:event_btnBuscarMenuActionPerformed

    public void activarActualizar() {
        txtIdMenuPlato.setEnabled(false);
        btnBuscarMenu.setEnabled(false);
        txtIdPlato.setEnabled(true);
        txtNombrePlato.setEnabled(true);
        txtPrecioPlato.setEnabled(true);
        cbxCategoriaPlato.setEnabled(true);
        txtDescripcionPlato.setEnabled(true);
        cbxTipoPlato.setEnabled(true);
        btnCrearPlato.setVisible(false);
        btnGuardarCambios.setEnabled(true);
        llenarCampos();
    }

    public void limpiarCampos() {
        txtIdMenuPlato.setText("");
        btnBuscarMenu.setText("");
        txtIdPlato.setText("");
        txtNombrePlato.setText("");
        txtPrecioPlato.setText("");
        cbxCategoriaPlato.setSelectedIndex(0);
        txtDescripcionPlato.setText("");
        cbxTipoPlato.setSelectedIndex(0);
        btnCrearPlato.setText("");
        btnGuardarCambios.setEnabled(isIcon);

    }


    private void btnCrearPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlatoActionPerformed

        String idPlato = txtIdPlato.getText();
        String nombre = txtNombrePlato.getText();
        String precio = txtPrecioPlato.getText();
        String descripcion = txtDescripcionPlato.getText();
        String categoria = cbxCategoriaPlato.getSelectedItem().toString();
        String tipo = cbxTipoPlato.getSelectedItem().toString();

        if (idPlato.equals("") || nombre.equals("") || precio.equals("") || descripcion.equals("")
                || categoria.equals("") || tipo.equals("")) {

            Messages.warningMessage("ERROR Plato:  \nCampo vacios", "Warning");
            return;
        }

        IPlatoAccess service = Factory.getInstance().getPlatoService();
        PlatoService platoService = new PlatoService(service);
        Dish plato = null;

        try {
            plato = platoService.findDish(idPlato);
        } catch (Exception ex) {
            Logger.getLogger(GUICrearPlato.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (plato == null) {
            try {
                plato = new Dish();
                plato.setAtrCategoriaDish(categoria);
                plato.setAtrDescriptionDish(descripcion);
                plato.setAtrIdDish(idPlato);
                plato.setAtrNameDish(nombre);
                plato.setAtrPriceDish(precio);
                plato.setAtrTypeDish(tipo);

                if (platoService.createDish(plato)) {
                    successMessage("Plato agregada con ??xito.", "Atenci??n");
                    limpiarCampos();
                } else {
                    Messages.warningMessage("El plato no pudo ser agregado", "Warning");
                }

//                IMenuAccess serviceM = Factory.getInstance().getMenuService();
//                MenuService menuService = new MenuService(serviceM);
//                menuService.addDish(atrMenu, plato);

            } catch (Exception ex) {
                Logger.getLogger(GUICrearMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            warningMessage("Ya se registro un plato con ese id ", "Atenci??n");
        }


    }//GEN-LAST:event_btnCrearPlatoActionPerformed

    private void cbxCategoriaPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaPlatoActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        // TODO add your handling code here:
        IPlatoAccess service = Factory.getInstance().getPlatoService();
        String idPlato = txtIdPlato.getText();
        String nombre = txtNombrePlato.getText();
        String precio = txtPrecioPlato.getText();
        String descripcion = txtDescripcionPlato.getText();
        String categoria = cbxCategoriaPlato.getSelectedItem().toString();
        String tipo = cbxTipoPlato.getSelectedItem().toString();

        if (idPlato.equals("") || nombre.equals("") || precio.equals("") || descripcion.equals("")
                || categoria.equals("") || tipo.equals("")) {

            Messages.warningMessage("ERROR AL ACTUALIZAR Plato:  \nCampo vacios", "Warning");
            return;
        }

        PlatoService platoService = new PlatoService(service);

        try {
            if (platoService.updateDish(idPlato, nombre, precio, descripcion, tipo, categoria, menu.getAtrIdMenu())) {
                successMessage("Menu actualizado con ??xito.", "Atenci??n");
            } else {
                Messages.warningMessage("el Menu no pudo ser actualizado", "Warning");
            }
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atenci??n");
        }
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txtDescripcionPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionPlatoActionPerformed
    public void botones(boolean opcion) {
        txtIdPlato.setEnabled(opcion);
        txtNombrePlato.setEnabled(opcion);
        txtPrecioPlato.setEnabled(opcion);
        txtDescripcionPlato.setEnabled(opcion);
        cbxCategoriaPlato.setEnabled(opcion);
        cbxTipoPlato.setEnabled(opcion);
        btnCrearPlato.setEnabled(opcion);
    }

    public void llenarCampos() {

        txtIdPlato.setText(platoUpdate.getAtrIdDish());
        txtNombrePlato.setText(platoUpdate.getAtrNameDish());
        txtPrecioPlato.setText(platoUpdate.getAtrPriceDish());
        txtDescripcionPlato.setText(platoUpdate.getAtrDescriptionDish());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMenu;
    private javax.swing.JButton btnCrearPlato;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cbxCategoriaPlato;
    private javax.swing.JComboBox<String> cbxTipoPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCategoriaPlato;
    private javax.swing.JLabel lblDescripcionPlato;
    private javax.swing.JLabel lblIdMenuPlato;
    private javax.swing.JLabel lblIdPlato;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombrePlato;
    private javax.swing.JLabel lblPrecioPlato;
    private javax.swing.JLabel lblReqCategoriaPlato;
    private javax.swing.JLabel lblReqDescripcionPlato;
    private javax.swing.JLabel lblReqIdPlato;
    private javax.swing.JLabel lblReqNombrePlato;
    private javax.swing.JLabel lblReqPrecioPlato;
    private javax.swing.JLabel lblReqTipoPlato;
    private javax.swing.JLabel lblTipoPlato;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JTextField txtDescripcionPlato;
    private javax.swing.JTextField txtIdMenuPlato;
    private javax.swing.JTextField txtIdPlato;
    private javax.swing.JTextField txtNombrePlato;
    private javax.swing.JTextField txtPrecioPlato;
    // End of variables declaration//GEN-END:variables
}
