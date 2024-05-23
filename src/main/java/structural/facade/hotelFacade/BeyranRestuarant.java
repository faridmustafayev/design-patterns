package structural.facade.hotelFacade;

import java.util.ArrayList;
import java.util.List;

public class BeyranRestuarant implements MenuBeyran{
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


}
