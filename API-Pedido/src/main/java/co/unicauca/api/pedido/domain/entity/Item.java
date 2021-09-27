/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.domain.entity;

/**
 *
 * @author Beca98
 */
public class Item 
{
    private String atrIdPlato;
    private String atrCantidad;

    public Item(){}
    public Item(String atrIdPlato, String atrCantidad)
    {
        this.atrIdPlato = atrIdPlato;
        this.atrCantidad = atrCantidad;
    }

    public String getAtrIdPlato() {
        return atrIdPlato;
    }

    public void setAtrIdPlato(String atrIdPlato) {
        this.atrIdPlato = atrIdPlato;
    }

    public String getAtrCantidad() {
        return atrCantidad;
    }

    public void setAtrCantidad(String atrCantidad) {
        this.atrCantidad = atrCantidad;
    }
    
    
    
}
