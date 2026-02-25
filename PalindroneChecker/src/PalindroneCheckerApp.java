public class PalindroneCheckerApp {

    public static void main(String[] args) {
        String str = "madam";
        boolean ispal = true;
        for( int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                ispal = false;
                break;
            }
        }
        if(ispal){
            System.out.println(str+" is palindrome");
        }

    }
}