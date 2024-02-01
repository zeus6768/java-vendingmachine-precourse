package vendingmachine.view;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.model.Product;

public class InputView {

    private static final String PRODUCT_REGEX = "\\[([^,]+),\\s*(\\d+),\\s*(\\d+)\\]";
    private static final Pattern REGEX_PATTERN = Pattern.compile(PRODUCT_REGEX);

    public int askBalance() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public Map<Product, Integer> askProducts() {
        System.out.println("상품명과 가격, 수량을 입력해 주세요.");
        String productDescription = Console.readLine();
        return validateProducts(productDescription);
    }

    public int askInputAmount() {
        System.out.println("투입 금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    private Map<Product, Integer> validateProducts(String productDescription) {
        Map<Product, Integer> products = new HashMap<>();
        String[] productDetailsSplit = productDescription.split(";");
        for (String productDetail : productDetailsSplit) {
            Matcher matcher = REGEX_PATTERN.matcher(productDetail);
            if (matcher.matches()) {
                String productName = matcher.group(1);
                int price = Integer.parseInt(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                Product product = new Product(productName, price);
                products.put(product, quantity);
            }
        }
        return products;
    }
}
