package ex_03_Literals;

public class Lab033_Literals_Int {
    public static void main(String[] args) {

        //Decimal System base - 10
        int age = 65;    // i.e  65= 6*10¹+ 5* 10⁰
        System.out.println(age);

        // Binary Literal system base- 2,   system using only two digits: 0 and 1
        int binary_num = 0b1010;        //(1010)₂ = (1 × 2³) + (0 × 2²) + (1 × 2¹) + (0 × 2⁰) = (10)₁₀
        System.out.println(binary_num);
        // https://www.rapidtables.com/convert/number/binary-to-decimal.html?x=1010 -- can use this site for conversion

        // Octal base is 8
        int octal = 0101;      //  (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) =0+64+0+1=  65
        System.out.println(octal);

        // Hexadecimal Literals - 16
        int hex = 0Xface;       //(15 × 16³) + (10 × 16²) + (12 × 16¹) + (14 × 16⁰) = (64206)₁₀
        System.out.println(hex);

    }
}
