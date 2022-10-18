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

public class CustomerTest {

    Customer customer;
    CarDealership carDealership;
    SoundSystem soundSystem;
    Tyres tyres;
    WindowGlass windowGlass;
    ElectricCar electricCar;
    HybridCar hybridCar;
    PetrolCar petrolCar;

    @Before
    public void before(){
        customer = new Customer("Ricky Martin", 4000.00);
        carDealership = new CarDealership("Shady Cars", 90.00);
        soundSystem = new SoundSystem("Sony", "V-7676");
        tyres = new Tyres("Michelin", 225, 14.1, 33);
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
        electricCar = new ElectricCar("X-1872", "Tesla", "Brown", 56776767, tyres, soundSystem, windowGlass, EngineType.ELECTRIC, 100);
        hybridCar = new HybridCar("Crazy Car", "Vauxhall", "Brown", 30000, tyres, soundSystem, windowGlass, EngineType.HYBRID, 90, 80);
        petrolCar = new PetrolCar("Picasso", "Ford", "Brown", 3000.00, tyres, soundSystem, windowGlass, EngineType.PETROL_ENGINE, 60);
        carDealership.addCar("X-1872", electricCar);
        carDealership.addCar("Crazy Car", hybridCar);
    }

//    @Test
//    public void customerCanBuyCar(){
//        customer.buyCar(petrolCar);
//        assertEquals(1, customer.getNumberOfCarsOwned());
//        assertEquals(1000.00, customer.getFunds(), 0.1);
//    }


}
