package Edu;

public class EduClass {
    public static void main(String[] args) {
        Whale whale = new Whale();

        System.out.println(whale.age);
        System.out.println(whale.info());
        System.out.println(whale.name);

        Test Test = new Test();
        System.out.println(Test.j);
    }
}
// class 작성할때 이름은 대문자로 시작
//class Whale {
//    public int age = 32; // 인스턴스 변수
//    public static String name = "고래"; // 클래스 변수
//
//    public String info() {
//        int i = 3; // 지역 변수
//        return "고래입니다.";
//    }
//    public String info(int age) {
//        return age + "살 고래입니다.";
//    }
//}
