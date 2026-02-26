public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z]", "")  // Remove spaces & special characters
                .toLowerCase();               // Convert to lowercase

        // Step 2: Apply palindrome logic
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        boolean result = isPalindrome(input);

        System.out.println("Original Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}