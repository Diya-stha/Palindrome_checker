public class UseCase3PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "madam";
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }
            if (input.equals(reversed)) {
                System.out.println("Original: " + input);
                System.out.println("Reversed: " + reversed);
                System.out.println("Result: It is a palindrome.");
            } else {
                System.out.println("Result: Not a palindrome.");
            }
        }
    }

