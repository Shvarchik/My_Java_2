package My_Java_OOP1.Hygiene;

public class Mask extends Hygiene {

    private static String productName = "Маска мед.";

    public Mask(String name, double price, String unit, int amount, int amountInPack) {
        super(name, price, unit, amount, amountInPack);
    }

    @Override
    public String toString() {
        return String.format("%d. %15s, %s", super.num, productName, super.toString());
    }
}
