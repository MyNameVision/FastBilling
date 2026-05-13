package MyPackage;

public class RevString {
    public static void main(String[] args) {

        // revers the String
        String str = "Java Programming";
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
        // check String Vowels and Consonants
          int vowels = 0;
          int consonants = 0;

           str = str.toLowerCase();

           for(int i=0; i<str.length(); i++)
       {
            char ch = str.charAt(i);

          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
             vowels++;
        }
          else if(ch>='a' && ch<='z')
       {
             consonants++;
        }
}

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Duplicate Characters in String
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Duplicate Character: " + str.charAt(i));
                    break;
                }
            }
        }

        // Find ocurrences of a character in String 
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "': " + count);
        
    }

}
