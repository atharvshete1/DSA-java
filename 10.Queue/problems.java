import java.util.*;

public class problems {
    // Q1) GivenanumberN :- The task is to generate and print all binary numbers
    // with decimal values from1 to N.Sample Input 1: N =2Sample Output 1: 1
    // 10Sample Input 2: 5.Sample Output 2: 1 10 11 100 101
    public static void givenum(int m) {
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 1; i <= m; i++) {
            int n = 0;
            int bin = 0;
            int num = i;
            while (num > 0) {
                int remainder = num % 2;
                num = num / 2;
                bin = (int) (bin + (remainder * Math.pow(10, n)));
                n++;
            }
            q1.add(bin);

        }

        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }

    }

    /*
     * Q2)You are given an array of N ropes, where each rope has a certain length.
     * The task is to connect all the ropes into a single rope.
     * The cost of connecting two ropes is equal to the sum of their lengths.
     * After connecting two ropes, the resulting rope has a length equal to their
     * sum.
     * You must continue connecting ropes until only one rope remains.
     * Your task:
     * Find the minimum total cost required to connect all the ropes.
     */
    public static void ropePrice(int[] arr, int n) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            p1.add(arr[i]);
        }
        int cost = 0;
        while (p1.size() != 1) {
            int first = p1.poll();
            int second = p1.poll();
            int add = first + second;
            p1.add(add);
            cost = cost + add;
        }
        System.out.println(cost);
    }

    //Q3) job sequencing problem
    /* Do possible max profit jobs 
       Conditions - 1 job required time is 1 slot
       so input is 2D array and i have to find max profit job then and 
       job deadline is must be smaller than current day 
       E.g - 
       Job_ID   Deadline  Profit  
         1        4         80
         2        1         20
         3        1         30
         4        1         40

       Now Answer is - 1,4 
       Cause the longest deadline is the  4 
       so we create longest deadline Queue, 
       now for index 0 we do work which has 
       deadline 1 , we find which is has max 
       profit with deadline 1.
       that same mrthod we do for the all indexes.
       
       optimized version - 
       Sort the 2D array then 
       Condition - 
       1)The job work is not reapeated
       2)Deadline and slot is must the equal to slot day 
       if this all happen the push it; 
      */
    public static void jobSeq(int[][] arr) {
        // longest Deadline - crete queue
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i][1]);
        }
        ArrayList<Integer> q1 = new ArrayList<>();

        // fill the slots
        Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[2]).reversed());

        for (int j = 1; j <= max; j++) {
            int i = 0;
            while (i < arr.length && j<=max) {
                if (!q1.contains(arr[i][0]) && arr[i][1] == j ) {
                    q1.add(arr[i][0]);
                    break;
                } else {
                    i++;
                }
            }
        }
        // return the queue
        System.out.println(q1);
    }
    //Q4) reverse the stack at index k
    public static void reverseQue(Deque<Integer> sample , int k){
        Queue<Integer> q1 = new LinkedList<>() ;
        int count = 0 ; 
        while(count < k){
            q1.add(sample.remove());
            count++ ; 
        }

        while(count > 0){
            sample.addFirst(q1.remove()) ;
            count-- ;  
        }

        while(!sample.isEmpty()){
            System.out.print(sample.getFirst() + " ");
            sample.removeFirst();
        }
    }

    //Q5)Maximum of all subarray of size k
    /* For this we sliding window cause the size is definite
        and stored the largest number in subarray    
        E.g arr[] = {1,2,3,1,4,5,2,3,6} 
        output = [3,3,4,5,5,5,6]   
    */

    public static void maxSubArrayNum(int [] arr , int k){
      Queue<Integer> q1 = new LinkedList<>() ;
      Stack<Integer> q2 = new Stack<>();
      int count =0 ;  
      for(int i =0; i<arr.length ; i++){
        if(q2.isEmpty()){
            q2.push(arr[i]);
            continue ; 
        }
        count++ ; 
        if( q2.peek() < arr[i]){
            q2.pop();
            q2.push(arr[i]) ; 
        }
        if(count % 3 == 0){
            q1.add(q2.pop()); 
        }
      }

      System.out.println(q1);
    }

    public static void main(String[] args) {
        // givenum(5);

        /*
         * int[] arr = {2,4,6,8,10} ;
         * int n = 5;
         * ropePrice(arr , n );
        */
        
        /* int[][] arr = { { 1, 4, 20}, { 2, 1, 10}, { 3, 1,40 }, { 4, 1, 30 }, { 5, 1, 50 } };
        jobSeq(arr);
        */
        
        // Deque <Integer>d1 = new LinkedList<>();
        // int v= 0 ;
        // while(v < 10){
        //     d1.add(v) ; 
        //     v++ ; 
        // }

        // reverseQue(d1 , 5) ; 
        int [] num = {1,2,3,1,4,5,2,3,6} ;
        maxSubArrayNum(num, 3);
    }
}