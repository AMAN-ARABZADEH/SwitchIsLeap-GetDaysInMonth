import java.security.PublicKey;
import java.util.Scanner;

public class Switch {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wendsday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
    public static void DayOfTheWeekChallange(int day){
        if(day == 0){
            System.out.println("Monday");
        } else if(day == 1){
            System.out.println("Tuesday");
        } else if(day == 2){
            System.out.println("Wendsday");
        } else if(day == 3){
            System.out.println("Thursday");
        } else if(day == 4){
            System.out.println("Friday");
        } else if(day == 5){
            System.out.println("Saturday");
        } else if(day == 6){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }


    }
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            return year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0);
        } else{
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) ||
                (year < 1) || (year > 9999)) {
            return -1;
        }else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if(isLeapYear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 30;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day  number: ");
        int dayNumber = scanner.nextInt();
        printDayOfTheWeek(dayNumber);
        DayOfTheWeekChallange(dayNumber);
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(9, 2020));
    }
}
