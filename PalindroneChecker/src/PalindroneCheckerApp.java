import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        String str = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPal = true;
        while (!queue.isEmpty()) {
            char queueChar = queue.remove();
            char stackChar = stack.pop();
            if (queueChar != stackChar) {
                isPal = false;
                break;
            }
        }

        if (isPal) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}