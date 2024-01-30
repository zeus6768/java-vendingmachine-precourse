package vendingmachine.view;

import java.util.Map;

import vendingmachine.model.Coin;

public class OutputView {

    public void printCoins(Map<Coin, Integer> coins) {
        System.out.println("\n자판기가 보유한 동전");
        for (Coin coin : coins.keySet()) {
            int count = coins.get(coin);
            System.out.printf("%d원 - %d개%n", coin.getAmount(), count);
        }
        System.out.println();
    }
}
