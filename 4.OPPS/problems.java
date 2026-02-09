public class practice1 {

    public static int firstOcc(int arr[], int key, int x) {

        if (arr[x] == key) {
            return x;
        }

        if (x == arr.length - 1) {
            return -1;
        }

        return firstOcc(arr, key, x + 1);

    }

    public static int lastOcc(int arr[], int key, int x) {

        if (arr[x] == key) {
            return x;
        }

        if (x == 0) {
            return -1;
        }

        return lastOcc(arr, key, x - 1);

    }

    public static long powerOf(int base, int power) {
        int x = base;
        int y = power;
        if (y == 1) {
            return x;
        }
        if (y == 0) {
            return 1;
        }
        long answer;
        if (y % 2 == 0) {
            answer = (long) powerOf(x, y / 2) * powerOf(x, y / 2);
        } else {
            answer = (long) x * powerOf(x, y / 2) * powerOf(x, y / 2);
        }

        return answer;
    }

    public static void repeatation(int index, StringBuilder sb, boolean arr[], String s) {
        if (index == s.length()) {
            System.out.println(sb);
            return;
        }

        char currChar = s.charAt(index);

        if (arr[currChar - 'a'] == true) {
            repeatation(index + 1, sb, arr, s);
        }

        else {
            arr[currChar - 'a'] = true;
            repeatation(index + 1, sb.append(currChar), arr, s);
        }

    }

    public static int pairedWays(int n) {
        if (n == 1) {
            return 0;
        }

        int paired = (n - 1) + pairedWays(n - 1);

        return paired;
    }

    public static int paired(int n) {

        if (n == 1) {
            return 1;
        }

        int singleWays = 1;

        int totalWays = singleWays + pairedWays(n);

        return totalWays;

    }

    public static void binaryString(int index, String s, StringBuilder sb) {
        // base case
        if (index == s.length()) {
            System.out.println(sb);
            return;
        }

        char currNum = s.charAt(index);
        if (currNum == '1' && index > 0) {

            if (sb.charAt(index - 1) == '1') {
                binaryString(index + 1, s, sb.append('0'));
            } else {
                binaryString(index + 1, s, sb.append(currNum));
            }
        }

        else {
            binaryString(index + 1, s, sb.append(currNum));
        }

    }

    public static void count(int[] arr, int key, int n) {
        if (n == arr.length) {
            return;
        }

        if (arr[n] == key) {
            System.out.print(n + " ");
            count(arr, key, n + 1);
        } else {
            count(arr, key, n + 1);
        }
    }

   
    public static void intToString( int n, StringBuilder y, StringBuilder arr[]) {
        if(n < 10){
            System.out.println(y.insert(0,arr[n]));
            return ; 
        }

        int lastNum = n % 10 ; 

        intToString(n/10 , y.insert(0 , arr[lastNum]) , arr);

    }

    public static void length(String s , int count, int index){

        try{
            s.charAt(index);
            length(s, count + 1 , index + 1 );
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(count) ;
            return ;  
        }



    }

    public static int conSub(String s ,int  index1 , int count ,int  index2 ){
        if(index1 == s.length() - 1 ){
            return count + s.length() ; 
        }

        if(index2 == s.length()){
            return conSub(s, index1 + 1 , count , index1 + 2);
        }

        if(s.charAt(index1) == s.charAt(index2) ){
            count++ ; 
            return conSub(s,index1 , count, index2 + 1);
        }
        
        else{
    return  conSub(s,index1 , count , index2 + 1);

        }
}



    public static void main(String[] args) {
        String s = new String("aba");
        System.out.println(conSub(s ,0 , 0 ,1 ));
    }

}
