/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.domain.service;

import co.unicauca.api.pedido.access.IPedidoRepository;
import co.unicauca.api.pedido.domain.entity.Factura;
import co.unicauca.api.pedido.domain.entity.Pedido;
import co.unicauca.api.pedido.infra.DomainErrors;
import co.unicauca.api.pedido.infra.Error;
import co.unicauca.api.pedido.domain.validators.ValidationError;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beca98
 */
public class PedidoService 
{
    private IPedidoRepository repository;
    
    public List<Pedido> findByPedidoUserName(String prmUserName)
    {
        return repository.findByPedidoUserName(prmUserName);
    }
     public List<Pedido> findByIdRest(String prmIdRest){
        return repository.findByIdRest(prmIdRest);
    }
    
    public List<String> listaPlatos (String prmIdPedido){
        return repository.listarPlato(prmIdPedido);
    }
    
    public List<Factura> listarFactura (String prmIdFactura){
        return repository.listarFactura(prmIdFactura);
    }
    public void setPedidoRepository(IPedidoRepository repository)
    {
        this.repository = repository;
    }
    public List<Pedido> findAll()
    {
        List<Pedido> pedido = repository.finsAll();
        return pedido;
    }
    public Pedido findUserYRest(String prmIdPedido, String prmIdRest)
    {
        Pedido objPedido = repository.findUserYRest(prmIdPedido, prmIdRest);
        return objPedido;
    }
    public boolean create(Pedido newPedido)
    {
        List<Error> error = validarCampos(newPedido);
        if(!error.isEmpty())
        {
            DomainErrors.setErrors(error);
            return false;
        }
        return repository.create(newPedido);
    }
    
    
    private List<Error> validarCampos(Pedido newPedido)
    {
         List<Error> errors = new ArrayList<>();
        
        //Validate user
        if (newPedido.getAtrUserName()== null || newPedido.getAtrUserName().isEmpty()) {
            Error error = new Error(ValidationError.EMPTY_FIELD, "Id Restaurante", "El id del restaurante es obligatorio");
            errors.add(error);
        }
        
         return errors;
    }
    private List<Error> validateCreate(Pedido newPedido)
    {
        List<Error> errors = null;
        errors = validarCampos(newPedido);
        if(newPedido.getAtrUserName()!=null)
        {
            if(!newPedido.getAtrUserName().isEmpty())
            {
                Pedido pedidoAux = repository.findUserYRest(newPedido.getAtrUserName(),newPedido.getAtrIdRest());
                if(pedidoAux != null)
                {
                    Error error = new Error(ValidationError.INVALID_FIELD, "idsername", "El id del pedido ya existe");
                    errors.add(error);
                }
            }
        }
        
        return errors;
    }
}
