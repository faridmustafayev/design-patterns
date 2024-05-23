package structural.facade.hotelFacade;

import java.util.ArrayList;
import java.util.List;

public class OceanRestuarant implements MenuOcean{
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
