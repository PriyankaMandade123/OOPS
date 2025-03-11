import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even using the & operator
        String result = (number & 1) == 1 ? "Odd" : "Even";

        // Output the result
        System.out.println("The number is: " + result);
    }
}