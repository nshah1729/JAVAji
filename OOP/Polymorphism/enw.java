package OOP.Polymorphism;
public class enw {
    int num;
    enw(int num){
        this.num=num;
    }

    @Override
    public String toString() {
        return "enw{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        enw obj=new enw(32);
        System.out.println(obj);
    }
}
