package OOP;

public class Simple {
    public static void main(String[] args) {
        Simple obj=new Simple();
        obj.fun();
    }
    void fun(){
        greet();
    }
    void greet(){
        System.out.println("Hello there!");
    }
}
