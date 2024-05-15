package inheritance.task_3;

public class Cylinder extends Circle {

    double h;

    public Cylinder(double x, double y, double radius, double h) {
        super(x, y, radius);
        this.h = h;
    }

    @Override
    public void printInfo(){
        System.out.printf("%nradius - %f, height - %f",radius, h);
    }
}
