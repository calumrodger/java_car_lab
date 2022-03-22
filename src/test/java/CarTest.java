
import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.Tyres;
import people.Customer;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Customer customer;
    Car car1;
    Engine engine1;
    Tyres tyres1;
    ArrayList<Vehicle> carCollection;

    @Before
    public void setUp() {
        engine1 = new Engine(90);
        tyres1 = new Tyres(100);
        car1 = new Car(engine1, tyres1, 200000, "blue", 0, 100);
        customer = new Customer(20000, carCollection);
    }

    @Test
    public void hasEngine(){
        assertEquals(engine1, car1.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres1, car1.getTyres());
    }

    @Test
    public void canStart(){
        assertEquals("Hit the gas!", car1.start());
    }

    @Test
    public void canAccrueDamage(){
        assertEquals(190000, car1.accruesDamage(10000));
    }
}
