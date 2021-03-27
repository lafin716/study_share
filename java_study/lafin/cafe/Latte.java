package java_study.lafin.cafe;

public class Latte extends Coffee{
    static final String name = "Latte";

    public Latte(CoffeeBean coffeeBean, int water, boolean isIced, int milkAmount){
        super(name, coffeeBean, water, isIced);
        addAdditionalIngredient(new Milk(milkAmount));
    }
}
