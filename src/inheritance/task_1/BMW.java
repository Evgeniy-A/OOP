package inheritance.task_1;

public class BMW extends Car {
String conditioner;

    public BMW(String model, double price, String conditioner) {
        super(model, price);
        this.conditioner = conditioner;
    }
}
