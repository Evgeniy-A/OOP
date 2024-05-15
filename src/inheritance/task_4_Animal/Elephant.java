package inheritance.task_4_Animal;

public class Elephant extends Animal {
    public Elephant(int satiety) {
        super(satiety);
    }

    public Elephant() {
    }

    @Override
    public boolean isFed() {
        return satiety > 50;
    }

    @Override
    public void printInfo() {
       super.printInfo();
    }
}
