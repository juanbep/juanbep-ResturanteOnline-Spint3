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
public class Factura 
{
    private String atrIdFactura;
    private String atrIdPedido;
    private String atrUserName;
    private String atrDireccion;
    private String atrTelefono;
    private String atrMetodoPago;
    private String atrTotal;

    public Factura (){ }
    public Factura(String atrIdFactura, String atrIdPedido,String atrUserName, String atrDireccion, String atrTelefono, String atrMetodoPago, String atrTotal) 
    {
        this.atrIdFactura = atrIdFactura;
        this.atrIdPedido = atrIdPedido;
        this.atrUserName = atrUserName;
        this.atrDireccion = atrDireccion;
        this.atrTelefono = atrTelefono;
        this.atrMetodoPago = atrMetodoPago;
        this.atrTotal = atrTotal;
    }

    public String getAtrIdFactura() {
        return atrIdFactura;
    }

    public void setAtrIdFactura(String atrIdFactura) {
        this.atrIdFactura = atrIdFactura;
    }

    public String getAtrIdPedido() {
        return atrIdPedido;
    }

    public void setAtrIdPedido(String atrIdPedido) {
        this.atrIdPedido = atrIdPedido;
    }

    public String getAtrDireccion() {
        return atrDireccion;
    }

    public void setAtrDireccion(String atrDireccion) {
        this.atrDireccion = atrDireccion;
    }

    public String getAtrTelefono() {
        return atrTelefono;
    }

    public void setAtrTelefono(String atrTelefono) {
        this.atrTelefono = atrTelefono;
    }

    public String getAtrMetodoPago() {
        return atrMetodoPago;
    }

    public void setAtrMetodoPago(String atrMetodoPago) {
        this.atrMetodoPago = atrMetodoPago;
    }

    public String getAtrUserName() {
        return atrUserName;
    }

    public void setAtrUserName(String atrUserName) {
        this.atrUserName = atrUserName;
    }

    public String getAtrTotal() {
        return atrTotal;
    }

    public void setAtrTotal(String atrTotal) {
        this.atrTotal = atrTotal;
    }
    
}
