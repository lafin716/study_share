package java_test.gone;

/* 모래 시계 찍기 */ 
public class sandglass {
    public static void main(String[] args) {
        /* 
         * int i 피라미드 행
         * int j 피라미드 열
         * 
         * i에서 i+1 만큼 최대 5까지 증가한다.
         * 별의 구성은 다음과 같다. (5-3-1-1-3-5)
         * 
         * 피라미드는 좌우 띄어쓰기로 정가운데로 출력되며 다음과 같은 규칙을 같는다.
         * 출력되는 행의 시작 열과 마지막 열은 반드시 띄어씌기가 출력된다.
         * 띄어쓰기가 포함된 구성은 다음과 같다.(7-5-3-3-5-7)
         */      
        for(int i=1;i<=6;i++){
            int n = i % 2;
            if(n!=0){
                for(int j=i;j<=7;j++){
                    int m = j % 2;
                    if(m!=0 && (j==i||j==7)){
                        System.out.print("|");
                    }else{
                        System.out.print("*");
                    }                    
                }
                System.out.println();
            }
        }
    }
}
