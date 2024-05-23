package behavioral.strategy.storeStrategy;

public class Main {
    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("1234", 10));
        shoppingCart.addItem(new Item("5678", 40));

        shoppingCart.pay(new CreditCardStrategy("Farid", "1234 5643 7890 4356",
                399, "08/26"));

    }
}
