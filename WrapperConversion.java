public class WrapperConversion {
    public static void main(String[] args) {
        // Convert integer to double
        int intValue = 42;
        double doubleValue = Double.valueOf(intValue);
        System.out.println("Integer to Double: " + doubleValue);

        // Convert double to integer
        double anotherDoubleValue = 56.78;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit casting
        System.out.println("Double to Integer: " + anotherIntValue);
    }
}