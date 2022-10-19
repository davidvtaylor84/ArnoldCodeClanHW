import vehicles.ISell;

import java.util.HashMap;

public class CarDealership {

    public String nameOfDealership;
    public double till;
    HashMap<String, ISell> stock;
    Customer customer;

    private String selectedCar;

    public CarDealership(String nameOfDealership, double till) {
        this.nameOfDealership = nameOfDealership;
        this.till = till;
        this.stock = new HashMap<>();
    }

    public void addCar(String name, ISell car){
        stock.put(name, car);
    }

    public HashMap<String, ISell> getStock(){
        return stock;
    }

    public ISell getSelectedCar(){
        return this.stock.get(this.selectedCar);
    }

    public void setSelectedCar(String name){
        this.selectedCar = name;
    }

    public void sellCar(String name, Customer customer){
        setSelectedCar(name);
        double salePrice = stock.get(selectedCar).sell();
        this.till += salePrice;
        customer.reduceMoney(salePrice);
        customer.carsOwned.add(stock.get(selectedCar));
        stock.remove(selectedCar);
    }

    public double getTill(){
        return till;
    }
}
