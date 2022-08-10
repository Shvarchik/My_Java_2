package My_Java_OOP1.Beverages;

import java.util.ArrayList;

import My_Java_OOP1.Goods;

public abstract class Beverage extends Goods {

    protected double volume;
    private static ArrayList<String> namesBeverage;

    static {
        namesBeverage = new ArrayList<String>();
    }

    public Beverage(String name, double price, String unit, int amount, double volume) {
        super(name, price, unit, amount);
        this.volume = volume;
        if ( namesBeverage.indexOf(name) == -1) 
            Beverage.namesBeverage.add(name);
    }

    @Override
    public String toString() {
        return String.format("%15s, price: %7.2f, amount:%5d, %5s, %.2f мл.",
          this.name, this.price, this.amount, this.unit, this.volume);
    }
}
