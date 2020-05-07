import java.util.HashMap;
import java.util.HashSet;

public class Collections {

    //Day 21 - HashSets & HashMaps
    public static void main (String[] args) {
        HashSet<Person> people = new HashSet<Person>();

        Person p = new Person("email@email.com", "Goon");
        Position pos1 = new Position(10,10);
        p.position = pos1;

        Person q = new Person("email@email.com", "Goon");
        Position pos2 = new Position(10,10);
        q.position = pos2;
       
        people.add(p);
        people.add(q);

        // System.out.println(p.equals(q));
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());

        // Below, adding an object to a HashMap, checking if it exists by querying if it exists using a String Key "email@email.com"
        
        Person r = new Person("email@email.com", "Goon");
        Position pos3 = new Position(10,10);
        r.position = pos3;

        HashMap<String, Person> groupie = new HashMap<String, Person>();
        groupie.put("email@email.com", r);      // string key specified, but will bring up contents of object "r" if indexed
        System.out.println("Hashmap: " +  groupie.containsKey("email@email.com"));
        

        

        
    }
}