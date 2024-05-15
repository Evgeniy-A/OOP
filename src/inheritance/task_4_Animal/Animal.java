package inheritance.task_4_Animal;

import java.sql.SQLOutput;

public class Animal {
    int satiety;

    public Animal() {
    }

    public Animal(int satiety) {
        this.satiety = satiety;
    }

    public void feed(int amountOfFood){
        satiety = (amountOfFood > 0) ? satiety + amountOfFood:satiety;
    }
    public boolean isFed(){
        return satiety > 0;
    }
    public void printInfo(){
        if (isFed()){
                System.out.printf("I'm %s with level of satiety %d. I'm not hungry",this.getClass().getName(), satiety);
        }
        else {
            System.out.printf("I'm %s with food %d. I'm hungry/n", this.getClass().getName(), satiety);
        }
    }
}
