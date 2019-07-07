package lesson10.homewort10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Order orderOne = new Order("Test", new Date(), "Sumy", "Kyev", 6954, Customer);
        Order orderTwo = new Order("Test", new Date(), "Sumy", "Kyev", 6954, Customer);

        orderOne.validateOrder();
        orderOne.calculatePrice();
        orderOne.confirmShipping();
        orderTwo.validateOrder();
        orderTwo.calculatePrice();
        orderTwo.confirmShipping();
    }
}
