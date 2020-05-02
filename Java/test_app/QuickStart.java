package Java;

public class QuickStart{
 
    //Day 19: hashCode() method
    public static void main(String[] args){
       String s = "Mitch";
       String t = "Mitch";
       System.out.println(s.hashCode()); // in certain situations, hashcodes may be the same for diff inputs, but is by coincidence
       System.out.println(t.hashCode()); // but if two objects are the same by the *.equals() method, then they have to have the same hash code
       System.out.println(s.equals(t));
       

    }


}