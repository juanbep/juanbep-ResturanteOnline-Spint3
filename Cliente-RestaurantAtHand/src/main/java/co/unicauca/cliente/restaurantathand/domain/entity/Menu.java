package co.unicauca.cliente.restaurantathand.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Menu de un Restaurante
 *
 * @author Beca98
 *
 */
public class Menu {

    //
    private String atrIdMenu;
    private String atrNomMenu;
    private String atrIdRest;
    private String atrDiasVisualizacion;
    //private List<String> atrIdPlatos;

    public Menu(String atrIdMenu, String atrNomMenu, String atrIdRest, String atrDiasVisualizacion) {
        this.atrIdMenu = atrIdMenu;
        this.atrNomMenu = atrNomMenu;
        this.atrIdRest = atrIdRest;
        this.atrDiasVisualizacion = atrDiasVisualizacion;
        //atrDiasVisualizacion = new ArrayList<String>();
        //atrIdPlatos = new ArrayList<String>();
    }

    public Menu() {
        //atrDiasVisualizacion = new ArrayList<String>();
        //atrIdPlatos = new ArrayList<String>();
    }

    public String getAtrIdMenu() {
        return atrIdMenu;
    }

    public void setAtrIdMenu(String atrIdMenu) {
        this.atrIdMenu = atrIdMenu;
    }

    public String getAtrNomMenu() {
        return atrNomMenu;
    }

    public void setAtrNomMenu(String atrNomMenu) {
        this.atrNomMenu = atrNomMenu;
    }

    public String getAtrIdRest() {
        return atrIdRest;
    }

    public void setAtrIdRest(String atrIdRest) {
        this.atrIdRest = atrIdRest;
    }

    public String getAtrDiasVisualizacion() {
        return atrDiasVisualizacion;
    }

    public void setAtrDiasVisualizacion(String atrDiasVisualizacion) {
        this.atrDiasVisualizacion = atrDiasVisualizacion;
    }

//    public void setAtrIdPlatos(String plato) {
//        this.atrIdPlatos.add(plato);
//    }

//    public void setDias(List<String> dias) {
//        this.atrDiasVisualizacion = dias;
//    }

//    public void setPlatos(List<String> platos) {
//        this.atrIdPlatos = platos;
//    }

//    public List<String> getAtrIdPlatos() {
//        return atrIdPlatos;
//    }
}
