package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IMenuAccess;
import co.unicauca.cliente.restaurantathand.access.IPlatoAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Dish;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.service.MenuService;
import co.unicauca.cliente.restaurantathand.domain.service.PlatoService;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beca98
 */
public final class GUIRestauranteEscogido extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIListarRestaurantes
     */
    private Restaurant restauranteEscogido;
    
    /**
     *  Lista de Menus del Restaurante 
     */
    public List<Menu> listMenu;
    
    /**
     *  Menu Seleccionado 
     */
    
    public Menu menuSeleccionado;
    
    /**
     * Lista de Platos 
     */
    public List<Dish> listPlato;
    
    /**
     * Plato seleccionado para añadir al carrito de pedidos 
     */
    private Dish platoSeleccionado;
    
    
    public GUIRestauranteEscogido() {
        initComponents();
        listMenu = new ArrayList<>();
        listPlato = new ArrayList<>();
    }
    public GUIRestauranteEscogido(Restaurant restauranteEscogido)
    {
        initComponents();
        
        listMenu = new ArrayList<>();
        listPlato = new ArrayList<>();
        this.restauranteEscogido = restauranteEscogido;
        lblRestEsc.setText(restauranteEscogido.getAtrNameRest());
        cargarListaMenu();
        cargarDatosTablaMenu();
    }

    /**
     * Carga un lista a traves de una API REST
     */
    private void cargarListaMenu() {
        IMenuAccess service = Factory.getInstance().getMenuService();
        // Inyecta la dependencia
        MenuService menu = new MenuService(service);

        try {
            listMenu= menu.findbyMenubyRN(restauranteEscogido.getAtrNitRest());
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }
    }
    
    public void cargarDatosTablaMenu() {
        tblMenu.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[2];
        for (Menu menu : listMenu) {
            rowData[0] = menu.getAtrNomMenu();
            model.addRow(rowData);
        }
    }
    
    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
    }
    
    private void cargarListaPlatos () throws Exception{
        
        IPlatoAccess service = Factory.getInstance().getPlatoService();
        // Inyecta la dependencia
        PlatoService plato = new PlatoService(service);
        Dish platito;
        for (String platos : menuSeleccionado.getAtrIdPlatos()) {
            platito = plato.findDish(platos);
            listPlato.add(platito);
            
        }
        
    }
    
    private void cargarDatosTablaPlatos(){
        tblListaPlato.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel model = (DefaultTableModel) tblListaPlato.getModel();
        limpiarTabla(model);
        JButton btnAgregarCarrito = new JButton("Agregar");
        btnAgregarCarrito.setName("btnAgregarCarrito");
        Object rowData[] = new Object[6];
        for (Dish platito : listPlato) {
            rowData[0] = platito.getAtrNameDish();
            rowData[1] = platito.getAtrPriceDish();
            rowData[2] = platito.getAtrCategoriaDish();
            rowData[3] = platito.getAtrDescriptionDish();
            rowData[4] = platito.getAtrTypeDish();
            rowData[5] = platito.getAtrTypeDish();
            rowData[6] = btnAgregarCarrito;
            model.addRow(rowData);
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlNorte = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRestEscogido = new javax.swing.JLabel();
        lblRestEsc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        pnlSur = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaPlato = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlNorte.setBackground(new java.awt.Color(255, 255, 255));
        pnlNorte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restaurante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnlNorte.setLayout(new java.awt.GridLayout(4, 3));
        pnlNorte.add(jLabel4);
        pnlNorte.add(jLabel3);

        lblRestEscogido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestEscogido.setText("Nombre:");
        pnlNorte.add(lblRestEscogido);
        pnlNorte.add(lblRestEsc);
        pnlNorte.add(jLabel2);
        pnlNorte.add(jLabel5);
        pnlNorte.add(jLabel6);

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Menu"));
        pnlCenter.setLayout(new java.awt.GridBagLayout());

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Menu"
            }
        ));
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMenu);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 382;
        gridBagConstraints.ipady = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 19, 18);
        pnlCenter.add(jScrollPane3, gridBagConstraints);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Plato"));
        pnlSur.setLayout(new java.awt.GridBagLayout());

        tblListaPlato.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Plato"));
        tblListaPlato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Categoria", "Descripcion", "Tipo plato"
            }
        ));
        tblListaPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaPlatoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListaPlato);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 394;
        gridBagConstraints.ipady = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 15, 18);
        pnlSur.add(jScrollPane2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
            .addComponent(pnlSur, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        int seleccionar = tblMenu.rowAtPoint(evt.getPoint());
        menuSeleccionado = listMenu.get(seleccionar);
        try {
            cargarListaPlatos();
        } catch (Exception ex) {
            Logger.getLogger(GUIRestauranteEscogido.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarListaMenu();
        cargarDatosTablaMenu();
        cargarDatosTablaPlatos();
    }//GEN-LAST:event_tblMenuMouseClicked

    private void tblListaPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaPlatoMouseClicked
       int seleccionar = tblListaPlato.rowAtPoint(evt.getPoint());
        platoSeleccionado = listPlato.get(seleccionar);
    }//GEN-LAST:event_tblListaPlatoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblRestEsc;
    private javax.swing.JLabel lblRestEscogido;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListaPlato;
    private javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables
}
