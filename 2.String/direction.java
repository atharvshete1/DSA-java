import java.util.*;

public class direction {

    public static void calculation(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {
                x--;
            } else if (str.charAt(i) == 's') {
                y--;
            } else if (str.charAt(i) == 'n') {
                y++;
            } else if (str.charAt(i) == 'e') {
                x++;
            }
        }
        int p = (x) * (x) + (y) * (y);
        int displacement = (int) Math.sqrt(p);
        System.out.print("The Shortest Path Is: " + displacement);
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = "wnnnnnnwesss";
        calculation(str);
    }

}
