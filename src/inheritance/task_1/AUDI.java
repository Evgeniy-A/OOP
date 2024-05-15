package inheritance.task_1;

public class AUDI extends Car {
    String heater;

    public AUDI(String model, double price, String heater) {
        super(model, price);
        this.heater = heater;
    }
}
