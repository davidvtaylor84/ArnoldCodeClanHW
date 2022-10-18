import carComponents.SoundSystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoundSystemTest {

    SoundSystem soundSystem;

    @Before
    public void before(){
        soundSystem = new SoundSystem("Sony", "V-7676");
    }

    @Test
    public void soundSystemHasManufacturer(){
        assertEquals("Sony", soundSystem.getManufacturer());
    }

}
