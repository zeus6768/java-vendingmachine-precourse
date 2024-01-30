package vendingmachine.model;

import java.util.Map;

public class VendingMachine {

    private final Map<Coin, Integer> coins;
    private final Map<Product, Integer> products;

    public VendingMachine(Map<Coin, Integer> coins, Map<Product, Integer> products) {
        this.coins = coins;
        this.products = products;
    }
}
