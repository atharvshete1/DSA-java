import java.util.*;

public class p1{
public static void main (String[] args){
    S2 rohit = new S2() ;
    rohit.setName("Rohit");
    rohit.setMarks(89);
    System.out.println(rohit.name +" "+rohit.marks) ;  
    rohit.noOfClass() ; 
}
}

abstract class Form{
    String name ; 
    int marks  ;

    abstract void setName(String name);
    abstract void setMarks(int marks);


   
}

abstract class S1 extends Form{
    
    void setName(String name){
        this.name = name ;
    }
    
    void setMarks(int marks){
        this.marks = marks ; 
    }

    abstract void noOfClass();
}

class S2 extends S1 {
     void setName(String name){
        this.name = name ;
    }
    
    void setMarks(int marks){
        this.marks = marks ; 
    }
    
    void noOfClass(){
        System.out.println("Third Class is also called..");
    }
}






