import java.util.*;
 
public class duplicateParenthesis{
    public static boolean dupliPare(String s){
        Stack<Character>s1 = new Stack<>(); 
        for(int i =0 ; i<s.length() ; i++){
            char ch = s.charAt(i) ;
            if(ch !=')' && ch != ']' && ch != '}'){
                s1.push(ch);
            }
            else{
                int count = 0 ; 
                if (s1.isEmpty()){return true ;}
                while(ch==')' && s1.peek()!='(' || ch=='}' && s1.peek()!='{' || ch==']' && s1.peek()!='[' ){
                    s1.pop() ; 
                    count++ ; 
                }
                if(count<1){return true ;}
            }
        } 
        return false ; 
    }
    public static void main (String[] args){
        System.out.println(dupliPare("{(a+b) + (c+d)}")) ; 
    }
}

    

