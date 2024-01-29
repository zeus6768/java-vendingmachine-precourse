package vendingmachine;

import java.util.Arrays;

import camp.nextstep.edu.missionutils.Randoms;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static Coin pickRandomCoin() {
        int index = Randoms.pickNumberInRange(0, values().length - 1);
        return Coin.values()[index];
    }

    public static int minAmount() {
        return Arrays.stream(Coin.values()).min((coin1, coin2) -> Math.min(coin1.getAmount(), coin2.getAmount()))
                .orElseThrow(IllegalArgumentException::new)
                .getAmount();
    }
}
