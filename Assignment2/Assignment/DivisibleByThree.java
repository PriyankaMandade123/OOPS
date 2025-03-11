public class DivisibleByThree {
    public static void main(String[] args) {
        int number = 30;
        int originalNumber = number;

        // Subtract 3 repeatedly until the number is less than 3
        while (number >= 3) {
            number -= 3;
        }

        // Check if the remaining number is 0
        if (number == 0) {
            System.out.println(originalNumber + " is divisible by 3.");
        } else {
            System.out.println(originalNumber + " is not divisible by 3.");
        }
    }
}