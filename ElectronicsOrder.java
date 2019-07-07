package lesson10.homewort10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned().getCity() != null && getShipFromCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
            if (getCustomerOwned().getCity() != null && getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() == "Одесса" || getCustomerOwned().getCity() == "Днепр" || getCustomerOwned().getCity() == "Харьков") {
                if (getTotalPrice() > 100) {
                    if (getCustomerOwned() != null) {
                        if (getCustomerOwned().getGender() == "Женский") {
                            setDateConfirmed(new Date());
                        }
                    }
                }

            }
        }

    }

    @Override
    public double calculatePrice() {
        double sumShip;

        if (getCustomerOwned() != null) {
            if (getCustomerOwned().getCity() != null && getCustomerOwned().getCity() != "Киев" || getCustomerOwned().getCity() != "Одесса") {
               sumShip = getBasePrice() * 1.15;
            } else {
                sumShip = getBasePrice() * 1.10;
            }
            if (sumShip > 1000) {
                setTotalPrice(sumShip * 0.95);
            }
        }
        return getTotalPrice();
    }

}
