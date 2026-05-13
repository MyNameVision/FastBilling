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
         System.out.println("Duplicate characters are:");

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            // Skip already checked characters
            if (str.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                    // Mark duplicate character
                    str = str.substring(0, j) + ' ' + str.substring(j + 1);
                }
            }

            if (count > 1) {
                System.out.println(str.charAt(i) + " = " + count);
            }

        }
        for (int i = 0; i < str.length(); i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(str.charAt(i));
            }
        }
    



    }

}
