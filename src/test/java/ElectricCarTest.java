import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    SoundSystem soundSystem;
    Tyres tyres;
    WindowGlass windowGlass;

    @Before
    public void before(){
        soundSystem = new SoundSystem("Sony", "V-7676");
        tyres = new Tyres("Michelin", 225, 14.1, 33);
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
        electricCar = new ElectricCar("X-1872", "Tesla", "Brown", 56776767, tyres, soundSystem, windowGlass, EngineType.ELECTRIC, 100);
    }

    @Test
    public void canGetCarManufacturer(){
        assertEquals("Tesla", electricCar.getManufacturer());
    }

    @Test
    public void canGetPowerType(){
        assertEquals("Battery", electricCar.getPowerTypeFromEnum());
    }

}
