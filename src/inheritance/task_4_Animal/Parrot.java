package inheritance.task_4_Animal;

public class Parrot extends Animal{
    public Parrot(int satiety) {
        super(satiety);
    }

    public Parrot() {
    }

    @Override
    public boolean isFed() {
        return satiety > 5;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}

