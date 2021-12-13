package OOP.Interfaces;

public class Car implements Engine,Brake{

    @Override
    public void brake() {
        System.out.println("I brake Like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start Like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop Like a normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate Like a normal Car");
    }
}
