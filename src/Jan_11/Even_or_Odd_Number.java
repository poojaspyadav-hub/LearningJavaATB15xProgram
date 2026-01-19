package Jan_11;
import java.util.Scanner;

public class Even_or_Odd_Number {
    public static void main(String[] args) {
//        Write a Java program to check whether a given number is even or odd using arithmetic operators.

        Scanner scanner=new Scanner(System.in);
        int n1=enter_number(scanner, "Enter a number:");
        if(n1%2==0)
        {
            System.out.println("The entered number is even");
        }else{
            System.out.println("The entered number is odd");
        }
    }

    public static int enter_number(Scanner scanner,String s ){
        System.out.println(s);
        while(true)
        {
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else{
                System.out.println("Enter a valid input:");
                scanner.next();
                continue;
            }
        }
    }

}
