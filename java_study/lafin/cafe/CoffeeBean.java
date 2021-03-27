package java_study.lafin.cafe;

public class CoffeeBean {
    private String name;
    private int caffeine;
    private int bitter;
    private int sour;
    private int amount;

    
    public void setName(String name){
        this.name = name;
    }

    public void setCaffeine(int caffeine){
        this.caffeine = caffeine;
    }

    public void setBitter(int bitter){
        this.bitter = bitter;
    }

    public void setSour(int sour){
        this.sour = sour;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public int getCaffeine(){
        return caffeine;
    }

    public int getBitter(){
        return bitter;
    }

    public int getSour(){
        return sour;
    }

    public int getAmount(){
        return amount;
    }
}
