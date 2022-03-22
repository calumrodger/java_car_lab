import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.Tyres;
import people.Customer;
import people.Dealership;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car ownerCar;
    Car dealerCar;
    Engine engine1;
    Tyres tyres1;
    ArrayList<Vehicle> customerCarCollection;
    ArrayList<Vehicle> dealerStock;
    Dealership dealership;

    @Before
    public void setUp() {
        engine1 = new Engine(20);
        tyres1 = new Tyres(100);
        ownerCar = new Car(engine1, tyres1, 20000, "blue", 0, 100);
        dealerCar = new Car(engine1, tyres1, 30000, "green", 0, 100);
        customer = new Customer(30000, customerCarCollection);
        dealership = new Dealership(100000, dealerStock);
    }

    @Test
    public void hasVehicleCollection(){
        customer.addVehicleToCollection(ownerCar);
        assertEquals(1, customer.getVehicleCollectionSize());
    }

    @Test
    public void canBuyVehicle(){
        customer.addVehicleToCollection(ownerCar);
//        dealership.addVehicleToStock(dealerCar);
        customer.buyVehicle(dealerCar);
        assertEquals(0, customer.getMoney());
        assertEquals(2, customer.getVehicleCollectionSize());
//        assertEquals(0, dealership.getStockSize());
//        assertEquals(130000, dealership.getTill());

    }
}
