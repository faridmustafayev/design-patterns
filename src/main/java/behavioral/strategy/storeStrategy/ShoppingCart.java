package behavioral.strategy.storeStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item :
                itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
