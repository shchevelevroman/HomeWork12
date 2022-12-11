import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {
    //Task#1
    public static void main(String[] args) {
        System.out.println("Task#1");
        int year = LocalDate.now().getYear();
        yearFinish(year);
    }
    public static int yearFinish(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        return year;
    }
}