package OOP.Inheritance;

public class main {
    public static void main(String[] args) {
        Box obj=new Box(4,2,3);
//        System.out.println(obj.l+" "+obj.w+" "+obj.h);
//        System.out.println("The area is "+obj.area);
        BoxWeight obj1= new BoxWeight(1,2,4,5);
        System.out.println(obj1.h+" "+obj1.weight);
    }
}
