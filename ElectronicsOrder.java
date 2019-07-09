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

        if (getCustomerOwned() != null && getCustomerOwned().getGender() == "Женский" && getBasePrice() >= 100) {
            if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
                if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {


                    setDateConfirmed(new Date());


                }
            }
        }

    }


    @Override
    public void calculatePrice() {
    double sumShip = getShipToCity()!=null && (getShipToCity() == "Киев" || getShipToCity() == "Одесса") ? 
        getBasePrice() * 0.10 : getBasePrice() * 0.15;
            double bonus = getBasePrice() > 1000 ? (getBasePrice() + sumShip) * 0.05 : 0;
            setTotalPrice(getBasePrice() + sumShip - bonus);
        }
    
}

