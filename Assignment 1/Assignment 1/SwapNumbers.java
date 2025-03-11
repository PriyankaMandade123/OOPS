public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (with temp): a = " + a + ", b = " + b);

        // Swap without using a temporary variable
        a = 5;
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);
    }
}