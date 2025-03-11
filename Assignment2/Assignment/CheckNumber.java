public class CheckNumber {
    public static void main(String[] args) {
        int number = -5; // Change this value to test other numbers

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number " + number + " is: " + result);
    }
}