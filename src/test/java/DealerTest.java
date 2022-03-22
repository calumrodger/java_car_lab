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

public class DealerTest {

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
        dealerCar = new Car(engine1, tyres1, 30000, "green", 50000, 100);
        customer = new Customer(30000, customerCarCollection);
        dealership = new Dealership(100000, dealerStock);
    }


    @Test
    public void canBuyVehicle(){
//        dealership.addVehicleToCollection(ownerCar);
//        dealership.addVehicleToStock(dealerCar);
        dealership.buyVehicle(dealerCar);
        assertEquals(70000, dealership.getTill());
        assertEquals(1, dealership.getStockSize());
//        assertEquals(0, dealership.getStockSize());
//        assertEquals(130000, dealership.getTill());

    }

    @Test
    public void canSellVehicle(){
        dealership.addVehicleToStock(dealerCar);
        dealership.sellVehicle(dealerCar, customer);
//        customer.buyVehicle(dealerCar);
        assertEquals(130000, dealership.getTill());
        assertEquals(0, dealership.getStockSize());
        assertEquals(0, customer.getMoney());
        assertEquals(1, customer.getVehicleCollectionSize());
    }

    @Test
    public void canRepairDamage(){
        dealership.repairVehicle(dealerCar);
        assertEquals(0, dealerCar.getDamage());
        assertEquals(50000, dealership.getTill());
    }
}

