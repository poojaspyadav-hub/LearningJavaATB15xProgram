package Jan_11;
import java.util.Scanner;

public class Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        //Write a Java program to find the maximum of two numbers using the ternary operator.

        Scanner scanner=new Scanner(System.in);
        int n1=enter_numbers(scanner, "Enter the 1st no.:");
        int n2=enter_numbers(scanner, "Enter the 2nd no.:");

        int max=n1>n2? n1:n2 ;
        System.out.println("The max no. is: "+max);
    }

    public static int enter_numbers(Scanner scanner, String s){
        System.out.println(s);
        while(true){
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            }else{
                System.out.println("Enter a valid number:");
                scanner.next();
                continue;
                }
            }
        }

    }
