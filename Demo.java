package lesson10.homewort10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customerOne = new Customer("Vova", "Киев", "Мужской");
        Customer customerTwo = new Customer("Тест", "Львов", "Мужской");
        Order orderOne = new Order("Test", new Date(), "Sumy", "Kyev", 6954, customerOne);
        Order orderTwo = new Order("Test", new Date(), "Sumy", "Kyev", 6954, customerTwo);

        orderOne.validateOrder();
        orderOne.calculatePrice();
        orderOne.confirmShipping();
        orderTwo.validateOrder();
        orderTwo.calculatePrice();
        orderTwo.confirmShipping();
    }
}
