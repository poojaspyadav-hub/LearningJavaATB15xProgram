package Jan_11;
import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
//        Write a Java program to reverse a given number using a do-while loop.

        Scanner scanner=new Scanner(System.in);
        int number=enter_number(scanner,"Enter the number:");
        int reverse=0;
        if(number>0){
            do{
                reverse=(reverse*10)+number%10;
                number=number/10;
            }while(number>0);

            System.out.println("Reverse of the number is "+reverse);
        }else {
            System.out.println("Enter a positive number:");
        }

    }

    public static int enter_number(Scanner scanner, String s){
        System.out.println(s);
        while(true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else{
                System.out.println("Enter a valid number:");
                scanner.next();
                continue;
            }
        }
    }
}
