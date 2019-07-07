package lesson10.homewort10;

import java.util.Date;

public abstract class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(Date dateConfirmed, Date dateShipped, double totalPrice, String furnitureCode) {
        super(dateConfirmed, dateShipped, totalPrice);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
            if (getTotalPrice() < 500) {
                if (getCustomerOwned() != null || getCustomerOwned().getName() != "Тест") {
                    setDateConfirmed(new Date());
                }
            }
        }

    }

    @Override
    public void calculatePrice() {
        if (getTotalPrice() < 5000) {
            setTotalPrice(getBasePrice() * 1.05);
        } else {
            setTotalPrice(getBasePrice() * 1.02);
        }
    }
}
