/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.access;

import co.unicauca.api.pedido.domain.entity.Factura;
import co.unicauca.api.pedido.domain.entity.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beca98
 */
public class PedidoRepository implements IPedidoRepository
{
    private Connection conn;
    
    public PedidoRepository()
    {
        initDatabase();
    }
    private void initDatabase() 
    {
        //SQL statament for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS pedido ("
                + "idpedido serial PRIMARY KEY,"
                + "idrest varchar(60) NOT NULL,"
                + "username varchar(60) NOT NULL"
                + ");"
                
                + "CREATE TABLE IF NOT EXISTS factura ( "
                + "idfactura serial PRIMARY KEY,"
                + "idpedido varchar(60) NOT NULL,"
                + "username varchar(60) NOT NULL,"
                + "direccion varchar(60) NOT NULL,"
                + "telefono varchar(60) NOT NULL,"
                + "metodoPago varchar(60) NOT NULL,"
                + "total varchar(60) NOT NULL"
                + ");"
                
                + "CREATE TABLE IF NOT EXISTS tiene"
                + "idpedido varchar(60) NOT NULL,"
                + "idplato varchar(60) NOT NULL,"
                + "cantidad varchar(60) NOT NULL,"
                + "PRIMARY KEY (idpedido, idplato)"
                + ");";
        try
        {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            this.disconnect();
        }catch(SQLException ex)
        {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * Conectar a la bd
     */
    public void connect()
    {
        try {
            
            String url = "jdbc:postgresql://localhost:5432/pedidoBD";
            String usuario = "postgres";
            String contrasenia = "123";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usuario, contrasenia);
           
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Desconecta de la base de datos
     */
    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }

    }
    @Override
    public List<Pedido> finsAll()
    {
       List<Pedido> pedido = new ArrayList<>();
        try {

            String sql = "SELECT * FROM pedido";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pedido newPedido = new Pedido();
                newPedido.setAtrIdPedido(rs.getString("IDPEDIDO"));
                newPedido.setAtrIdRest(rs.getString("IDREST"));
                newPedido.setAtrUserName(rs.getString("USERNAME"));
                pedido.add(newPedido);
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedido;
    }

    @Override
    public List<Pedido> findByPedidoUserName(String prmIdPedido) {
       List<Pedido> pedido = new ArrayList<>();
        try {

            String sql = "SELECT * FROM pedido where username='"+prmIdPedido+"'";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pedido newPedido = new Pedido();
                newPedido.setAtrIdPedido(rs.getString("IDPEDIDO"));
                newPedido.setAtrIdRest(rs.getString("IDREST"));
                newPedido.setAtrUserName(rs.getString("USERNAME"));
                pedido.add(newPedido);
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedido;
    }

    @Override
    public List<Pedido> findByIdRest(String prmIdRest) {
        List<Pedido> pedido = new ArrayList<>();
        try {

            String sql = "SELECT * FROM pedido where idrest='"+prmIdRest+"'";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pedido newPedido = new Pedido();
                newPedido.setAtrIdPedido(rs.getString("IDPEDIDO"));
                newPedido.setAtrIdRest(rs.getString("IDREST"));
                newPedido.setAtrUserName(rs.getString("USERNAME"));
                pedido.add(newPedido);
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedido;
    }

    @Override
    public boolean create(Pedido prmNewPedido) 
    {
        String sql="";
        try {
            this.connect();

            sql = "INSERT INTO pedido ( IDPEDIDO, IDREST, USERNAME) "
                    + "VALUES ( ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, prmNewPedido.getAtrIdPedido());
            pstmt.setString(2, prmNewPedido.getAtrIdRest());
            pstmt.setString(3, prmNewPedido.getAtrUserName());
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, "Error en el insert into: " + sql, ex);
        }
        return false;
    }

    @Override
    public boolean createTiene(String prmIdPedido, String prmIdPlato, String prmCantidad) {
         String sql="";
        try {
            this.connect();

            sql = "INSERT INTO tiene ( IDPEDIDO , IDPLATO, CANTIDAD) "
                    + "VALUES ( '" + prmIdPedido + "','" + prmIdPlato + "', '" + prmCantidad + "')";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, "Error en el insert into del menu" + sql, ex);
        }
        return false;
    }

    @Override
    public boolean createFactura(String prmIdFactura, String prmIdPedido, String prmUserName, String prmDireccion, String prmTelefono, String prmMetodoPago, String prmTotal) {
        String sql="";
        try {
            this.connect();

            sql = "INSERT INTO factura ( IDFACTURA, IDPEDIDO, USERNAME, DIRECCION, TELEFONO, METODOPAGO, TOTAL) "
                    + "VALUES ( '" + prmIdFactura + "','" + prmIdPedido + "', '" + prmUserName + "','" + prmDireccion + "','" + prmTelefono + "','" + prmMetodoPago + "','" + prmTotal + "')";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, "Error en el insert into del menu" + sql, ex);
        }
        return false;
    }

    @Override
    public List<Factura> listarFactura(String prmIdFactura) {
       List<Factura> listaFactura = new ArrayList<>();
        try {

            String sql = "SELECT * FROM factura WHERE IDFACTURA = '" + prmIdFactura + "'";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               Factura objFactura = new Factura();
               objFactura.setAtrIdFactura(rs.getString("idfactura"));
               objFactura.setAtrIdPedido(rs.getString("idpedido"));
               objFactura.setAtrUserName(rs.getString("username"));
               objFactura.setAtrDireccion(rs.getString("direccion"));
               objFactura.setAtrTelefono(rs.getString("telefono"));
               objFactura.setAtrMetodoPago(rs.getString("metodoPago"));
               objFactura.setAtrTotal(rs.getString("total"));
               listaFactura.add(objFactura);    
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaFactura; 
    }

    @Override
    public List<String> listarPlato(String prmIdPedido) {
        List<String> listarPlato = null;
        try
        {
            String sql = "SELECT idplato FROM tiene WHERE idpedido = '" + prmIdPedido + "'";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listarPlato = new ArrayList<>();
                
                listarPlato.add(rs.getString("idplato"));
            }
            this.disconnect();
        }catch(SQLException ex)
        {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  listarPlato;
    }

    @Override
    public Pedido findUserYRest(String prmIdPedido, String prmIdRest) {
        Pedido objPedido = null;
        try
        {
            String sql = "SELECT * FROM pedido WHERE idpedido = '" + prmIdPedido 
                    + "' and idrest = '" + prmIdRest + "'";
            this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                objPedido = new Pedido();
                objPedido.setAtrIdPedido(rs.getString("idpedido"));
                objPedido.setAtrIdRest(rs.getString("idrest"));
                objPedido.setAtrUserName(rs.getString("username"));
                }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoRepository.class.getName()).log(Level.SEVERE, "Error al buscar en la base de datos", ex);
        }
        return objPedido;
    }
    
    
    
}
