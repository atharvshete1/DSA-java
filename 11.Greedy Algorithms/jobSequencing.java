import java.util.*;

public class jobSequencing {
    public static void minJobSequencing(Integer[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(b -> b[1]));
        int deadline = 0;

        Queue<Integer> q1 = new LinkedList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        int j = 1;
        int i = 0;
        int totalProfit = 0;

        while (i < arr.length  && j <= arr[arr.length-1][1]) {
            int gretest = 0 ;
            int grejob = 0 ;
            while(i < arr.length  && j == arr[i][1]){
                if(gretest < arr[i][2]){
                    gretest = arr[i][2] ; 
                    grejob = arr[i][0];
                }
                i++ ; 
            }
            if(gretest == 0 && grejob == 0 ){
                j++ ; 
                continue ;
            }
            else{
                a1.add(grejob);
                j++;
            }
        }

       System.out.println(a1);
    }

    public static void main(String[] args) {
        Integer[][] arr = { { 1, 4, 20 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 2, 30 } };
        minJobSequencing(arr);
    }
}
