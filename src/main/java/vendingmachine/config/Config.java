package vendingmachine.config;

import vendingmachine.controller.Controller;
import vendingmachine.service.Service;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class Config {

    private static Config config;

    private InputView inputView;
    private OutputView outputView;
    private Controller controller;
    private Service service;

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

    public OutputView outputView() {
        if (outputView == null) {
            outputView = new OutputView();
        }
        return outputView;
    }

    public Controller controller() {
        if (controller == null) {
            controller = new Controller(
                    inputView(),
                    outputView(),
                    service()
            );
        }
        return controller;
    }

    public Service service() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }
}
