package inheritance.task_4_Animal;

public class TestAnimal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Animal[] animals = new Animal[n];

        for (int i = 0; i < animals.length; i++) {
            if (i < n / 2) {
                animals[i] =
                        new Elephant();
            } else {
                animals[i] = new Parrot();
            }
        }


        for (int i = 0; i < animals.length; i++)  {
            animals[i].feed(numbers[i]);
            animals[i].printInfo();
        }
    }
}
