import java.util.*;

public class pracice {

    public static boolean isEven(int num){
        int b=num & 1;
        if( b == 0){return true;}

        return false;
    }

    public static int checkith(int num, int i){
        int c = 1 << i ; 
        if((num & c )== 0){return 0;}
        return  1;
    }

    public static int setith(int num , int i){
        int c= 1 << i;
        int temp = (num | c);
        num = temp;
        
        return num ; 
    }
    public static void main(String[] args){
        /* int num = 9;
        System.out.println(isEven(num));
        */
        int num = 16;
        int i=4;
        System.out.println(checkith(num, i));
        System.out.println();
        }

}