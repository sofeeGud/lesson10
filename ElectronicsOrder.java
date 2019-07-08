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
        //if (getCustomerOwned() != null && getBasePrice() != 0) {
           // if (getShipToCity() != null && getShipFromCity() != null) {
                double sumShip = getBasePrice();
                double ship = 0;

                if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
                    ship = sumShip * 0.1;
                } else {
                    ship = sumShip * 0.15;
                }

                if (getBasePrice() > 1000) {
                    sumShip *= 0.95;
                }

                sumShip += ship;
                
                setTotalPrice(sumShip);
            }
        }

   // }


//}
