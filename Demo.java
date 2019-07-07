package lesson10.homewort10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Order orderOne = new Order() {
            @Override
            void validateOrder() {

            }

            @Override
            void calculatePrice() {
            }

            @Override
            void confirmShipping() {
                super.confirmShipping();
            }
        };

        Order orderTwo = new Order() {
            @Override
            void validateOrder() {

            }

            @Override
            void calculatePrice() {

            }

            @Override
            void confirmShipping() {
                super.confirmShipping();
            }
        };

    }
}
