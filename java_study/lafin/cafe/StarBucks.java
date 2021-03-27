package java_study.lafin.cafe;

import java.util.Scanner;

public class StarBucks {
    
    CoffeeBean bean;
    Coffee coffee;

    public StarBucks(){
        
    }

    public void setCoffeeBean(String type){

        switch(type){
            case "V":
                this.bean = new VerendaBlend();
                break;
            case "H":
                this.bean = new HouseBlend();
                break;
            case "M":
                this.bean = new HouseBlend();
                break;
            default:
                this.bean = new VerendaBlend();
                break;
        }
    }

    public Coffee getAmericano(int water, boolean isIced){
        this.coffee = new Americano(bean, water, isIced);
        return this.coffee;
    }

    public Coffee getLatte(int water, int milk, boolean isIced){
        this.coffee = new Latte(bean, water, isIced, milk);
        return this.coffee;
    }

    public static void main(String[] args) {

        StarBucks sb = new StarBucks();

        // 고객이 원하는 대로 만들어 먹기
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("어떤 메뉴를 드실래여? : ");
            String menu = sc.next();


            System.out.print("블랜드를 골라주세요. : ");
            String blend = sc.next();

            sb.setCoffeeBean(blend);

            System.out.print("양은 얼마나 드릴까요? : ");
            int water = sc.nextInt();

            System.out.print("아이스를 원하시나요? : ");
            int iced = sc.nextInt();
            boolean isIced = iced == 1 ? true : false;

            Coffee orderCoffee = null;

            if(menu.equals("L")){
                System.out.print("우유양은 얼마나 드릴까요? : ");
                int milk = sc.nextInt();

                orderCoffee = sb.getLatte(water, milk, isIced);
            }else{
                orderCoffee = sb.getAmericano(water, isIced);
            }

            System.out.println("주문하신 커피 나왔습니다~ 창곤 고객님~");
            orderCoffee.print();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
