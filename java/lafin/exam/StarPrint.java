package com.lafin.knowledge.exam;

/**
 * 입문 기초 별찍기 클래스
 * 아주 간단한 기초 문법과 사고력 기르기 시작에 좋은 방법
 * @author laifn
 */
class StarPrint{

    int width = 5;  // 가로 길이
    int height = 5; // 세로 길이

    // 기본 5x5 출력
    public void basic(){        

        // 1번째 for문 당 한줄을 개행하므로 세로 길이만큼
        for(int i = 0; i < height; i++){

            // 2번째 for문 당 한줄 내 별을 출력하므로 가로 길이 만큼
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }

            // 개행
            System.out.println();
        }
    }

    // 증가 삼각 형태
    public void increseTriangle(){
        
    }

    public static void main(String[] args) {
        
        System.out.println("별 찍기 시작");
        StarPrint sp = new StarPrint();

        // 기본 별찍기
        sp.basic();

    }
}