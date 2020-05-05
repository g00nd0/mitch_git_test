public class Collections {

    //Day 20: Overriding hashCode() and equals()
    public static void main (String[] args) {
        Person p = new Person("email@email.com", "Goon");
        Position pos1 = new Position(10,10);
        p.position = pos1;

        Person q = new Person("email@email.com", "Goon");
        Position pos2 = new Position(10,110);
        q.position = pos2;
       
        // System.out.println(p.equals(q));
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());

        
    }
}