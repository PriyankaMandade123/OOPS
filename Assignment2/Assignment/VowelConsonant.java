public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'e';  // You can change this value to test with different characters
        
        // Determine if the character is a vowel or consonant using the ternary operator
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                         ? "Vowel" 
                         : "Consonant";

        // Print the result
        System.out.println(ch + " is a " + result);
    }
}
