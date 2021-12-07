package OOP;

import java.util.Scanner;

public class GarbageCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj=new A("Randaom");
        }
    }
}
class A{
    String name;
    A (String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed!");
    }
}
