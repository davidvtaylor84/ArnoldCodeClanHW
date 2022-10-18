import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    SoundSystem soundSystem;
    Tyres tyres;
    WindowGlass windowGlass;

    @Before
    public void before(){
        soundSystem = new SoundSystem("Sony", "V-7676");
        tyres = new Tyres("Michelin", 225, 14.1, 33);
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
        hybridCar = new HybridCar("Crazy Car", "Vauxhall", "Brown", 56776767, tyres, soundSystem, windowGlass, EngineType.HYBRID, 100, 80);
    }

    @Test
    public void canGetFuelCapacity(){
        assertEquals(80, hybridCar.getFuelCapacity());
    }

    @Test
    public void canGetPowerType(){
        assertEquals("Petrol/Battery", hybridCar.getPowerTypeFromEnum());
    }

}
