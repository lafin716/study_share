package java_study.gone;

import java.util.Random;
import java.util.HashSet;

public class lottery_wheel {
    public static void main(String[] args) {
        /* 로또 규칙
         * 1~45까지의 숫자만 나올 수 있다.
         * 숫자는 매번 랜덤으로 출력된다.
         * 1게임 당 6개만 당첨 숫자가 될 수 있다.
         * 1게임에는 중복으로 숫자가 나올 수 없다.
         * 1회당 5게임을 진행할 수 있다.
         */
         Random random = new Random();

        /* java에서 중복 값을 쉽게 제거하는 방법
         * hashSet 클래스 사용 / 기본적으로 중복 값은 저장하지 않고 넘어간다.
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashSet.html
         */ 
        HashSet<Integer> hs = new HashSet<Integer>();

        // 랜덤 값이 들어갈 변수에 기본값 0 지정
        int i = 0;
        // 전체 크기는 6개까지 되도록 반복문 지정
        while(hs.size()<6){
            // 난수 생성 단, 난수는 1이상으로 생성되어야 함으로 1을 더하여 0보다 크게 생성되도록하며 
            // 난수 최대 생성값은 44로 지정한다.
            i = random.nextInt(44)+1;
            // 생성된 난수 해시 세트에 추가
            hs.add(i);
        }
        // 결과 값 출력
        System.out.println(hs);
    }
}
