package lesson10.homewort10;

import java.util.Date;

public abstract class ElectronicsOrder extends Order {
    int guaranteeMonths;

    public ElectronicsOrder(Date dateConfirmed, Date dateShipped, double totalPrice, int guaranteeMonths) {
        super(dateConfirmed, dateShipped, totalPrice);
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
