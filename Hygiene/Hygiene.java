package My_Java_OOP1.Hygiene;

import java.util.ArrayList;
import My_Java_OOP1.Goods;

public abstract class Hygiene extends Goods{

    protected int amountInPack;
    private static ArrayList<String> namesHygiene;

    static {
        namesHygiene = new ArrayList<String>();
    }

    public Hygiene(String name, double price, String unit, int amount, int amountInPack) {
        super(name, price, unit, amount);
        this.amountInPack = amountInPack;
        if ( namesHygiene.indexOf(name) == -1) 
            Hygiene.namesHygiene.add(name);
        
    }

    @Override
    public String toString() {
        return String.format("%15s, price: %7.2f, amount:%5d, %5s, %2d/уп.", 
            this.name, this.price, this.amount, this.unit, this.amountInPack);
    }

    public static void printList (){
        System.out.println("Предметы гигиены:");
        for (int i = 1; i <= namesHygiene.size(); i++){
            System.out.println(String.format("%d. %-20s", i, namesHygiene.get(i-1).toString()));
        }

    }
}