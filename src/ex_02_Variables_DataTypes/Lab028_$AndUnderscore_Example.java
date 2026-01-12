package ex_02_Variables_DataTypes;

public class Lab028_$AndUnderscore_Example {
    public static void main(String[] args) {
        int _=10;
        int $=11;
        // System.out.println(_);  -- this will give error as "underscore not allowed here"
        //In Java 9 and later, the single underscore character (_) is a reserved keyword and cannot be used as an identifier (e.g., a variable, method, or class name).
        System.out.println($);
    }
}
