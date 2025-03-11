public class MultiplyByEight {
    public static int multiplyByEight(int number) {
        // Left shift by 3 bits to multiply by 8 (2^3 = 8)
        return number << 3;
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to test other numbers

        int result = multiplyByEight(number);
        System.out.println(number + " multiplied by 8 is: " + result);
    }
}