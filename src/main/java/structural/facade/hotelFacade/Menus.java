package structural.facade.hotelFacade;

public abstract class Menus {
    private MenuBeyran menuBeyran;
    private MenuOcean menuOcean;

    public Menus(MenuBeyran menuBeyran, MenuOcean menuOcean) {
        this.menuBeyran = menuBeyran;
        this.menuOcean = menuOcean;
    }
}
