package Jan_11;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Positive_Negative_or_Zero {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

        Scanner scanner=new Scanner(System.in);
        int n1=enter_number(scanner, "Enter the number:");
        String given_number = n1>0? ("positive number") :(n1<0? "negative number" : "zero");
        System.out.println("Entered number is " +given_number);
    }

    public static int enter_number(Scanner scanner, String s){
        System.out.println(s);
        while(true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else{
                System.out.println("Enter the valid number");
                scanner.next();
                continue;
            }
        }
    }
}
