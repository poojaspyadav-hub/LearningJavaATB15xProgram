package ex_02_Variables_DataTypes;

public class Lab017_Variables {
    public static void main(String[] args) {
        // Q: I want to store the age of a person then which data type should be used?
        // A: “Technically, age can fit into byte, short, or int. But in practice, we use int because it’s the default integer type in Java, widely understood, and future-proof. While byte or short would work, they’re less common and may reduce code readability.”
        // So if you store a single age value and want to save memory then use byte, byte consumes less memory than int

        //        int age = 122;
        //        short age_s = 122;
        byte age_b = 122;
        // byte age_c = 128;     - not allowed since max value for byte can be 127
        short s = 128;



    }
}
