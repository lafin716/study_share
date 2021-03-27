package java_study.lafin.cafe;

public class Americano extends Coffee{
    static final String name = "아메리카노";

    public Americano(CoffeeBean coffeeBean, int water, boolean isIced){
        super(name, coffeeBean, water, isIced);
    }
}
