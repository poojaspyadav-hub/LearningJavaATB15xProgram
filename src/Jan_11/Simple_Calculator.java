package Jan_11;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        //Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.

        Scanner scanner=new Scanner(System.in);
        int n1=enter_number(scanner, "Enter the 1st number:");
        int n2=enter_number(scanner, "Enter the 2nd number:");
        while(n2==0){
            System.out.println("Enter the valid number(zero is not allowed)");
            n2=enter_number(scanner, "Enter the 2nd number:");
        }
        System.out.println("Enter the operator which needs to be performed on the entered numbers: ");
        String action= scanner.next();

        switch(action)
        {
            case "+" :
                System.out.println("The addition of the numbers are: "+(n1+n2));
                break;
            case "-" :
                System.out.println("The subtraction of the numbers are: "+(n1-n2));
                break;
            case "*" :
                System.out.println("The multiplication of the numbers are: "+(n1*n2));
                break;
            case "/" :
                if(!(n2==0))
                System.out.println("The division of the numbers are: "+(n1/n2));
                else
                System.out.println("The division of the numbers are: "+(n1/n2));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static int enter_number(Scanner scanner, String s){
        System.out.println(s);
        while(true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else{
                System.out.println("Enter the valid input");
                scanner.next();
                continue;
            }
        }
    }

}
