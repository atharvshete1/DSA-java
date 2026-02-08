public class largestString {

    public static void main(String[] args){
        String arr[] = {"vaibhav","vtharv","vranav","vibhav"};
        String st= new String("hi, i am atharv shete");
        String largest=arr[0];
        for(int i=1; i<arr.length; i++){
          if(largest.compareTo(arr[i]) < 0){
            largest=arr[i];
          }
        }

        System.out.println(largest);
    }
    
}
