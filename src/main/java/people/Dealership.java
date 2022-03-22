package people;

import vehicles.Car;
import vehicles.Vehicle;
import people.Customer;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> stock;

    public Dealership(int till, ArrayList<Vehicle> stock) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Vehicle> stock) {
        this.stock = stock;
    }

    public void addVehicleToStock(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void removeVehicleFromStock(Vehicle vehicle){
        this.stock.remove(vehicle);
    }

    public int getStockSize() {
        return this.stock.size();
    }

    public void addVehicleToCollection(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
        this.till -= vehicle.getPrice();
    }

//    public void sellVehicle(Vehicle vehicle){
//        this.stock.remove(vehicle);
//        this.till += vehicle.getPrice();
//    }

    public void sellVehicle(Vehicle vehicle, Customer customer){
        customer.setMoney(customer.getMoney() - vehicle.getPrice());
        customer.addVehicleToCollection(vehicle);
        removeVehicleFromStock(vehicle);
        this.till += vehicle.getPrice();
    }

    public void repairVehicle(Vehicle vehicle){
        this.till -= vehicle.getDamage();
        vehicle.setDamage(0);
    }
}
