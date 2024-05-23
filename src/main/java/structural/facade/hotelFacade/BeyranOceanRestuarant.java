package structural.facade.hotelFacade;

import java.util.ArrayList;
import java.util.List;

public class BeyranOceanRestuarant implements MenuOcean, MenuBeyran{
    @Override
    public List<String> sides() {
        List<String> name = new ArrayList<>();
        name.add("French Fries with Aipli");
        name.add("Sweet Potato Fries");
        name.add("Collard Greens");
        return name;
    }

    @Override
    public List<String> desserts() {
        List<String> name = new ArrayList<>();
        name.add("Tirasumi");
        name.add("BlackBerry pie");
        name.add("Red velvet cake");
        return name;
    }

    @Override
    public List<String> drinks() {
        List<String> name = new ArrayList<>();
        name.add("Soda Water");
        name.add("Fresh Juice");
        return name;
    }

    @Override
    public List<String> entrees() {
        List<String> name = new ArrayList<>();
        name.add("Pesto pasta salad");
        name.add("House bake roll");
        return name;
    }
}
