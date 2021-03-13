package java_test.gone;

/* 모래 시계 찍기 */ 
public class sandglass {
    public static void main(String[] args) {
        // 첫번 째 가로
        for(int i=1;i<=6;i++){
            // 첫번 째 세로 5개
            for(int j=i;j<=6;j++){
                if(j==i){
                    System.out.print("$");
                }
                System.out.print("*");
                if(j==6){
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        // 두번 째 가로
        for(int k = 1;k<=5;k++){
            // 두번 째 세로 5개
            for(int n = 0;n<=k;n++){
                if(n==k){
                    //System.out.print("$");
                }
                System.out.print("*");
                if(n==k){
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }
}
