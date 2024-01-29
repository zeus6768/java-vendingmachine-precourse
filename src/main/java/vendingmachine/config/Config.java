package vendingmachine.config;

import vendingmachine.controller.Controller;
import vendingmachine.view.InputView;

public class Config {

    private static Config config;

    private InputView inputView;
    private Controller controller;

    private Config() {}

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public InputView inputView() {
        if (inputView == null) {
            inputView = new InputView();
        }
        return inputView;
    }

    public Controller controller() {
        if (controller == null) {
            controller = new Controller(inputView());
        }
        return controller;
    }
}
