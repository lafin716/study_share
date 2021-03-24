package java_study.gone;
import java.util.Random;

public class lottery_wheel {
    public static void main(String[] args) {
        /* 로또 규칙
         * 1~45까지의 숫자만 나올 수 있다.
         * * 숫자는 매번 랜덤으로 출력된다.
         * 1게임당 6개만 당첨 숫자가 될 수 있다.
         * 1회당 5게임을 진행할 수 있다.
         */

        /* java 난수 발생 방법1 
         * Util 패키지 사용
         * 
         */ 
        Random random = new Random();
        int i = random.nextInt(45-1)+1;
        System.out.println(i);
        /* java 난수 발생 방법2
         * Lang 패키지 사용
         * Math 클래스 내 Random 함수는 소수점 아래 18 자리까지 가지는 실수형 double형으로 값 반환
         */ 
        double mathRandom = Math.random();
    }
}
