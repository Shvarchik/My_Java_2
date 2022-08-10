package Sem1.Task2.Food;

public class Eggs extends Food {

    private int amountInPack;
    private static String productName = "Яйцо";

    public Eggs(String name, double price, String unit, int amount, int year, int month, int day, int inPack) {
        super(name, price, unit, amount, year, month, day);
        this.amountInPack = inPack;
    }

    @Override
    public String toString() {
        return String.format("%d. %15s, %s, %d/уп.", super.num, productName, super.toString(), this.amountInPack);
    }

    
    
}
