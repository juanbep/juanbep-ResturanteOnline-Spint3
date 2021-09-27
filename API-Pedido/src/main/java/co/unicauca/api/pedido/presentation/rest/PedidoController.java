package co.unicauca.api.pedido.presentation.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Beca98
 */
@Path("javaee8")
public class PedidoController {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
}
