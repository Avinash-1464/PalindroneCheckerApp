import java.util.Stack;

public class PalindroneCheckerApp {

    public static void main(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPal = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
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