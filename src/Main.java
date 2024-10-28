import java.util.ArrayList;

class Test{
    private int _x;
    Test(){}
    Test( int x){ _x = x;}
    public void set_x(int x) {_x = x;}
    public int get_x() {return _x;}
}
class Test2{
    private int _y;
    Test2(){}
    Test2( int y){_y = y;}
    public void set_y(int y) {_y = y;}
    public int get_y() {return _y;}
}
class Stuff<T>{
    private ArrayList<T> _thing;
    Stuff(){}
    Stuff(T t){_thing = t;}
    public void set_thing(T t) {_thing = t;}
    public T get_thing() {return _thing;}
    public void print() {
        if (_thing != null){
            System.out.println("Type: " + _thing.getClass().getName() +
                    ", Value: " + _thing);
        } else {
            System.out.println("null member variable");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Stuff<Test> s = new Stuff<>();
        s.print();
        s.set_thing(new Test(5));
        s.print();
        System.out.println(s.get_thing().get_x());
    }
}
