package inheritance.task_1;

public class CarTest  {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new BMW("7",15000, "conditioner");
        cars[1] = new AUDI("A3",12000, "нагреватель");
        cars[2] = new AUDI("A3",12000, "нагреватель");
        for (Car car:cars
             ) {
        }
    }
}
