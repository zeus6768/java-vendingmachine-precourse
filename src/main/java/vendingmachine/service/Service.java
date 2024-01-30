package vendingmachine.service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import vendingmachine.model.Coin;

public class Service {

    public Map<Coin, Integer> createRandomCoins(int balance) {
        Map<Coin, Integer> coins = new LinkedHashMap<>();
        Arrays.stream(Coin.values()).forEach(coin -> coins.put(coin, 0));
        while (balance >= Coin.minAmount()) {
            Coin coin = Coin.pickRandomCoin();
            if (balance >= coin.getAmount()) {
                balance -= coin.getAmount();
                coins.put(coin, coins.get(coin) + 1);
            }
        }
        return coins;
    }


}
