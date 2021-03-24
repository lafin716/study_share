package java.lafin.exam;


 // 로또 노드 클래스
// 로또 한줄과 같음
class Lotto{
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 45;
    private final int DEFAULT_LENGTH;
    private int[] numbers;

    // 생성자에서 바로 번호 생성
    public Lotto(){
        DEFAULT_LENGTH = 6;
        numbers = new int[DEFAULT_LENGTH];
        generate();
    }

    // 번호 생성
    public int[] generate(){
        
        // 배열 갯수만큼 반복하면서 랜덤한 수를 생성하여 중복되지않게 배열에 저장
        for(int i=0; i<DEFAULT_LENGTH; i++){
            
            // 임시변수를 선언하여 중복여부 검사
            int tmpNumber = getRandomNumber();
            if(isContains(tmpNumber)){
                --i;
            }else{
                numbers[i] = tmpNumber;
            }
        }

        // for문을 나오면 전부 생성 완료된 것이므로 정렬시작
        sort();

        return getLotto();
    }

    // 랜덤 번호 생성
    private int getRandomNumber(){
        return (int)(Math.random() * MAX_NUM) + MIN_NUM;
    }

    // 현재까지 들어간 수들의 중복 검사
    private boolean isContains(int newNumber){
        // 결과 변수
        boolean result = false;

        // 배열을 반복하면서 중복된 숫자가 있는지 확인
        for(int i=0; i<numbers.length; i++){

            // 같은 수가 있는 경우 true 리턴
            if(numbers[i] == newNumber){
                result = true;
                break;
            }
        }

        return result;
    }

    // 숫자들 오름차순 정렬
    private void sort(){
        
        // 정렬은 버블정렬로 진행
        while(true){
            boolean notChanged = true;

            for(int i=0; i<numbers.length-1; i++){
                int current = numbers[i];
                int next = numbers[i+1];

                if(current > next){
                    numbers[i] = next;
                    numbers[i+1] = current;
                    notChanged = false;
                }
            }

            if(notChanged){
                break;
            }
        }
    }

    // 로또번호를 리턴하는 메소드
    public int[] getLotto(){
        return numbers;
    }

    // 로또번호 출력하는 메소드
    public void print(){

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + "  ");

            // 자리 맞추기용
            if(numbers[i] < 10){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public class LottoMaker {

    // 한장당 로또 수
    private final int DEFAULT_ROWS;

    // 로또 리스트
    private Lotto[] lottoList;

    // 현재 로또 인덱스
    private char currentRow;

    // 생성자에서 기본값 세팅
    public LottoMaker(){
        DEFAULT_ROWS = 5;
        lottoList = new Lotto[DEFAULT_ROWS];
        currentRow = 'A';
    }

    // 로또 생성
    public void generate(){
        for(int i=0; i<lottoList.length; i++){
            lottoList[i] = new Lotto();
        }
    }

    // 로또 출력
    public void print(){
        
        System.out.println("####### 로또 번호 생성기 ######");
        for(int i=0; i<lottoList.length; i++){
            Lotto lotto = lottoList[i];
            System.out.print(currentRow++ + " : ");
            lotto.print(); 
        }
        System.out.println("###############################");
        System.out.println("부자되세요~ >_ ㅎ");
    }

    public static void main(String[] args) {
        LottoMaker richmaker = new LottoMaker();
        richmaker.generate();
        richmaker.print();
    }
}
