package ex_02_Variables_DataTypes;

public class Lab015_Variables {

    public static void main(String[] args) {
        // A variable in Java is a named memory location that stores data of a specific type.
        // It can be local, instance, or static, and must follow Java’s naming rules
        // data_type variable_name =  variable_value
        byte age_pooja = 30;
        // byte --> data_type - type of container
        // age_pooja --> variable_name |  identifier
        // = -> Assignment Operator
        // 32 -> Variable Value |  Literal -a fixed constant value
        age_pooja = 31;
        age_pooja = 32;
        System.out.println(age_pooja);
    }
}
