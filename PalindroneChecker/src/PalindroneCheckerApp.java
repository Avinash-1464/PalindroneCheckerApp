public class PalindroneCheckerApp {

    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        boolean ispal = true;
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}