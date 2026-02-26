import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        input = normalize(input);

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        input = normalize(input);

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }

    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

public class UseCase12PalindromeCheckerApp{

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        PalindromeStrategy strategy;
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.execute(input);

        System.out.println("Input : " + input);
        System.out.println("Strategy Used : " + strategy.getClass().getSimpleName());
        System.out.println("Is Palindrome? : " + result);
    }
}