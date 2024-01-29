package vendingmachine.controller;

import vendingmachine.view.InputView;

public class Controller {

    private final InputView inputView;

    public Controller(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        int balance = inputView.askBalance();
    }
}
