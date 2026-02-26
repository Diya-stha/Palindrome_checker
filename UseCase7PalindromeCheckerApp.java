import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp{

    public static void main(String[] args) {

        String input = "civic";
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);   
        }

        boolean isPalindrome = true;

        System.out.println("Comparing front and rear elements:");

        while (deque.size() > 1) {

            char front = deque.removeFirst(); 
            char rear  = deque.removeLast();   

            System.out.println(front + " vs " + rear);

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}