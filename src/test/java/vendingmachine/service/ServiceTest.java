package vendingmachine.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import vendingmachine.Coin;

class ServiceTest {

    final Service service = new Service();

    @ParameterizedTest
    @ValueSource(ints = {100, 150, 450, 1000, 5000})
    void createRandomCoinTest(int balance) {
        Map<Coin, Integer> coins = service.createRandomCoins(balance);
        int sum = 0;
        for (Coin coin : coins.keySet()) {
            int count = coins.get(coin);
            for (int i = 0; i < count; i++) {
                sum += coin.getAmount();
            }
        }
        assertThat(sum).isEqualTo(balance);
    }
}
