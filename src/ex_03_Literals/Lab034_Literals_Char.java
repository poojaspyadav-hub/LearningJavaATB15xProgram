package ex_03_Literals;

public class Lab034_Literals_Char {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A";      String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence --- An escape sequence is a special character combination in Java, starting with a backslash (\), used inside string or character literals.
        char new_line = '\n';               //New line (line break)
        char tab_line = '\t';               //Tab space
        char back_space = '\b';
        char carriage_return = '\r';
        char Backslash='\\';
        char Double_quote= '\"';
        char Single_quote = '\'';
        char Form_feed= '\f';
        //char Unicode char= '\uXXXX';




        System.out.println("JohnCena");
        System.out.println("Tom" + new_line + "Jerry");
        System.out.println("John\nCena");
        System.out.println("Tom" + tab_line + "Jerry");
        System.out.println("John" + back_space + "Cena");
        System.out.println("Tom" + carriage_return + "Jerry");

        System.out.println(" ----- ");

        System.out.println("Hi, This is a First line" + new_line + "This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11 = '\u1F60';

        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);
    }
}
