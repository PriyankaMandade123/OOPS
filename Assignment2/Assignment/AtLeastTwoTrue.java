import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three boolean inputs
        System.out.print("Enter first boolean (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Enter second boolean (true/false): ");
        boolean b = scanner.nextBoolean();
        System.out.print("Enter third boolean (true/false): ");
        boolean c = scanner.nextBoolean();

        // Check if at least two are true
        boolean result = (a && b) || (b && c) || (c && a);

        System.out.println("At least two are true? " + result);
    }
}