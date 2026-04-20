package lab3c;
import java.util.*;
import java.util.regex.*;
import java.security.SecureRandom;

public class StringUtilities {

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    // Q7: Truncate string to specified length with ellipsis
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    // Q8: Verify if string contains only numeric characters
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    // Q9: Generate random string of specified length
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    // Q10: Count number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // Demonstration
    public static void main(String[] args) {
        String sample = "hello world from java programming";

        // Q6
        System.out.println("Capitalized: " + capitalizeWords(sample));

        // Q7
        System.out.println("Truncated: " + truncate(sample, 15));

        // Q8
        String numericTest = "12345";
        String nonNumericTest = "123abc";
        System.out.println("Is '12345' numeric? " + isNumeric(numericTest));
        System.out.println("Is '123abc' numeric? " + isNumeric(nonNumericTest));

        // Q9
        System.out.println("Random String (length 8): " + generateRandomString(8));

        // Q10
        System.out.println("Word Count: " + countWords(sample));
    }
}
