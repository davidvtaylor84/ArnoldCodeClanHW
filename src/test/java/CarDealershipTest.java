import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CarDealershipTest {

    CarDealership carDealership;
    SoundSystem soundSystem;
    Tyres tyres;
    WindowGlass windowGlass;
    ElectricCar electricCar;
    HybridCar hybridCar;
    PetrolCar petrolCar;
    Customer customer;

    @Before
    public void before(){
        carDealership = new CarDealership("Shady Cars", 90.00);
        soundSystem = new SoundSystem("Sony", "V-7676");
        tyres = new Tyres("Michelin", 225, 14.1, 33);
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
        electricCar = new ElectricCar("X-1872", "Tesla", "Brown", 56776767, tyres, soundSystem, windowGlass, EngineType.ELECTRIC, 100);
        hybridCar = new HybridCar("Crazy Car", "Vauxhall", "Brown", 3000, tyres, soundSystem, windowGlass, EngineType.HYBRID, 90, 80);
        petrolCar = new PetrolCar("Picasso", "Ford", "Brown", 3000, tyres, soundSystem, windowGlass, EngineType.PETROL_ENGINE, 60);
        carDealership.addCar("X-1872", electricCar);
        carDealership.addCar("CrazyCar", hybridCar);
        customer = new Customer("Ricky Martin", 4000.00);


    }

    @Test
    public void canAddCarsToStock(){
        carDealership.addCar("Ford Picasso", petrolCar);
        assertEquals(petrolCar, carDealership.getStock().get("Ford Picasso"));
    }

    @Test
    public void canSetSelectedCar(){
        carDealership.addCar("Ford Picasso", petrolCar);
        carDealership.setSelectedCar("Ford Picasso");
        assertEquals(petrolCar, carDealership.getSelectedCar());
    }

    @Test
    public void canSellCar(){
        carDealership.sellCar("CrazyCar", customer);
        assertEquals(1, carDealership.stock.size());
        assertEquals(3090, carDealership.getTill(), 0.1);
        assertEquals(1000, customer.getFunds(), 0.1);
        assertEquals(1, customer.getNumberOfCarsOwned());
    }



}
