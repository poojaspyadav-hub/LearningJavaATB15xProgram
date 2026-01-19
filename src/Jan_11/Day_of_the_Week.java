package Jan_11;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Day_of_the_Week {
    public static void main(String[] args) {
        //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

        Scanner scanner= new Scanner(System.in);
        int day=enter_number(scanner,"Enter the number in between 1-7:");

            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input, enter a number in between 1-7");
                    break;
            }
    }

    public static int enter_number(Scanner scanner, String s){
        System.out.println(s);
        while(true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else{
                System.out.println("Enter a number:");
                scanner.next();
                continue;
            }
        }
    }
}
