package vehicles;

import behaviours.IStart;
import parts.Engine;
import parts.Tyres;

public class ElectricCar extends Vehicle implements IStart {

    private int batteryCapacity;

    public ElectricCar(Engine engine, Tyres tyres, int price, String colour, int damage, int batteryCapacity) {
        super(engine, tyres, price, colour, damage);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String start() {
        return "Hit the leccy!";
    }
}
