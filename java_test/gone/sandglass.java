package java_test.gone;

/* 모래 시계 찍기 */ 
public class sandglass {
    public static void main(String[] args) {
        /* 
         * int i 모래시계 행
         * int j 모래시계 열
         * 
         * i에서 i+1 만큼 최대 5까지 증가한다.
         * 별의 구성은 다음과 같다. (5-3-1-1-3-5)
         * 
         */

         // 모래시계  행 시작
        for(int i=1;i<=6;i++){
            // 모래 시계 구성에 따라 홀수 행만 출력한다.
            int n = i % 2;
            // 홀수 행인 경우
            if(n!=0){
                for(int j=i;j<=5;j++){
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
