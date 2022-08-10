package My_Java_OOP1.ChildrensGoods;

import java.util.ArrayList;
import My_Java_OOP1.Goods;

public class ChildrenGoods extends Goods{

    protected int minAge;
    protected Boolean hyppoAllergic;
    private static ArrayList<String> namesChildrenGoods;

    static {
        namesChildrenGoods = new ArrayList<String>();
    }

    public ChildrenGoods (String name, double price, String unit, int amount, int minAge, Boolean hypoAllergic) {
        super(name, price, unit, amount);
        this.minAge = minAge;
        this.hyppoAllergic = hypoAllergic;

        if ( namesChildrenGoods.indexOf(name) == -1) 
            namesChildrenGoods.add(name);
        
    }

    @Override
    public String toString() {
        String str = String.format("%15s, price: %7.2f, amount:%5d, %3s, %2d", 
            this.name, this.price, this.amount, this.unit, this.minAge);
        if (this.hyppoAllergic) 
            str+= ", гиппоалергенный продукт";
        return str;
    }

    


    
}
