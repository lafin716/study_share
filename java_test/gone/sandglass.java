package java_test.gone;

/* 모래 시계 찍기 */ 
public class sandglass {
    public static void main(String[] args) {
        /* 
         * int i 피라미드 행
         * i에서 i+1 만큼 최대 10까지 증가한다.
         */
        for(int i=1;i<=10;i++){
            /* int j 피라미드 열
             * j는 i부터 j+1 만큼 증가한다.
             */
            if(i<=5){
                for(int j=i;j<=5;j++){
                    System.out.print("*");
                }
            }else{
                for(int k=2;k<=i-3;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
