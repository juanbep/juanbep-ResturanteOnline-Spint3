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
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beca98
 */
public class GUIListarMenu_1 extends javax.swing.JInternalFrame {

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

    /*
     * Almacena los menus que pertenecen a un restaurante especifico
     */
    private List<Menu> Menus;

    public GUIListarMenu_1() {
        initComponents();
        lblLogo.setIcon(iconolbl);
        btnBuscarMenuList.setIcon(iconobtn);
        btnBuscarMenuList.setVisible(true);
    }

    public GUIListarMenu_1(JDesktopPane dskEscritorio, Restaurant restaurant) {
        initComponents();
        lblLogo.setIcon(iconolbl);
        btnBuscarMenuList.setIcon(iconobtn);
        this.restaurant = restaurant;
        btnBuscarMenuList.setVisible(true);
        this.dskEscritorio = dskEscritorio;
        cargarLista();
        cargarDatosTabla();
        
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
            successMessage(ex.getMessage(), "Atenci??n");
        }
    }

    public void cargarDatosTabla() {

        tblListarMenus.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel model = (DefaultTableModel) tblListarMenus.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[4];
        
        for(Menu menus : Menus){
            rowData[0] = menus.getAtrIdRest();
            rowData[1] = menus.getAtrIdMenu();
            rowData[2] = menus.getAtrNomMenu();
            //rowData[3] = menus.getAtrIdPlatos();
            rowData[3] = menus.getAtrDiasVisualizacion();
            model.addRow(rowData);
        }

    }

    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
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
        lblidMenuList = new javax.swing.JLabel();
        txtIdMenuList = new javax.swing.JTextField();
        btnBuscarMenuList = new javax.swing.JButton();
        pnlSur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarMenus = new javax.swing.JTable();
        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentro.setPreferredSize(new java.awt.Dimension(393, 140));
        pnlCentro.setLayout(new java.awt.GridLayout(3, 3));

        lblidMenuList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidMenuList.setText("ID MENU:");
        lblidMenuList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentro.add(lblidMenuList);
        pnlCentro.add(txtIdMenuList);

        btnBuscarMenuList.setText("Buscar");
        pnlCentro.add(btnBuscarMenuList);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Menus ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlSur.setLayout(new java.awt.GridLayout(1, 0));

        tblListarMenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Restaurante", "Id Menu", "Nombre ", "Platos ", "Dias Ofrecido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSur, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSur.getAccessibleContext().setAccessibleName("Lista de Menus");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListarMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListarMenusMouseClicked
        // TODO add your handling code here:
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
                    if (JOptionPane.showConfirmDialog(rootPane, "Se eliminar?? el registro, ??desea continuar?",
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMenuList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblidMenuList;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListarMenus;
    private javax.swing.JTextField txtIdMenuList;
    // End of variables declaration//GEN-END:variables

}
