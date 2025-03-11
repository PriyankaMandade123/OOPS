public class EvenOddBitwise {
    public static void main(String[] args) {
        int number = 7;

        // Check if the number is even or odd using bitwise AND
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}