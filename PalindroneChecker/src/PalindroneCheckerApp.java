import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char firstChar = deque.removeFirst();
            char lastChar = deque.removeLast();

            if (firstChar != lastChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The given string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + str + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}