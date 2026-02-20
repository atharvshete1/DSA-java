public class problem3 {

    public static void ans(int l, int r, int k) {
        int count = 1;
        if(r % 2 == 0){r-- ;}
        while (r >= l && count != k) {
            r = r - 2;
            count++;
        }
        if (r < l) {
            System.out.println("0");
            return;
        }
        if (count == k) {
            System.out.println("The number is :" + r);
            return;
        }
    }
    public static void main(String[] args) {
        ans(-2, 2, 1);
    }
}
