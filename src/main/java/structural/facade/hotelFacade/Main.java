package structural.facade.hotelFacade;

public class Main {
    public static void main(String[] args) {

        HotelKeeper keeper = new HotelKeeperImpl();
        BeyranRestuarant beyranRestuarant = keeper.getBeyranMenu();
        System.out.println(beyranRestuarant);

    }
}
