package OOP.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    double area;

     Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
        this.area=l*w*h;
    }
     Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
        this.area=side*side*side;
    }

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
        this.area=l*w*h;
    }
}
