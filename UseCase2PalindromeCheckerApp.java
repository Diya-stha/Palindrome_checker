public class UseCase2PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "madam";
            boolean isPalindrome = true;
            int length = input.length();
            for (int i = 0; i < length / 2; i++) {
                char frontChar = input.charAt(i);
                char backChar = input.charAt(length - 1 - i);

                if (frontChar != backChar) {
                    isPalindrome = false;
                    break;
                }
            }


            displayResult(input, isPalindrome);
        }

        private static void displayResult(String word, boolean result) {
            if (result) {
                System.out.println("Success: '" + word + "' is a palindrome.");
            } else {
                System.out.println("Failure: '" + word + "' is NOT a palindrome.");
            }
        }
    }

