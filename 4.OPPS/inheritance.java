import java.util.* ;

public class inheritance{
    public static void main(String[] args){
        D1 puppy = new D1();
        System.out.println(puppy.name);
        System.out.println(puppy.colour);
        System.out.println(puppy.legs);
        puppy.Sound();
    }

}

 class Animal {                                     // base class 
    String name ;
    String colour;
    int legs ;  
    void Sound(){
        System.out.println("Yes");
    }
 }

 class Dog extends Animal {                         // Derived class 
    void Sound(){                                   // Method Overriding 
        System.out.println("Barks");
    }  
 }

 class D1 extends Dog                               // hierichal inheritance 
 {
    D1(){
    this.name = "puppy" ;
    this.colour = "white"; 
    this.legs = 4;
    } 
 }
