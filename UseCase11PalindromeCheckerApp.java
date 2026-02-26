import java.util.Stack;

class PalindromeChecker {

    // Encapsulated method
    public boolean checkPalindrome(String input) {

        // Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare using stack (LIFO)
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}