/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beca98
 */
public class Pedido 
{
    private String atrIdPedido;
    private String atrUserName;
    private String atrIdRest;
    private List<Item> atrListItem;
    
    public Pedido(){}

    public Pedido(String atrIdPedido, String atrUserName, String atrIdRest) 
    {
        this.atrIdPedido = atrIdPedido;
        this.atrUserName = atrUserName;
        this.atrIdRest = atrIdRest;
        atrListItem = new ArrayList<Item>();
    }

    public String getAtrIdPedido() {
        return atrIdPedido;
    }

    public void setAtrIdPedido(String atrIdPedido) {
        this.atrIdPedido = atrIdPedido;
    }

    public String getAtrUserName() {
        return atrUserName;
    }

    public void setAtrUserName(String atrUserName) {
        this.atrUserName = atrUserName;
    }

    public String getAtrIdRest() {
        return atrIdRest;
    }

    public void setAtrIdRest(String atrIdRest) {
        this.atrIdRest = atrIdRest;
    }

    public List<Item> getAtrListItem() {
        return atrListItem;
    }

    public void setAtrListItem(Item atrListItem) {
        this.atrListItem.add(atrListItem);
    }
    
    
    
}
