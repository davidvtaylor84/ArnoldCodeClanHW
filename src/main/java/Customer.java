import vehicles.ISell;
import vehicles.PetrolCar;

import java.util.ArrayList;

public class Customer {

    PetrolCar petrolCar;
    private String name;
    private double funds;
    ArrayList<ISell> carsOwned;

    private String CarName;

    public Customer(String name, double funds) {
        this.name = name;
        this.funds = funds;
        this.carsOwned = new ArrayList<>();
    }

    public int getNumberOfCarsOwned(){
        return carsOwned.size();
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void buyCar(ISell car){
        carsOwned.add(car);
    }

    public void reduceMoney(double pay){
        funds -= pay;
    }
}
