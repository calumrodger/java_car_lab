import org.junit.Before;
import org.junit.Test;
import parts.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine(20);
    }

    @Test
    public void hasHorsepower(){
        assertEquals(20, engine.getHorsepower());
    }
}
