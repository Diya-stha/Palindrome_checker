public class UseCase9PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition 1: If pointers cross or meet
        if (start >= end)
            return true;

        // If characters don’t match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call for smaller substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "civic";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}