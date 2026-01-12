package ex_02_Variables_DataTypes;

public class Lab023_Byte {
    public static void main(String[] args)
    {
        byte age=10;
        char c=10;
        System.out.println(c);   //why value is not being printed for c In the console
        /*- When you assign 10 to a char, you’re not storing the number 10 directly — you’re storing the Unicode character with code point 10.
            - Unicode code point 10 corresponds to a non‑printable control character (Line Feed, LF).
            - It’s essentially an invisible character used for formatting, not a visible symbol.
        */
        System.out.println(age);

        String s="Pramod";  //Non primitive - Store references to objects,  not the actual value.
        // Pramod --> p,r,a,m,o,d -  String is bunch of chars.

    }
}
