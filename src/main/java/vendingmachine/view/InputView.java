package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public int askBalance() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }
}
