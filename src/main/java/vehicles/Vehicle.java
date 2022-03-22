package vehicles;

import parts.Engine;
import parts.Tyres;

public abstract class Vehicle {

    private Engine engine;
    private Tyres tyres;
    private int price;
    private String colour;
    private int damage;

    public Vehicle(Engine engine, Tyres tyres, int price, String colour, int damage) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int accruesDamage(int damage) {
        this.damage = damage;
        return this.price -= damage;
    }
}
