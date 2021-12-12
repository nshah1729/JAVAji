package OOP.abstractDemo;

public class Son extends Parent{

    @Override
    void career(String Choice) {
        System.out.println("I am going to be a "+ Choice);
    }

    @Override
    void car(String name) {
        System.out.println("I am going to buy a "+ name);
    }
}
