import java.util.* ; 

    public class Constructor{
    public static void main (String[] args){
     Pen p1 = new Pen();
     p1.brand = "rolex" ; 
     p1.colour = "red";
     p1.tip = 7;
     Pen p2 = new Pen();
     p2 = p1;
     p1.brand = "rollesx" ; 
     System.out.println(p2.brand);
    }
    }
     // copy constructor 
    class Pen {
        String brand;
        int tip;
        String colour ; 

        Pen(Pen obj){
            this.brand = obj.brand ; 
            this.tip = obj.tip ; 
            this.colour = obj.colour ; 
        }
        Pen(){
             this.tip = 0;
        }
    }


