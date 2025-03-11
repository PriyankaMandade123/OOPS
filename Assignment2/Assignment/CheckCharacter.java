public class CheckCharacter {
    public static void main(String[] args) {
        char ch = 'A'; // Change this value to test other characters

        // Use nested ternary operators to check the character
        String result = (Character.isLetter(ch)) ?
                       (Character.isUpperCase(ch) ? "Uppercase" : "Lowercase") :
                       "Not a letter";

        System.out.println("The character '" + ch + "' is: " + result);
    }
}