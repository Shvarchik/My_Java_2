package My_Java_OOP1.ChildrensGoods;

public class Pasifier extends ChildrenGoods{

    private static String productName = "Cоска-пустышка";

    public Pasifier(String name, double price, String unit, int amount, int minAge, Boolean hypoAllergic) {
        super(name, price, unit, amount, minAge, hypoAllergic);
        
    }
    @Override
    public String toString() {
        return String.format("%d. %15s, %s", super.num, productName, super.toString());
    }

    
    
}
