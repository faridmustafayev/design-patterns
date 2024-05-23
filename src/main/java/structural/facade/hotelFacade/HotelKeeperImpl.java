package structural.facade.hotelFacade;

public class HotelKeeperImpl implements HotelKeeper{
    @Override
    public BeyranRestuarant getBeyranMenu() {
        BeyranRestuarant beyranRestuarant = new BeyranRestuarant();
        return beyranRestuarant;
    }

    @Override
    public BeyranOceanRestuarant getBeyranOceanMenu() {
        BeyranOceanRestuarant beyranOceanRestuarant = new BeyranOceanRestuarant();
        return beyranOceanRestuarant;
    }

    @Override
    public OceanRestuarant getOceanRestuarant() {
        OceanRestuarant oceanRestuarant = new OceanRestuarant();
        return oceanRestuarant;
    }
}
