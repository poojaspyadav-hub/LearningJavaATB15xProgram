package ex_02_Variables_DataTypes;

public class Lab014_Main_Method {
//        --> Can you have a multiple main function in a single program ?
/*        Answer--> Yes, we can have multiple main methods across different classes or even overload them.
          But the JVM only recognizes the main method with exact signature i.e. public static void main(String[] args) method in the class you run as the entry point.
*/
    public static void main(String[] args) {
//         JVM entry point
    }
    public static void main(String args) {
//          Overloaded, not entry point
    }
    public static void Main(String[] args) {
//          Overloaded, not entry point

        /*
         --> Can we have more than one public static void main(String[] args) in same class?
            Answer--> No, we cannot have more than one public static void main(String[] args) in the same class.
            Because: Method signatures in Java must be unique within a class.
            Having two identical main methods would cause a compile-time error: “method main(String[] args) is already defined in class …
         */
    }
}
