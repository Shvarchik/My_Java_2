package My_Java_OOP1.Beverages;

public class Lemonade extends Beverage{

    private static String productName = "Лимонад";

    public Lemonade(String name, double price, String unit, int amount, double volume) {
        super(name, price, unit, amount, volume);
    }

    @Override
    public String toString() {
        return String.format("%d. %15s, %s", super.num, productName, super.toString());
    }
}
