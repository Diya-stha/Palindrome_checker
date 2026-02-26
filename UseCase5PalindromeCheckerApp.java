import java.util.*;
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args){
String input="noon";
Stack<Character> stack=new Stack<>();
for(char c: input.toCharArray()){
    stack.push(c);
        }
    boolean isPalindrome=true;
    for(char c:input.toCharArray()){
        char reversedChar=stack.pop();
        if(c!=reversedChar){
            isPalindrome=false;
            break;
    }
    }
                if (isPalindrome) {
                    System.out.println("Input:" + input );
                    System.out.println("Is Palindrome?:" + isPalindrome);
                } else {
                    System.out.println("Input: '" + input + "' is NOT a palindrome.");
                }
            }
        }