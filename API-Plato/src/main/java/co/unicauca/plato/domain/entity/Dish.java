package co.unicauca.plato.domain.entity;

/**
 *
 * @author Beca98
 */
public class Dish {

    //Id
    private String atrIdDish;
    //Nombre
    private String atrNameDish;
    //Precio
    private String atrPriceDish;
    //Descripcion
    private String atrDescriptionDish;

    private String atrTypeDish;

    private String atrIdMenu;

    //Categoria
    private String atrCategoriaDish;

    public Dish(String atrIdFood, String atrNameFood, String atrPriceFood, String Description, String atrTypeDish, String atrCategoriaDish, String atrIdMenu) {
        this.atrIdDish = atrIdFood;
        this.atrNameDish = atrNameFood;
        this.atrPriceDish = atrPriceFood;
        this.atrDescriptionDish = Description;
        this.atrTypeDish = atrTypeDish;
        this.atrCategoriaDish = atrCategoriaDish;
        this.atrIdMenu = atrIdMenu;
    }

    public Dish() {

    }

    public String getAtrTypeDish() {
        return atrTypeDish;
    }

    public void setAtrTypeDish(String atrTypeDish) {
        this.atrTypeDish = atrTypeDish;
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

    public String getAtrIdMenu() {
        return atrIdMenu;
    }

    public void setAtrIdMenu(String atrIdMenu) {
        this.atrIdMenu = atrIdMenu;
    }

}
