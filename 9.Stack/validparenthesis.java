import java.util.*;

public class validparenthesis {
    public static boolean validpare(String s) {
        Stack<Character> s1 = new Stack<>() ; 
        for(int i =0 ;i<s.length() ; i++){
            char curr = s.charAt(i) ; 
            if(curr == '{' || curr == '[' || curr=='('){
                s1.push(curr) ; 
            }
            else{
                if(s1.isEmpty()){
                    return false ;
                }

                if(curr == '}' && s1.peek() == '{'){
                    s1.pop();
                }
                else if(curr==']' && s1.peek() == '['){
                    s1.pop();
                }
                else if(curr == ')' && s1.peek() == '('){
                    s1.pop();
                }
                else{
                    return false ; 
                }
            }
        }
        
        if(s1.isEmpty()){
            return true ; 
        }
        else{
            return false ; 
        }
    }

    public static boolean validParen(String s){
        Stack <Character>s2 = new Stack<>();
        for(int i =0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch =='('){
                s2.push(')') ;
            }
            else if(ch == '{'){
                s2.push('}') ;
            }
            else if(ch == '['){
                s2.push(']');
            }
            else{
                if(!s2.isEmpty() && ch==s2.peek()){
                    s2.pop() ; 
                }
                else{
                    return false ; 
                }
            }
            }
        
        if(!s2.isEmpty()){return false ; }
        return true ; 
    }

    public static void main(String[] args){
        System.out.println(validParen("(((((())))))"));
    }
}
