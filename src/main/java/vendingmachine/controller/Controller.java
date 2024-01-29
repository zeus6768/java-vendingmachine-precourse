package vendingmachine.controller;

import java.util.Map;

import vendingmachine.Coin;
import vendingmachine.service.Service;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class Controller {

    private final InputView inputView;
    private final OutputView outputView;
    private final Service service;

    public Controller(InputView inputView, OutputView outputView, Service service) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.service = service;
    }

    public void run() {
        int balance = inputView.askBalance();
        Map<Coin, Integer> coins = service.createRandomCoins(balance);
        outputView.printCoins(coins);
    }
}
