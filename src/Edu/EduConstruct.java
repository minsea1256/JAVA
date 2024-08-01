package Edu;

public class EduConstruct {
    public static void main(String[] args) {
        Whale whale = new Whale(name: "고래");
        Whale whale = new Whale(age: 3);

    }
}

class Whale {
    public whale(int age) {
        System.out.println("고래는" + age + "살 입니다.");
    }
    public Whale(String name) {
        System.out.println(name.concat( str:"생성자"));
    }
}
