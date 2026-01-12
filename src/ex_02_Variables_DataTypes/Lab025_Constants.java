package ex_02_Variables_DataTypes;

import java.sql.SQLOutput;

public class Lab025_Constants {
    public static void main(String[] args){

//In Java, a constant is a variable declared with the final keyword whose value cannot be changed once assigned.
// Constants are usually written in uppercase with underscores and are used to represent fixed values like PI or configuration limits.
        int a =10;
        a=20;
        System.out.println(a);

        float P=3.14f;
        P=3.12f;
        System.out.println(P);

        final float PI=3.14f;
        //PI=3.11f;     - will give error as "cannot assign a value to final variable PI"
        System.out.println(PI);

    }
}
