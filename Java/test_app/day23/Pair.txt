
//Day 23 - Generics with Multiple Types
// doesnt really work, but this is just to illustrate the use of generics in Java
// class with generic datatype T, U

public class Pair <T, U> {
    private T x;
    private U y;

    T getX() {
        return x;
    }

    void setX(T x){
        this.x = x;
    }

    U getY() {
        return y;
    }

    void setY(U y){
        this.y = y;
    }
}