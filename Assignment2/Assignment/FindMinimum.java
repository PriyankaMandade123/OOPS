public class FindMinimum {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 8, d = 3; // Change these values to test other numbers

        // Find the minimum using nested ternary operators
        int min = (a < b) ? 
                  ((a < c) ? 
                   ((a < d) ? a : d) : 
                   ((c < d) ? c : d)) : 
                  ((b < c) ? 
                   ((b < d) ? b : d) : 
                   ((c < d) ? c : d));

        System.out.println("The minimum of " + a + ", " + b + ", " + c + ", and " + d + " is: " + min);
    }
}