package Edu;

public class DadaType {
    public static void main(String[] args) {
        boolean flag = true;

        byte numByte = 127; // byte는 127 넘을 수 없다
        short numShort = 32767;
        int numInt = 1;
        long numLong = 5L; //long은 숫자 뒤에 L를 붙여준다

        // 실수
        double numDouble = 5.0;
        float numFloat = 5.0f; // float는 실수가 아니므로 F를 붙여준다

        char enChar = 'A'; // 자바에서 '' = char 이고 "" = string 이므로 잘 구분해서 작성
        String str = "abc";

        //연산자
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 != num2); // 이골은 2개 자리만 있다
        
        // 문자열 비교
        String str2 = "adc";
        String str3 = "123";
        System.out.println(str2.equals(str3)); // string은 equals로 비교해야 한다
    }
}
