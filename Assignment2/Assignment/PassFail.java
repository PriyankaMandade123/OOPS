public class PassFail {
    public static void main(String[] args) {
        double percentage = 45.5; // Change this value to test other percentages

        // Use the ternary operator to determine Pass or Fail
        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
    }
}