/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IMenuAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Admin;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.entity.User;
import co.unicauca.cliente.restaurantathand.domain.service.MenuService;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beca98
 */
public class GUIListarMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIListarMenu
     */
    ImageIcon iconobtn = new ImageIcon("src/main/java/resource/mas.png");
    ImageIcon iconolbl = new ImageIcon("src/main/java/resource/listamenu.png");

    /*
    * Objeto de tipo restaurante 
     */
    private Restaurant restaurant;

    /**
     *
     */
    private JDesktopPane dskEscritorio;

    /**
     * Menu seleccionado
     */
    private Menu menuSelect;

    /*
     * Almacena los menus que pertenecen a un restaurante especifico
     */
    private List<Menu> Menus;

    public GUIListarMenu() {
        initComponents();
        lblLogo.setIcon(iconolbl);
        //btnBuscarMenuList.setIcon(iconobtn);
        // btnBuscarMenuList.setVisible(true);
    }

    public GUIListarMenu(JDesktopPane dskEscritorio, Restaurant restaurant) {
        initComponents();
        lblLogo.setIcon(iconolbl);
        //btnBuscarMenuList.setIcon(iconobtn);
        this.restaurant = restaurant;
        // btnBuscarMenuList.setVisible(true);
        this.dskEscritorio = dskEscritorio;
        cargarLista();
        cargarDatosTabla();
        botones(false);
    }

    /**
     * Carga un lista de menu a traves de una API REST
     */
    private void cargarLista() {
        IMenuAccess service = Factory.getInstance().getMenuService();
        // Inyecta la dependencia
        MenuService menu = new MenuService(service);

        try {
            Menus = menu.findbyMenubyIdRest(restaurant.getAtrNitRest());
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }
    }

    public void cargarDatosTabla() {

        tblListarMenus.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel model = (DefaultTableModel) tblListarMenus.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[4];

        for (Menu menus : Menus) {
            rowData[0] = menus.getAtrIdRest();
            rowData[1] = menus.getAtrIdMenu();
            rowData[2] = menus.getAtrNomMenu();
            //rowData[3] = menus.getAtrIdPlatos();
            rowData[3] = menus.getAtrDiasVisualizacion();
            model.addRow(rowData);
        }

    }

    private void botones(boolean var) {

        btnActualizar.setEnabled(var);
        btnEliminar.setEnabled(var);
        jButton1.setEnabled(var);
        //btnPlatos.setEnabled(var);
    }

    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
    }

    public void seleccionMenu() {
        // TODO add your handling code here:
        int seleccionar = tblListarMenus.getSelectedRow();
        menuSelect = Menus.get(seleccionar);
        cargarLista();
        cargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentro = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlSur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarMenus = new javax.swing.JTable();
        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentro.setPreferredSize(new java.awt.Dimension(393, 140));
        pnlCentro.setLayout(new java.awt.GridLayout(2, 2));

        jButton1.setText("Ver Platos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlCentro.add(jButton1);

        btnEliminar.setText("Eliminar Menu");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnEliminar);

        btnActualizar.setText("Actualizar Menu");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnActualizar);

        jButton4.setText("Recargar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlCentro.add(jButton4);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Menus ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlSur.setLayout(new java.awt.GridLayout(1, 0));

        tblListarMenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Restaurante", "Id Menu", "Nombre ", "Dias Ofrecido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarMenus.setShowGrid(true);
        tblListarMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListarMenusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListarMenus);

        pnlSur.add(jScrollPane1);

        pnlNorte.setBackground(new java.awt.Color(255, 255, 255));
        pnlNorte.setLayout(new java.awt.GridLayout(1, 0));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setMaximumSize(new java.awt.Dimension(393, 56));
        lblLogo.setMinimumSize(new java.awt.Dimension(393, 56));
        lblLogo.setPreferredSize(new java.awt.Dimension(393, 28));
        pnlNorte.add(lblLogo);
        lblLogo.getAccessibleContext().setAccessibleName("holi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSur, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSur.getAccessibleContext().setAccessibleName("Lista de Menus");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListarMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListarMenusMouseClicked
        // TODO add your handling code here:
        botones(true);
        int column = tblListarMenus.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblListarMenus.getRowHeight();
        /*if (row < tblListarRestaurant.getRowCount() && row >= 0 && column < tblListarRestaurant.getColumnCount() && column >= 0) 
        {
            Object value = tblListarRestaurant.getValueAt(row, column);
            if (value instanceof JButton) 
            {
                ((JButton) value).doClick();
                JButton btn = (JButton) value;
                if (btn.getName().equals("btnEliminar")) {
                    if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el registro, ¿desea continuar?",
                            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
                    {
                        objPedido.eliminarHamburguesa(row);
                        if (objPedido.getListaHamburguesas().size() == 0) 
                        {
                            objVistaInicio.deshabilitar();
                        }
                        cargarDatosTabla();
                    }
                } else 
                {
                    actualizarHamburguesa(row, objPedido, this);
                }
            }
        }*/
    }//GEN-LAST:event_tblListarMenusMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        seleccionMenu();
        GUIListarPlato objListarPlato = new GUIListarPlato(dskEscritorio, menuSelect);
        dskEscritorio.add(objListarPlato);
        try {
            objListarPlato.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarPlato_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        objListarPlato.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cargarLista();
        cargarDatosTabla();
        botones(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        seleccionMenu();

        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            IMenuAccess service = Factory.getInstance().getMenuService();
            //Inyecta dependencia 
            MenuService menu = new MenuService(service);

            try {
                menu.deleteMenu(menuSelect.getAtrIdMenu());
            } catch (Exception ex) {
                Logger.getLogger(GUICrearMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            cargarLista();
            cargarDatosTabla();
        }

        botones(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        seleccionMenu();
        GUICrearMenu objActualizarMenu = new GUICrearMenu(restaurant);
        objActualizarMenu.menuUpdate = menuSelect;
        objActualizarMenu.activarActualizar();

        dskEscritorio.add(objActualizarMenu);

        try {
            objActualizarMenu.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarMenu_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarMenu_1.class.getName()).log(Level.SEVERE, null, ex);
        }

        objActualizarMenu.show();
        botones(false);
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListarMenus;
    // End of variables declaration//GEN-END:variables

}
