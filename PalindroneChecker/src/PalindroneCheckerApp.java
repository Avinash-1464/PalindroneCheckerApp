public class PalindroneCheckerApp {

    public static void main(String[] args) {
        String str = "madam";

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        boolean isPal = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        if (isPal) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}