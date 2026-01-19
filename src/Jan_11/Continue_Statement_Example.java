package Jan_11;

public class Continue_Statement_Example {
    public static void main(String[] args) {
//        Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.

        System.out.println("Using for loop");
        for(int j=1; j<=10; j++)
        {
            if (j == 5)
            {
                continue;
            }
            System.out.println(j);
        }

        System.out.println("Using while loop");
        int i=1;
        while(i<=10){

            if(i==5){
                i++;                // if this is not given then continue jumps directly back to the condition(i<=10); it also skips increment part hence enters into infinite loop
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

