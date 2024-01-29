package vendingmachine;

import vendingmachine.config.Config;
import vendingmachine.controller.Controller;

public class Application {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        Controller controller = config.controller();
        controller.run();
    }
}
