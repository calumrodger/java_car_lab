package vehicles;

import behaviours.IStart;
import parts.Engine;
import parts.Tyres;

public class Car extends Vehicle implements IStart {

    int fuelCapacity;

    public Car(Engine engine, Tyres tyres, int price, String colour, int damage, int fuelCapacity) {
        super(engine, tyres, price, colour, damage);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String start() {
        return "Hit the gas!";
    }
}
