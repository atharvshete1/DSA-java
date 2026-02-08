import java.util.*;

public class practiceset {

    public static boolean isVowel(char a) {
        switch (a) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void q1(String a) {
        // Count how many times lower case vowels occurred in a String entered by the user.
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (isVowel(b)) {
                count++;
            }
        }
        System.out.println("The no. repetation of vowels occurs in string: " + count);
    }

    public static void q2(String q, String w) {
        // Determine if 2 Strings areanagrams of each other.

        int count = 0;
        if (q.length() == w.length()) {
            for (int i = 0; i < q.length(); i++) {
                for (int j = 0; j < w.length(); j++) {
                    if (q.charAt(i) == w.charAt(j)) {
                        count++;
                        if (count > 1) {
                            System.out.println("It is not areanagrams.");
                            break;
                        }
                        count--;
                    }
                }
            }
            System.out.println("It is areanagrams String.");
        }
        System.out.println("It is not areanagrams.");

    }

    
    public static boolean isValid(String s) {
        // code here
        int ei=s.length();
        int si=0;
        String hi ="255"; 
        int count=0;
        for(int i=0; i<s.length(); i++){

            if(i == ei - 1){
                while(s.charAt(i) != '.'){
                    i--;
                }

                String demo = s.substring(i+1, s.length());
                System.out.println(demo);
                  int num = Integer.parseInt(demo);
                if (num >= 255 || demo=="01") return false;
                else{
                    return true;
                }

                }

            
            if(s.charAt(i) == '.'){
                if(s.charAt(i - 1) == '.'){ return false;}   

                count ++;
                ei = i;

                String demo = s.substring(si,ei);
                System.out.println(demo);
                
                int num = Integer.parseInt(demo);
                if (num >= 255 || demo=="01") return false;
                else{
                    ei = s.length();
                    si = i+1;
                }            
              }
            }
            
        
        
        if(count != 3){
            return false;
        }
        
        return true;
            
        }
    

    public static void main(String[] args) {
       
        String s= "192.168.0.255";
        System.out.println(isValid(s));
    }
}
