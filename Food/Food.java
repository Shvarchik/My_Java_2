package Sem1.Task2.Food;

import java.time.LocalDate;
import Sem1.Task2.Goods;
import java.util.ArrayList;

public abstract class Food extends Goods {

    protected LocalDate expirationDate;
    private static ArrayList<String> namesFood;

    static {
        namesFood = new ArrayList<String>();
    }

    public Food (String name, double price, String unit,int amount,int year,int month, int day) {
        super (name, price, unit, amount);
        this.expirationDate = LocalDate.of(year, month, day);
        if ( namesFood.indexOf(name) == -1) 
            Food.namesFood.add(name);
    }

    @Override
    public String toString() {
        return String.format("%15s, price: %7.2f, amount:%5d, %5s, %s",
          this.name, this.price, this.amount, this.unit, this.expirationDate);
    }
}
