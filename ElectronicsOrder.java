package lesson10.homewort10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

//    @Override
//    void validateOrder() {
//
//        if (getCustomerOwned() != null) {
//            if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
//                    if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
//                        if (getTotalPrice() <= 100) {
//                            if (getCustomerOwned().getGender() == "Женский") {
//                                setDateConfirmed(new Date());
//                            }
//                        }
//                    }
//                }
//            }
//
//        }

        @Override
    void validateOrder() {

//        if (getCustomerOwned() != null) {
//            if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
//                    if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
//                        if (getTotalPrice() <= 100) {
//                            if (getCustomerOwned().getGender() == "Женский") {
//                                setDateConfirmed(new Date());
//                            }
//                        }
//                    }
//                }
//            }

        }


//    @Override
//    public void calculatePrice() {
//        double sumShip;
//        if (getCustomerOwned() != null) {
//            if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса") {
//                sumShip = getBasePrice() * 1.10;
//            } else {
//                sumShip = getBasePrice() * 1.15;
//            }
//            if (sumShip >= 1000) {
//                setTotalPrice(sumShip * 0.95);
//            } else
//                setTotalPrice(sumShip);
//        }
//    }

    @Override
    public void calculatePrice() {
        double sumShip = getBasePrice();
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
            sumShip *= 1.10;
        } else {
            sumShip *= 0.85;
        }

        if (sumShip >= 1000) {
            sumShip *= 0.95;
        }

        setTotalPrice(sumShip);


    }


}
