

public class Collections {

    //Day 22 - Creating Generic class
    // doesnt really work, but this is just to illustrate the use of generics in Java
    
    public static void main (String[] args) {
        Item<Person> some_item = new Item<Person>();
        Person p = new Person("piss", "off");
        some_item.setX(p);

        System.out.println(some_item.getX());
        
    }
}