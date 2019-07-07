package lesson10.homewort10;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned() != null) {
            if (getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
                if (getTotalPrice() < 500) {
                    if (getCustomerOwned() != null || getCustomerOwned().getName() != "Тест") {
                        setDateConfirmed(new Date());
                    }
                }
            }
        }

    }

    @Override
    public double calculatePrice() {
        
        if (getCustomerOwned() != null) {
            if (getTotalPrice() < 5000) {
                setTotalPrice(getBasePrice() * 1.05);
            } else {
                setTotalPrice(getBasePrice() * 1.02);
            }
        }
        return getTotalPrice();
    }
}
