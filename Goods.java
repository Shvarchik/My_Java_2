package My_Java_OOP1;

public abstract class Goods {

    static int number;
    protected int num;
    protected String name;
    protected double price;
    protected String unit;
    protected int amount;
    
    static {
        number = 0;
    }
    public Goods (String name, double price, String unit,int amount){
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.amount = amount;
        number++;
        this.num = number;
    }

    @Override
    public abstract String toString();
}
