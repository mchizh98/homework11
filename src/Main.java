import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задача 1.");
        printWhatYear(2023);

        System.out.println("Задача 2.");
        printVersion(1, 2023);

        System.out.println("Задача 3.");
        int days = deliversDays(95);
        if (days != 1) {
            System.out.println("Количество дней доставки - " + days);
        } else {
            System.out.println("Доставки нет.");
        }

    }


    public static void printWhatYear(int year) {
        if (isleapYear(year)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    public static boolean isleapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printVersion(int os, int yearOfRelease) {
        if (os != 0 && os != 1) {
            System.out.println("Ос должна иметь значение 1 или 0.");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        String result = "Нужно установить ";
        if (yearOfRelease < currentYear) {
            result = result + "облегченную версию для";
        } else {
            result = result + "обычную версию для";
        }
        if (os == 0) {
            result = result + " IOS.";
        } else {
            result = result + " Android.";
        }
        System.out.println(result);
    }

    public static int deliversDays(int distance) {
         if (distance < 0 || distance > 100){
              return -1;
         }
         if (distance <= 20){
             return 1;
         } else if (distance <= 60) {
             return 2;
         } else {
             return 3;
         }
    }

}