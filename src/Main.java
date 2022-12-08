import java.time.LocalDate;

public class Main {

    public static int yearFinish(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
           return System.out.println(year + " год является високосным");
        } else {
           return System.out.println(year + " Год не является вясокосным");
        }
    }
    public static void main(String[] args) {
        int year = 2022;
        yearFinish(year);
    }
}