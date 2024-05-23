package behavioral.strategy.storeStrategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private int cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, int cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " was paid with credit card ");
    }
}
