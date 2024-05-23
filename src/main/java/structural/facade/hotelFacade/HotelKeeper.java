package structural.facade.hotelFacade;

public interface HotelKeeper {
    BeyranRestuarant getBeyranMenu();
    BeyranOceanRestuarant getBeyranOceanMenu();
    OceanRestuarant getOceanRestuarant();
}
