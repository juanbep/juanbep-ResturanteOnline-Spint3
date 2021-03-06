/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IPlatoAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Dish;
import co.unicauca.cliente.restaurantathand.domain.entity.Menu;
import co.unicauca.cliente.restaurantathand.domain.service.PlatoService;
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
public class GUIListarPlato extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIListarMenu
     */
    ImageIcon iconobtn = new ImageIcon("src/main/java/resource/mas.png");
    ImageIcon iconolbl = new ImageIcon("src/main/java/resource/listarPlato.png");

    /**
     * Objeto tipo menu
     */
    private Menu menu;

    /**
     *
     */
    private JDesktopPane dskEscritorio;

    /**
     *
     */
    private Dish platoSelect;
    

    /*
     * Almacena los platos que pertenecen a un menu especifico
     */
    private List<Dish> platos;

    public GUIListarPlato() {
        initComponents();
        lblLogo.setIcon(iconolbl);
        //btnBuscarMenuList.setIcon(iconobtn);
    }

    public GUIListarPlato(JDesktopPane dskEscritorio, Menu menu) {
        initComponents();
        lblLogo.setIcon(iconolbl);
        //btnBuscarMenuList.setIcon(iconobtn);
        this.menu = menu;
        this.dskEscritorio = dskEscritorio;
        cargarLista();
        cargarDatosTabla();
        botones(false);
    }

    /**
     * Carga una lista de platos a traves de una API Rest
     */
    public void cargarLista() {
        IPlatoAccess service = Factory.getInstance().getPlatoService();
        //Inyecta la dependencia 
        PlatoService plato = new PlatoService(service);

        try {
            platos = plato.findDishIdMenu(menu.getAtrIdMenu());
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atenci??n");
        }

    }

    public void cargarDatosTabla() {
        tblListarPlatos.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel model = (DefaultTableModel) tblListarPlatos.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[7];

        for (Dish dishs : platos) {
            rowData[0] = dishs.getAtrIdMenu();
            rowData[1] = dishs.getAtrIdDish();
            rowData[2] = dishs.getAtrCategoriaDish();
            rowData[3] = dishs.getAtrTypeDish();
            rowData[4] = dishs.getAtrNameDish();
            rowData[5] = dishs.getAtrDescriptionDish();
            rowData[6] = dishs.getAtrPriceDish();
            model.addRow(rowData);
        }
    }

    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
    }

    public void seleccionPlato() {
        // TODO add your handling code here:
        int seleccionar = tblListarPlatos.getSelectedRow();
        platoSelect = platos.get(seleccionar);
        cargarLista();
        cargarDatosTabla();
    }

    private void botones(boolean var) {

        btnEliminar.setEnabled(var);
        jButton7.setEnabled(var);
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

        pnlCentro = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        pnlSur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarPlatos = new javax.swing.JTable();
        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentro.setPreferredSize(new java.awt.Dimension(393, 140));
        pnlCentro.setLayout(new java.awt.GridLayout(3, 1));

        jButton5.setText("Recargar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlCentro.add(jButton5);

        btnEliminar.setText("Eliminar Plato");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnEliminar);

        jButton7.setText("Actualizar Plato");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlCentro.add(jButton7);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Plato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlSur.setLayout(new java.awt.GridLayout(1, 0));

        tblListarPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Menu", "Id Plato", "Categoria", "Tipo", "Nombre", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarPlatos.setShowGrid(true);
        tblListarPlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListarPlatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListarPlatos);

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
            .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(pnlNorte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pnlSur.getAccessibleContext().setAccessibleName("Lista de Menus");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListarPlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListarPlatosMouseClicked
        // TODO add your handling code here:
        botones(true);
        int column = tblListarPlatos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblListarPlatos.getRowHeight();
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
    }//GEN-LAST:event_tblListarPlatosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        seleccionPlato();
        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminar?? el registro, ??desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            IPlatoAccess service = Factory.getInstance().getPlatoService();
            //Inyecta dependencia 
            PlatoService plato = new PlatoService(service);

            try {
                plato.deleteDish(platoSelect.getAtrIdDish());
            } catch (Exception ex) {
                Logger.getLogger(GUICrearPlato.class.getName()).log(Level.SEVERE, null, ex);
            }

            cargarLista();
            cargarDatosTabla();
        }
        botones(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cargarLista();
        cargarDatosTabla();
        botones(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        seleccionPlato();
        GUICrearPlato objActualizarPlato = new GUICrearPlato(menu);
        objActualizarPlato.platoUpdate = platoSelect;
        objActualizarPlato.activarActualizar();
        dskEscritorio.add(objActualizarPlato);
        
          try {
            objActualizarPlato.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarPlato_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIListarPlato_1.class.getName()).log(Level.SEVERE, null, ex);
        }

        objActualizarPlato.show();
        botones(false);
        
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListarPlatos;
    // End of variables declaration//GEN-END:variables

}
