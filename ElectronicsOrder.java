package lesson10.homewort10;

import java.util.Date;

public abstract class ElectronicsOrder extends Order {
    int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
            if (getTotalPrice() > 100) {
                if (getCustomerOwned() != null) {
                    if (getCustomerOwned().getGender() == "Женский") {
                        setDateConfirmed(new Date());
                    }
                }

            }
        }

    }

    @Override
    public void calculatePrice() {
        if (getCustomerOwned() != null) {
            if (getShipToCity() != "Киев" || getShipToCity() != "Одесса") {
                setTotalPrice(getBasePrice() * 1.15);
            } else {
                setTotalPrice(getBasePrice() * 1.10);
            }
            if (getTotalPrice() > 1000) {
                setTotalPrice(getBasePrice() * 0.95);
            }
        }
    }

}
