public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;

        // Loop until n becomes 0
        while (n != 0) {
            // Clear the lowest set bit
            n = n & (n - 1);
            // Increment the count
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Change this value to test other numbers

        int result = countSetBits(number);
        System.out.println("The number of set bits in " + number + " is: " + result);
    }
}