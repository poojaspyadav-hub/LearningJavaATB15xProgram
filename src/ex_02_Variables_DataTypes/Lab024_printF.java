package ex_02_Variables_DataTypes;

public class Lab024_printF {
    public static void main(String[] args)
    {
        System.out.println("It will add a newline");
        System.out.print("It will not add a newline");

        byte a=10;
        System.out.println("Value of a is-->"+a);
        System.out.print("Value of a is-->"+a);
        System.out.printf("Value of a is %d", a);    // printf stands for print formatted.
        // %d ->Integer (int, byte, long, short, - data type)
        // %f -> float, double,
        // %s -> String
        // %c -> Character
        // %n -> New Line
        // %b ->boolean
//printf in Java is used for formatted output, making console printing more professional and readable. It supports specifiers like %d, %f, %s, %c, and %n

        int aa=100;
        int bb=121;
        System.out.printf("Formatting the aa=%d and b= %d" , aa,bb);

        System.out.println();
        int table=9;
        //System.out.printf("%d*1=%d%n",table , table*1);
        System.out.printf("9*1=%d%n",table*1);
        System.out.printf("9*2=%d%n",table*2);
        System.out.printf("9*3=%d%n",table*3);
        System.out.printf("9*4=%d%n",table*4);
        System.out.printf("9*5=%d%n",table*5);
        System.out.printf("9*6=%d%n",table*6);
        System.out.printf("9*7=%d%n",table*7);
        System.out.printf("9*8=%d%n",table*8);
        System.out.printf("9*9=%d%n",table*9);
        System.out.printf("9*10=%d%n",table*10);


    }
}
