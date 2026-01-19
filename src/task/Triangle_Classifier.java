package task;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle: ");
        int s1= scanner.nextInt();
        System.out.println("Enter the 2nd side of the triangle: ");
        int s2= scanner.nextInt();
        System.out.println("Enter the 3rd side of the triangle: ");
        int s3= scanner.nextInt();
         if(s1==s2 && s2==s3)
         {
             System.out.println("The triangle is Acute");
         }
         else if(s1==s2 || s2==s3 || s1==s3)
         {
             System.out.println("The triangle is Isosceles");
         }
         else
         {
             System.out.println("The triangle is Scalene ");
         }

    }
}
