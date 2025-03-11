import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: An integer number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseInteger(number);

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseInteger(int number) {
        int reversedNumber = 0;

        // Reverse the number using arithmetic operations
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return reversedNumber;
    }
}