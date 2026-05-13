package MyPackage;

public class RevString {
    public static void main(String[] args) {

        // revers the String
        String str = "MADAM";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        
        System.out.println("Reversed String: " + rev);
 
        
        // String is Pelindrome or Not
        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
