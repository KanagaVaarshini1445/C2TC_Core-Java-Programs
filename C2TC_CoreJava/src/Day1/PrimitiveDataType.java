package Day1;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 100;               // 1 byte (-128 to 127)
	    short s = 10000;            // 2 bytes (-32,768 to 32,767)
	    int i = 100000;             // 4 bytes (-2^31 to 2^31-1)
	    long l = 10000000000L;      // 8 bytes (add 'L' at the end)

	    // Floating-point types
	    float f = 10.5f;            // 4 bytes (add 'f' at the end)
	    double d = 123.456;         // 8 bytes

	    // Character type
	    char c = 'A';               // 2 bytes (Unicode character)

	    // Boolean type
	    boolean bool = true;        // 1 bit (true or false)

	    // Printing all values
	    System.out.println("Byte value: " + b);
	    System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);
 
	}

}
