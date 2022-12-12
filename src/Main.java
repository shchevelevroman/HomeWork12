import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {
    //Task#1-2
    public static void main(String[] args) {
        System.out.println("Task#1");
        int year = LocalDate.now().getYear();
        LeapYear(year);
        System.out.println("Задача №2");
        byte clientOs = 0;
        int clientDeviceYear = 2015;
        checkDevice(clientOs, clientDeviceYear);
        System.out.println("Задача №3");
        int deliveryDistance = 90;
        int deliveryDays = 1;
        delivery(deliveryDistance, deliveryDays);
    }
    public static void delivery(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Для доставки потребуется дней: " + deliveryDays);
    }
    public static int checkDevice (byte clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOs == 0 && clientDeviceYear >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOs == 1 && clientDeviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию прилоложения для Android по ссылке");
        }
        return clientOs;
    }
    public static int LeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        return year;
    }
}
