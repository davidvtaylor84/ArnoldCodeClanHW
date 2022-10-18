import vehicles.IDrive;

import java.util.HashMap;

public class Customer {

    private String name;
    private double funds;
    HashMap<String, IDrive> carsOwners;

    private String CarName;

    public Customer(String name, double funds, HashMap<String, IDrive> carsOwners) {
        this.name = name;
        this.funds = funds;
        this.carsOwners = carsOwners;
    }
}
