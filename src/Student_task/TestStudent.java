package Student_task;

public class TestStudent {
    public static void main(String[] args) {

        int[][] marksIvan = {{4, 4, 4, 4}, {4, 5, 3, 4}, {5, 3, 4, 5}, {4, 4, 4, 4}};
        Student ivan = new Student("Ivan",marksIvan);

        System.out.println(ivan.getAverage(3));
        System.out.println(ivan.getAverage());

        int [][] marksOleg = {{4,5,4,4},{4,4,4,5},{3,4,4,4},{5,5,5,5}};
        Student oleg = new Student("Oleg", marksOleg);

        System.out.println(oleg.getAverage(2));
        System.out.println(oleg.getAverage());
    }
}

