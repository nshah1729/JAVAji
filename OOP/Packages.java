package OOP;

public class Packages {
    public static void main(String[] args) {
        Gill A=new Gill("Rahul");
        System.out.println(A);
    }
}
class Gill{
    String name;
    int roll;
    Gill (String name){
        this.name=name;
    }
}