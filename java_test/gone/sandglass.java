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
             * j가 증가함에 따라 조건 값 5와 가까워져 실제 출력되는 별의 수는 감소한다.
             */
            if(i<=5){
                for(int j=i;j<=5;j++){
                    System.out.print("*");
                }
            }else{
            /* int k 피라미드 열
             * k는 모래시계 모양에 따라 2부터 출력되어야 한다.
             * 별 출력을 위한 조건은 i가 증가에 비례에 별의 개수가 k+1씩 증가해야 함.
             * 이때, i는 6부터 시작이므로 k 시작값 2보다 큰 3이 위치하기 위해 i-3 처리
             */    
                for(int k=2;k<=i-3;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
