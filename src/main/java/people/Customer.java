package people;

import vehicles.Car;
import vehicles.Vehicle;
import people.Dealership;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicleCollection;

    public Customer(int money, ArrayList<Vehicle> vehicleCollection) {
        this.money = money;
        this.vehicleCollection = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehicleCollection() {
        return vehicleCollection;
    }

    public void setVehicleCollection(ArrayList<Vehicle> vehicleCollection) {
        this.vehicleCollection = vehicleCollection;
    }

    public int getVehicleCollectionSize(){
        return this.vehicleCollection.size();
    }

    public void addVehicleToCollection(Vehicle vehicle){
        this.vehicleCollection.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        this.vehicleCollection.add(vehicle);
        this.money -= vehicle.getPrice();
    }
}
