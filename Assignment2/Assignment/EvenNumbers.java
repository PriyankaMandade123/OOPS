public class EvenNumbers {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even using the & operator
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}