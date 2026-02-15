package ex_03_Literals;

public class Lab032_Literals_IQ {
    public static void main(String[] args) {

        // Is below code valid ?
        int Enum = 9;
        System.out.println(Enum);
        // Yes, int Enum = 9; is valid because Java is case‑sensitive. enum is a reserved keyword,
        // but Enum is just a class name, so it can be used as a variable name.
        // However, it’s not good practice because it reduces code readability.

        //int enum = 9;    //will give error -->java: as of release 5, 'enum' is a keyword, and may not be used as an identifier
    }
}
