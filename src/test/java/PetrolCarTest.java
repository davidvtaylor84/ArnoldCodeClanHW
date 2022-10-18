import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;
import org.junit.Before;
import org.junit.Test;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    SoundSystem soundSystem;
    Tyres tyres;
    WindowGlass windowGlass;

    @Before
    public void before(){
        soundSystem = new SoundSystem("Sony", "V-7676");
        tyres = new Tyres("Michelin", 225, 14.1, 33);
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
        petrolCar = new PetrolCar("Picasso", "Ford", "Brown", 56776767, tyres, soundSystem, windowGlass, EngineType.PETROL_ENGINE, 60);

    }

    @Test
    public void canGetCarModel(){
        assertEquals("Picasso", petrolCar.getModel());
    }

    @Test
    public void canGetTyreManufacturer(){
        assertEquals("Michelin", petrolCar.getManufacturer());
    }

}
