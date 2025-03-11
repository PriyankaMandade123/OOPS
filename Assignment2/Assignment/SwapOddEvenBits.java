public class SwapOddEvenBits {
    public static int swapOddEvenBits(int x) {
        // Mask to extract odd bits: 0xAAAAAAAA (binary: 10101010...1010)
        int oddBits = x & 0xAAAAAAAA;

        // Mask to extract even bits: 0x55555555 (binary: 01010101...0101)
        int evenBits = x & 0x55555555;

        // Shift odd bits right by 1 and even bits left by 1
        oddBits = oddBits >> 1;
        evenBits = evenBits << 1;

        // Combine the results using bitwise OR
        return oddBits | evenBits;
    }

    public static void main(String[] args) {
        int number = 23; // Change this value to test other numbers

        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        int result = swapOddEvenBits(number);
        System.out.println("Number after swapping odd and even bits: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}