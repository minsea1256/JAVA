package Edu;

public class Hallo {
    public static void main(String[] args) {
        // . = -> 와 동일한다
        // ln 개행을 한다
//        System.out.println("Hello World");

        // 변수 = 타입[int(숫자)] 이름 = 1; , string(문자)
        int num = 1;

        // 상수
        final int  num2 = 2; // 리터럴 = 절대적으로 변하지 않는 값
        final int  num3 = 200_000; // 언더스코어 표기법
//        num2 = 1; // 상수이기 때문에 재할당이 불가능하다

        // 스왑
        int swap1 = 10;
        int swap2 = 30;
        // swap1 과 swap2 값을 서로 변경해 주세요 [기초문제]
        int tmp; // 빈값
        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

//        System.out.println(swap1);
//        System.out.println(swap2);
        System.out.printf("swap1 = %d,swap2 = %d", swap1, swap2); // 한번에 출력하는 방법 [ %n:개행 ]
    }
}
