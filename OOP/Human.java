package OOP;

public class Human{
    int age;
    String name="efs";
    int salary;
    boolean isMarried;
    static long population;
    static void gree(){
        System.out.println("A object Created!");
    }
     Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population+=1;
        Human.gree();
    }
}