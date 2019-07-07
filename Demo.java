package lesson10.homewort10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Order orderOne = new Order(new Date(), new Date(), 1233.5);
        Order orderTwo = new Order(new Date(), new Date(), 55555.98);

        orderOne.validateOrder();
        orderOne.calculatePrice();
        orderOne.confirmShipping();
        orderTwo.validateOrder();
        orderTwo.calculatePrice();
        orderTwo.confirmShipping();
    }
}
