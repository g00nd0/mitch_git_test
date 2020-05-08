import java.util.ArrayList;

public class Collections {

    //Day 23 - Generics with Multiple types
    // doesnt really work, but this is just to illustrate the use of generics in Java
    
    public static void main (String[] args) {
          
        /*      demonstrate creation and declaration of paired Generic datatypes, and placed into arraylist
        Pair<Integer, String> pair = new Pair<Integer, String>();
        pair.setX(5);
        pair.setY("just some random ass number, but they're paired");

        Pair<Integer, String> pair2 = new Pair<Integer, String>();
        pair2.setX(666);
        pair2.setY("hail santa");

        ArrayList<Pair<Integer, String>> arrList = new ArrayList<Pair<Integer, String>>();
        arrList.add(pair);
        arrList.add(pair2);
        */
        
        ArrayList<Person> people = new ArrayList<Person>(); // demostrates inheritance of Admin class from People class
        Admin a = new Admin();
        people.add(a);
        someFn(a);

        ArrayList<Admin> admins = new ArrayList<Admin>(); 

        ArrayList<Person> adminsPpl = new ArrayList<Person>();

        for(Admin admin : admins){  // going thru each admin in arraylist "admins"
            adminsPpl.add((Person)admin);   // each admin is typed to "Person" type and added to arraylist of Person class, "adminsPpl"
        }

        someFn(adminsPpl); // arraylist with admins can now be passed to someFn, with Arraylist<Person> type params
    }

    static void someFn(Person p){
        System.out.println(p);
    }

    static void someFn(ArrayList<Person> ppl){
        System.out.println(ppl);
    }
}