import java.util.Objects;

//Day 23: Generics with Multiple Types

public class Person {
    String email;
    String last_name;
    Position position;

    Person(String email, String last_name){ // create constructor here
        this.email = email;
        this.last_name = last_name;
    }

    Person(){ // contructor for Admin class, for inheritance

    }

    @Override                     
    public int hashCode() {         // more graceful implementation of hashCode generated below (commented out)
        return Objects.hash(email, last_name, position);

    }
    /*
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }
    */
    @Override                               // equals method generated by "Source Action" menu, can be used to compare in hashCode()
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (last_name == null) {
            if (other.last_name != null)
                return false;
        } else if (!last_name.equals(other.last_name))
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        return true;
    }

    

}