/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IMenuAccess;
import co.unicauca.cliente.restaurantathand.access.IRestaurantAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Admin;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.entity.User;
import co.unicauca.cliente.restaurantathand.domain.service.MenuService;
import co.unicauca.cliente.restaurantathand.domain.service.RestaurantService;
import co.unicauca.cliente.restaurantathand.infra.Messages;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import static co.unicauca.cliente.restaurantathand.infra.Messages.warningMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Beca98
 */
public class GUICrearMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICrearMenu
     */
    ImageIcon iconolbl = new ImageIcon("src/main/java/resource/registrarmenu.png");

    /**
     * Restaurante al que pertenece el menu
     */
    private Restaurant restaurante;

    /**
     * Menu que vamos a seleccionar
     */
    public Menu menuUpdate;

    /**
     * Almacena una lista de menus
     */
    private List<Menu> menus;

    public GUICrearMenu() {
        initComponents();
        lblLogo.setIcon(iconolbl);
        txtIdMenu.setEnabled(false);
        txtNameMenu.setEnabled(false);
        panel(false);
    }

    public GUICrearMenu(Restaurant restaurante) {
        initComponents();
        lblLogo.setIcon(iconolbl);
        txtIdMenu.setEnabled(false);
        txtNameMenu.setEnabled(false);
        panel(false);
        this.restaurante = restaurante;
        //this.admin = admin;
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
        lblIdRestMenu = new javax.swing.JLabel();
        txtIdRestMenu = new javax.swing.JTextField();
        btnBucarIdMenu = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblIdMenu = new javax.swing.JLabel();
        txtIdMenu = new javax.swing.JTextField();
        lblReqIdPlato = new javax.swing.JLabel();
        lblNameMenu = new javax.swing.JLabel();
        txtNameMenu = new javax.swing.JTextField();
        lblReqNameMenu = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlSur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbtLunes = new javax.swing.JRadioButton();
        rbtMartes = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rbtMiercoles = new javax.swing.JRadioButton();
        rbtJueves = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtViernes = new javax.swing.JRadioButton();
        rbtSabado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbtDomingo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        pnlCentro.setLayout(new java.awt.GridLayout(6, 3));

        lblIdRestMenu.setText("Id Restaurante:");
        lblIdRestMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentro.add(lblIdRestMenu);
        pnlCentro.add(txtIdRestMenu);

        btnBucarIdMenu.setText("Buscar");
        btnBucarIdMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarIdMenuActionPerformed(evt);
            }
        });
        pnlCentro.add(btnBucarIdMenu);
        pnlCentro.add(jLabel14);
        pnlCentro.add(jLabel12);
        pnlCentro.add(jLabel13);

        lblIdMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdMenu.setText("Id:");
        lblIdMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentro.add(lblIdMenu);
        pnlCentro.add(txtIdMenu);

        lblReqIdPlato.setText("Requerido");
        pnlCentro.add(lblReqIdPlato);

        lblNameMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameMenu.setText("Name:");
        lblNameMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentro.add(lblNameMenu);
        pnlCentro.add(txtNameMenu);

        lblReqNameMenu.setText("Requerido");
        pnlCentro.add(lblReqNameMenu);
        pnlCentro.add(jLabel17);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia visualizaci??n menu"));
        pnlSur.setLayout(new java.awt.GridLayout(9, 3));
        pnlSur.add(jLabel3);

        rbtLunes.setText("Lunes");
        pnlSur.add(rbtLunes);

        rbtMartes.setText("Martes");
        pnlSur.add(rbtMartes);
        pnlSur.add(jLabel11);

        rbtMiercoles.setText("Miercoles");
        pnlSur.add(rbtMiercoles);

        rbtJueves.setText("Jueves");
        pnlSur.add(rbtJueves);
        pnlSur.add(jLabel2);

        rbtViernes.setText("Viernes");
        pnlSur.add(rbtViernes);

        rbtSabado.setText("Sabado");
        pnlSur.add(rbtSabado);
        pnlSur.add(jLabel1);

        rbtDomingo.setText("Domingo");
        pnlSur.add(rbtDomingo);
        pnlSur.add(jLabel5);
        pnlSur.add(jLabel4);
        pnlSur.add(jLabel8);
        pnlSur.add(jLabel10);
        pnlSur.add(jLabel6);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlSur.add(jButton1);
        pnlSur.add(jLabel9);
        pnlSur.add(jLabel7);

        jButton2.setText("Guardar Cambios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlSur.add(jButton2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBucarIdMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarIdMenuActionPerformed

        String idRest = txtIdRestMenu.getText();
        IRestaurantAccess service = Factory.getInstance().getRestaurantService();
        RestaurantService restaurantService = new RestaurantService(service);
        Restaurant restaurant = new Restaurant();
        if (idRest.equals("") || idRest.isEmpty()) {

            Messages.warningMessage("ERROR Menu:  \nCampo vacios", "Warning");
            return;
        }

        try {
            restaurant = restaurantService.findRestaurantByNit(idRest);
        } catch (Exception ex) {
            Logger.getLogger(GUICrearMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (restaurant != null) {
//            if (restaurant.getAtrNitRest().equals(restaurante.getAtrNitRest())) {
            panel(true);
            txtIdMenu.setEnabled(true);
            txtNameMenu.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setVisible(false);
            //restaurante = restaurant;
//            } else {
//                warningMessage("No es el administrador del Restaurante", "Atenci??n");
//            }
        } else {
            warningMessage("No hay un restaurante registrado con ese nit", "Atenci??n");
        }

    }//GEN-LAST:event_btnBucarIdMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idMenu = txtIdMenu.getText();
        String idNom = txtNameMenu.getText();
        String idRest = txtIdRestMenu.getText();

        if (idMenu.equals("") || idNom.equals("")) {

            Messages.warningMessage("ERROR Menu:  \nCampo vacios", "Warning");
            return;
        }

        IMenuAccess service = Factory.getInstance().getMenuService();
        MenuService menuService = new MenuService(service);
        Menu menu = null;

        try {
            menu = menuService.findMenu(idMenu);
        } catch (Exception ex) {
            Logger.getLogger(GUICrearMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (menu == null) {
            try {
                menu = new Menu();
                menu.setAtrIdRest(idRest);
                menu.setAtrIdMenu(idMenu);
                menu.setAtrNomMenu(idNom);
                //  List<String> dias = diasVisualizacion();
//                if (dias.size() != 0) {
                //menu.setDias(dias);
                if (menuService.createMenu(menu)) {
                    for (int i = 0; i < diasVisualizacion().size(); i++) {
                        menuService.createVisualizacion(menu, idMenu, diasVisualizacion().get(i));
                    }

                    successMessage("Menu agregada con ??xito.", "Atenci??n");
                } else {
                    Messages.warningMessage("El Menu no pudo ser agregado", "Warning");
                }
//                } else {
//                    warningMessage("Se debe elegir al menos un dia para que este disponible el menu ", "Atenci??n");
//                }
            } catch (Exception ex) {
                Logger.getLogger(GUICrearMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            warningMessage("Ya se registro un menu con ese id ", "Atenci??n");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        IMenuAccess service = Factory.getInstance().getMenuService();
        String idMenu = txtIdMenu.getText();
        String idRest = restaurante.getAtrNitRest();
        String nombreMenu = txtNameMenu.getText();

        if (idMenu.equals("") || nombreMenu.equals("")) {
            Messages.warningMessage("ERROR AL ACTUALIZAR EL RESTAURANTE: \nCampos vacios", "Warning");
            return;
        }

        MenuService menuService = new MenuService(service);
        Menu menuAux = new Menu();
        menuAux.setAtrIdMenu(idMenu);
        menuAux.setAtrIdRest(idRest);
        menuAux.setAtrNomMenu(nombreMenu);

        try {

            if (menuService.updateMenu(idMenu, menuAux)) {
                for (int i = 0; i < diasVisualizacion().size(); i++) {
                    menuService.createVisualizacion(menuAux, idMenu, diasVisualizacion().get(i));
                }
                successMessage("Menu actualizado con ??xito.", "Atenci??n");
            } else {
                Messages.warningMessage("el Menu no pudo ser actualizado", "Warning");
            }
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atenci??n");
        }
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void limpiarCampos() {

        txtIdMenu.setText("");
        txtNameMenu.setText("");
        rbtDomingo.setSelected(false);
        rbtSabado.setSelected(false);
        rbtViernes.setSelected(false);
        rbtJueves.setSelected(false);
        rbtMiercoles.setSelected(false);
        rbtMartes.setSelected(false);
        rbtLunes.setSelected(false);
        jButton2.setSelected(false);

    }

    public List<String> diasVisualizacion() {
        List<String> dias = new ArrayList<String>();

        if (rbtDomingo.isSelected()) {
            dias.add("Domingo");
        }
        if (rbtSabado.isSelected()) {
            dias.add("Sabado");
        }
        if (rbtViernes.isSelected()) {
            dias.add("Viernes");
        }
        if (rbtJueves.isSelected()) {
            dias.add("Jueves");
        }
        if (rbtMiercoles.isSelected()) {
            dias.add("Miercoles");
        }
        if (rbtMartes.isSelected()) {
            dias.add("Martes");
        }
        if (rbtLunes.isSelected()) {
            dias.add("Lunes");
        }
        return dias;
    }

    /*
     * Cambiar la interfaz??para que actualice en vez de Registrar
     */
    public void activarActualizar() {
        jButton1.setVisible(false);
        jButton2.setEnabled(false);
        txtIdRestMenu.setEnabled(false);
        btnBucarIdMenu.setEnabled(false);

        llenarCampos();
    }

    public void llenarCampos() {

        activarCampos(true);
        txtIdMenu.setText(menuUpdate.getAtrIdMenu());
        txtNameMenu.setText(menuUpdate.getAtrNomMenu());

    }

    public void activarCampos(boolean opcion) {
        txtIdMenu.setEnabled(true);
        txtNameMenu.setEnabled(true);
        rbtDomingo.setEnabled(opcion);
        rbtSabado.setEnabled(opcion);
        rbtViernes.setEnabled(opcion);
        rbtJueves.setEnabled(opcion);
        rbtMiercoles.setEnabled(opcion);
        rbtMartes.setEnabled(opcion);
        rbtLunes.setEnabled(opcion);
        jButton2.setEnabled(opcion);

    }

    public void panel(boolean opcion) {

        rbtDomingo.setEnabled(opcion);
        rbtSabado.setEnabled(opcion);
        rbtViernes.setEnabled(opcion);
        rbtJueves.setEnabled(opcion);
        rbtMiercoles.setEnabled(opcion);
        rbtMartes.setEnabled(opcion);
        rbtLunes.setEnabled(opcion);

        jButton1.setEnabled(opcion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBucarIdMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIdMenu;
    private javax.swing.JLabel lblIdRestMenu;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNameMenu;
    private javax.swing.JLabel lblReqIdPlato;
    private javax.swing.JLabel lblReqNameMenu;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JRadioButton rbtDomingo;
    private javax.swing.JRadioButton rbtJueves;
    private javax.swing.JRadioButton rbtLunes;
    private javax.swing.JRadioButton rbtMartes;
    private javax.swing.JRadioButton rbtMiercoles;
    private javax.swing.JRadioButton rbtSabado;
    private javax.swing.JRadioButton rbtViernes;
    private javax.swing.JTextField txtIdMenu;
    private javax.swing.JTextField txtIdRestMenu;
    private javax.swing.JTextField txtNameMenu;
    // End of variables declaration//GEN-END:variables
}
