package inheritance.task_3;

public class Circle extends Point{
    double radius;



    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("%nradius - %f",radius);
    }
}
