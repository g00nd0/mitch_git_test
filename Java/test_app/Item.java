
//Day 22 - Creating Generic class
// doesnt really work, but this is just to illustrate the use of generics in Java
// class with generic datatype T

public class Item <T> {
    private T x;

    T getX() {
        return x;
    }

    void setX(T x){
        this.x = x;
    }
}