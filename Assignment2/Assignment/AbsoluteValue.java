public class AbsoluteValue {
    public static int absoluteValue(int num) {
        // Calculate the mask: num >> 31
        int mask = num >> 31;

        // Compute the absolute value using the formula: (num + mask) ^ mask
        return (num + mask) ^ mask;
    }

    public static void main(String[] args) {
        int number = -10; // Change this value to test other numbers

        int absValue = absoluteValue(number);
        System.out.println("The absolute value of " + number + " is: " + absValue);
    }
}