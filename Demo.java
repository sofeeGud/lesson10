package lesson10.homewort10;

import java.util.Date;

public class Demo{

    public static void main(String[] args) {
        Customer customerOne = new Customer("Vova", "Киев", "Мужской");
        Customer customerTwo = new Customer("Тест", "Львов", "Мужской");
        Order orderOneEl = new ElectronicsOrder("Test", new Date(), "Киев", "Львов", 53214, customerOne, 11 );
        Order orderTwoEl = new ElectronicsOrder("Test", new Date(), "Киев", "Львов", 53214, customerOne, 11 );
        Order orderOneF = new FurnitureOrder("Test", new Date(), "Киев", "Львов", 53214, customerTwo, "ujghf" );
        Order orderTwoF = new FurnitureOrder("Test", new Date(), "Киев", "Львов", 53214, customerOne, "ytyfgd" );


        orderOneEl.calculatePrice();
        orderOneEl.validateOrder();
        orderOneEl.confirmShipping();
        orderTwoEl.calculatePrice();
        orderTwoEl.validateOrder();
        orderTwoEl.confirmShipping();
        orderOneF.calculatePrice();
        orderOneF.validateOrder();
        orderOneF.confirmShipping();
        orderTwoF.calculatePrice();
        orderTwoF.validateOrder();
        orderTwoF.confirmShipping();
    }
}
