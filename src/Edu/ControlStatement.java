package Edu;

public class ControlStatement {
    public static void main(String[] args) {
        /* if 문
        if (조건1) {
            // 처리 코드
        } else if (조건2) {
            // 처리 코드
        }else {
            // 처리 코드
        } 
        */

        // switch 문
        // 조건식으로 넣으면 오류 발생한다 넣고싶으면 if문으로 넣어주면 된다
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break; // 마지막 처리에 break 넣어도 괜찮고 안 넣어도 괜찮다
            default :
                System.out.println("기타");
        }

        // for 문
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
//                continue; // 건너뛰기
                break; // 멈추기
            }
            System.out.println(i);
        }

        // 구구단 출력
        int e = 2; // e 변수를 설정합니다.
        String n = ""; // n 변수를 선언하고 초기화합니다.

        for (int i = 0; i < 10; i++) {
            if (e == 2){
                n = e+"x"+i+"="+(i*e);
            }
            System.out.println(n);
        }

        // 강사님 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // 문자열을 더할때 "ss"+"ss" 이렇게 사용하면 에러 생길수 있다
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }

        //     *
        //    **
        //   ***
        //  ****
        // *****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.printf("%d", i);
//            }
//        }

        // 강사님 풀이
        int cnt = 5;
        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < (cnt - 1); j++) {
                System.out.print("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
