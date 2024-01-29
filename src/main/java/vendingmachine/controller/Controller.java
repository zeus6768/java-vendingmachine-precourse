package vendingmachine.controller;

import java.util.Map;

import vendingmachine.Coin;
import vendingmachine.service.Service;
import vendingmachine.view.InputView;

public class Controller {

    private final InputView inputView;
    private final Service service;

    public Controller(InputView inputView, Service service) {
        this.inputView = inputView;
        this.service = service;
    }

    public void run() {
        int balance = inputView.askBalance();
        Map<Coin, Integer> coins = service.createRandomCoins(balance);
    }
}
