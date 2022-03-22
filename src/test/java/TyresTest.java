import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.Tyres;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void setUp() {
        tyres = new Tyres(20);
    }

    @Test
    public void hasHorsepower(){
        assertEquals(20, tyres.getPressure());
    }
}
