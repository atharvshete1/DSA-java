public class quetion1 {
    public static void main(String[] args){
       String s = new String("aaabbssxx");
        StringBuilder b=new StringBuilder("");
        char demo =s.charAt(0);
        int count=0;
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == demo){
                count++;
            }
            else{
                b.append(demo);
                b.append(count);
                demo=s.charAt(i);
                count=1;
            } 
        }
        b.append(demo);
        b.append(count);
        System.out.println(b);
    }
    

}

