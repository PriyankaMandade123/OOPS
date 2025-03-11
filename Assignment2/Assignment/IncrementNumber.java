public class IncrementNumber {
    public static int incrementNumber(int x) {
        return -~x;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Original number: " + num);
        System.out.println("Incremented number: " + incrementNumber(num));
    }
}