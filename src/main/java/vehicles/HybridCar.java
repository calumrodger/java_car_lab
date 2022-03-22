package vehicles;

import behaviours.IStart;
import parts.Engine;
import parts.Tyres;

public class HybridCar extends Vehicle implements IStart {

    private int fuelCapacity;
    private int batteryCapacity;

    public HybridCar(Engine engine, Tyres tyres, int price, String colour, int damage, int fuelCapacity, int batteryCapacity) {
        super(engine, tyres, price, colour, damage);
        this.fuelCapacity = fuelCapacity;
        this.batteryCapacity = batteryCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String start() {
        return "Hit the leccy then the gas!";
    }
}
