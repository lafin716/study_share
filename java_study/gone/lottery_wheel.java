package java_study.gone;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/package-summary.html
import java.util.Random;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
import java.util.Arrays;

public class lottery_wheel {
    public static void main(String[] args) {
        /* 로또 규칙
         * 1~45까지의 숫자만 나올 수 있다.
         * 숫자는 매번 랜덤으로 출력된다.
         * 1게임 당 6개만 당첨 숫자가 될 수 있다.
         * 1게임에는 중복으로 숫자가 나올 수 없다.
         * 1회당 5게임을 진행할 수 있다.
         */

        /* java 난수 발생 방법 1
         * Util 패키지 사용
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#nextInt()
         */ 
        Random random = new Random();
        // 랜덤으로 추출한 숫자를 저장할 배열 변수 선언
        int[] num = new int[6];
        int i = 0;
        // 배열 num에 랜덤으로 추출한 값 추가
        for(int j=0;j<6;j++){
            // 랜덤 숫자는 0~44까지 총 45개가 나올 수 있으나 로또의 숫자에서 0번은 없으므로
            // 더하기 1하여 1~45까지 표시될 수 있도록 처리.
            i = random.nextInt(8)+1; // 중복 값 체크 로직 확인을 위한 난수 범위 수정 44 → 8
            // 중복 값 확인을 위한 Array 클래스의 binarySearch(이진탐색트리) 함수 사용.
            // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#binarySearch(int%5B%5D,int)
            int arrayCheck = Arrays.binarySearch(num, i);
            //System.out.println(num);
            System.out.println("arrayCheck::"+arrayCheck);
            if(arrayCheck < 0){
                // 랜덤으로 나온 난수 배열 변수에 저장
                //System.out.println("배열 변수 num의 "+j+"번째 저장값:"+num[j]);
                num[j] = i;
            }else{
                System.out.println("중복 값 건너뜀.");
            }
        }
        // 배열에 저장된 값 출력을 위한 형변환
        System.out.println(Arrays.toString(num));
        int i1 = 3;
        int arrayCheck1 = Arrays.binarySearch(num, i1);
        System.out.println(arrayCheck1);
        /* java 난수 발생 방법2
         * Lang 패키지 사용
         * Math 클래스 내 Random 함수는 소수점 아래 18 자리까지 가지는 실수형 double형으로 값 반환
         */ 
        //double mathRandom = Math.random();
        
    }
}
