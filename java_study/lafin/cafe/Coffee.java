package java_study.lafin.cafe;

import java.util.ArrayList;

public class Coffee {
    private String name;
    private CoffeeBean coffeeBean;
    private int water;
    private boolean isIced;
    private ArrayList<AdditionalIngredient> additions;

    public Coffee(String name, CoffeeBean coffeeBean, int water, boolean isIced){
        setName(name);
        setCoffeeBean(coffeeBean);
        setWater(water);
        setIsIced(isIced);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCoffeeBean(CoffeeBean coffeeBean){
        this.coffeeBean = coffeeBean;
    }

    public void setWater(int water){
        this.water = water;
    }

    public void setIsIced(boolean isIced){
        this.isIced = isIced;
    }

    public void addAdditionalIngredient(AdditionalIngredient addition){
        if(this.additions == null){
            this.additions = new ArrayList<>();
        }

        this.additions.add(addition);
    }

    public String getName(){
        return name;
    }

    public CoffeeBean getCoffeeBean(){
        return coffeeBean;
    }

    public int getWater(){
        return water;
    }

    public boolean getIsIced(){
        return isIced;
    }

    public ArrayList<AdditionalIngredient> getAdditionalIngredient(){
        return additions;
    }
    
    public void print(){
        System.out.println("[name="+name+", coffeeBean="+coffeeBean.getName()+", water="+water+", isIced=" + isIced);
        System.out.println("추가재료 : ");

        if(additions != null){
            for(AdditionalIngredient tmp : additions){
                System.out.println(tmp.getName());
            }
        }
        
    }
}
