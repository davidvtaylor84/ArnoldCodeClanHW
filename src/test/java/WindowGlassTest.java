import carComponents.WindowGlass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindowGlassTest {

    WindowGlass windowGlass;

    @Before
    public void before(){
        windowGlass = new WindowGlass("Glasshouse", 0.7 );
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Glasshouse", windowGlass.getManufacturer());
    }


}
