package Jan_11;

public class Break_Statement_Example {
    public static void main(String[] args) {
//        Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.

        int i=1;

        System.out.println("using for loop");
        for(int j=1; j<=10; j++)
        {
            System.out.println(j);
            if(j==5)
            {
                break;
            }
        }
        System.out.println("using while loop");
        while(i<=10){
            System.out.println(i);
            if(i==5)
            {
                break;
            }
            i++;
        }

    }
}
