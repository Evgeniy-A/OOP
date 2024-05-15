package inheritance.task_1;

public class Car {
    String model;
    double price;


    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void printInfo(){
        System.out.println(model +" "+ price);
    }
}
