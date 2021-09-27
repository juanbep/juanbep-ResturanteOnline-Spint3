package co.unicauca.api.pedido.access;


import co.unicauca.api.pedido.domain.entity.Factura;
import co.unicauca.api.pedido.domain.entity.Pedido;
import java.util.List;
/**
 *
 * @author Beca98
 */
public interface IPedidoRepository 
{
    List<Pedido> finsAll();
    
    List <Pedido> findByPedidoUserName(String prmUserName);
    List<Pedido> findByIdRest (String prmIdRest);
    
    
    boolean create (Pedido prmNewPedido);
    
    boolean createTiene(String prmIdPedido, String prmIdPlato, String prmCantidad);
    
    boolean createFactura(String prmIdFactura, String prmIdPedido, String prmUserName, String prmDireccion,String prmTelefono, String prmMetodoPago, String prmTotal);
   
    List<Factura> listarFactura(String prmIdFactura);
    
    List<String> listarPlato(String prmIdPedido);

    Pedido findUserYRest(String prmIdPedido, String prmIdRest);
}
