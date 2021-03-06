package co.unicauca.cliente.restaurantathand.domain.entity;

/**
 *
 * @author Beca98
 */
public class Dish {

    //Ide menu 
    private String atrIdMenu;
    //Id plato
    private String atrIdDish;
    //Nombre
    private String atrNameDish;
    //Precio
    private String atrPriceDish;
    //Descripcion
    private String atrDescriptionDish;

    private String atrTypeDish;

    //Categoria
    private String atrCategoriaDish;

    public Dish(String atrIdMenu, String atrIdFood, String atrNameFood, String atrPriceFood, String Description, String atrTypeDish, String atrCategoriaDish) {
        this.atrIdMenu = atrIdMenu;
        this.atrIdDish = atrIdFood;
        this.atrNameDish = atrNameFood;
        this.atrPriceDish = atrPriceFood;
        this.atrDescriptionDish = Description;
        this.atrTypeDish = atrTypeDish;
        this.atrCategoriaDish = atrCategoriaDish;
    }

    public Dish() {

    }

    public String getAtrTypeDish() {
        return atrTypeDish;
    }

    public void setAtrTypeDish(String atrTypeDish) {
        this.atrTypeDish = atrTypeDish;
    }

    public String getAtrIdMenu() {
        return atrIdMenu;
    }

    public void setAtrIdMenu(String atrIdMenu) {
        this.atrIdMenu = atrIdMenu;
    }

    public String getAtrIdDish() {
        return atrIdDish;
    }

    public void setAtrIdDish(String atrIdDish) {
        this.atrIdDish = atrIdDish;
    }

    public String getAtrNameDish() {
        return atrNameDish;
    }

    public void setAtrNameDish(String atrNameDish) {
        this.atrNameDish = atrNameDish;
    }

    public String getAtrPriceDish() {
        return atrPriceDish;
    }

    public void setAtrPriceDish(String atrPriceDish) {
        this.atrPriceDish = atrPriceDish;
    }

    public String getAtrDescriptionDish() {
        return atrDescriptionDish;
    }

    public void setAtrDescriptionDish(String atrDescriptionDish) {
        this.atrDescriptionDish = atrDescriptionDish;
    }

    public String getAtrCategoriaDish() {
        return atrCategoriaDish;
    }

    public void setAtrCategoriaDish(String atrCategoriaDish) {
        this.atrCategoriaDish = atrCategoriaDish;
    }

}
