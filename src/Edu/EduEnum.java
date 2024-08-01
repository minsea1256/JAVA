package Edu;

public class EduEnum {
    public static void main(String[] args) {
        EnumDays monday = EnumDays.MONDAY;
        System.out.println(monday);
        System.out.println(monday == EnumDays.MONDAY);
        System.out.println(monday == EnumDays.TUESDAY);
        
    }
}
enum EnumDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY
}

class Enum {
    public static final Enum SUNDAY = new Enum();
    public static final Enum MONDAY = new Enum();
//    public static final int TUESDAY = 2;
}
interface  FinalDaysIn
