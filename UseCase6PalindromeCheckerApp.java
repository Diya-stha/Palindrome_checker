import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // to insert characters
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        boolean isPalindrome = true;

        System.out.println("Comparing dequeue vs pop:");

        while (!queue.isEmpty()) {
            char qChar = queue.remove();  
            char sChar = stack.pop();     

            System.out.println(qChar + " vs " + sChar);

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}