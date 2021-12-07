package OOP;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
//"new" keyword allocates the memory at runtime(dynamically) and returns a reference to it
        Student Nishant=new Student(12,"Nishant",99);
//        Nishant.greet();
        Student[] students=new Student[5];
//        System.out.println(Arrays.toString(students));
//        System.out.println(Nishant);
        Student rahul=new Student(21);
        System.out.println(rahul.name);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    void greet(){
        System.out.println("Hello, my name is "+this.name);
    }
    Student (int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student (int roll){
        this.rno=roll;
        this.name="Rahul";
        this.marks=21;
    }
}