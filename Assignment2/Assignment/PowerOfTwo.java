public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it is positive and (n & (n - 1)) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int number = 16; // Change this value to test other numbers

        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
}