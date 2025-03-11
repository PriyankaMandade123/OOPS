public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        // Find the largest using the ternary operator
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}