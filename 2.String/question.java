public class question {
    // convert the every first letter to uppercase.

    public static void main(String[] args){
        StringBuilder st= new StringBuilder("hi, i am atharv shete");
        for(int i=0; i < st.length() ; i++){
            char b= st.charAt(i);
            if(i==0){
                b=Character.toUpperCase(b);
                st.setCharAt(i,b);     //set used to update the string char...
            }
            else if(st.charAt(i-1)==' '){
               b=Character.toUpperCase(b);
               st.setCharAt(i,b);
            }   
        }
        System.out.print(st);
    }
    
}
