package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        System.out.println("Checkout method from demo ShoppingCart is called status is " + status);
    }

    public int returnDemo() {
        return 2;
    }
}
