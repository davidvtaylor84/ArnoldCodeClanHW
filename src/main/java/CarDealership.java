import vehicles.IDrive;

import java.util.HashMap;

public class CarDealership {

    public String nameOfDealership;
    public double till;
    HashMap<String, IDrive> stock;

    private String carToSell;

    public CarDealership(String nameOfDealership, double till, HashMap<String, IDrive> stock) {
        this.nameOfDealership = nameOfDealership;
        this.till = till;
        this.stock = stock;
    }
}
