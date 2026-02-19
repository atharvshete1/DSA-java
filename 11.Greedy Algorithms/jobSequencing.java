import java.util.*;

public class jobSequencing {
    static class job {
        int deadline;
        int profit;
        int no;

        public job(int no, int deadline, int profit) {
            this.no = no;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void sequecing(int[][] arr) {
        ArrayList<job> jobsSeq = new ArrayList<>();
        int deadline = 0;
        for (int i = 0; i < arr.length; i++) {
            job newJob = new job(i + 1, arr[i][0], arr[i][1]);
            jobsSeq.add(newJob);
            if (newJob.deadline > deadline) {
                deadline = newJob.deadline;
            }
        }
        Collections.sort(jobsSeq, (obj1, obj2) -> obj2.profit - obj1.profit);  //reverse sort
        job []ans= new job[deadline] ; 

        for(int i=0 ; i<jobsSeq.size() ; i++){
            job curr = jobsSeq.get(i);
            for(int j = curr.deadline -1 ; j>=0 ;j--){
                if(ans[j] == null){
                    ans[j] = curr; 
                    break ; 
                }
            }
        }
        ArrayList<Integer> ans1 = new ArrayList<>();
        for(int i =0 ; i < ans.length ; i++){
            if(ans[i] != null){
                ans1.add(ans[i].no);
            }
        }

        System.out.print((ans1));
    }

    public static void main(String[] args) {
        int[][] arr = { { 4, 90 }, { 3, 50 }, { 3, 40 } };
        sequecing(arr);

    }
}
