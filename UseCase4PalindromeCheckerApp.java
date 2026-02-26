public class UseCase4PalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "radar";
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start< end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input: " + java.util.Arrays.toString(charArray));
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

