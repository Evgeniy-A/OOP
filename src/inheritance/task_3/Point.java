package inheritance.task_3;

import java.sql.SQLOutput;

public class Point {
    double x;
    double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printInfo(){
        System.out.printf("Point: (%f, %f)",x,y);
    }
}

