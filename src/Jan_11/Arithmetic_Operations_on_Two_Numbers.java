package Jan_11;

import java.util.Scanner;
public class Arithmetic_Operations_on_Two_Numbers {

    /*
    Write a Java program that takes two integer numbers and prints their sum, difference,
    multiplication, division, and remainder.
    */
    public static void main(String[] agrs) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter 2 integer numbers: ");
        int n1=check_Entered_Number(scanner, "Enter the 1st no.");
        int n2=check_Entered_Number(scanner, "Enter the 2nd no.");

        System.out.println("Sum of the entered numbers are : "+sum(n1, n2));
        System.out.println("Difference of the entered numbers are : "+difference(n1, n2));
        System.out.println("Multiplication of the entered numbers are : "+multiplication(n1, n2));
        System.out.println("Division of the entered numbers are : "+division(n1, n2));
        System.out.println("Remainder of the entered numbers are : "+remainder(n1, n2));
    }

    public static int check_Entered_Number(Scanner scanner, String s){
        System.out.println(s);
        while(true){
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }else {
            System.out.println("Enter a valid number: ");
            scanner.next();
            continue;
        }
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int difference(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int remainder(int a, int b){
        return a%b;
    }
}
