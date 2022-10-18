import carComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Michelin", 225, 14.1, 33);
    }

    @Test
    public void tyresHaveManufacturer(){
        assertEquals("Michelin", tyres.getTyreManufacturer());
    }

    @Test
    public void tyresHaveTread(){
        assertEquals(225, tyres.getTread());
    }



}
