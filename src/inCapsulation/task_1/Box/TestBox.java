package inCapsulation.task_1.Box;

public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box(3,3,3);
        System.out.println(box1.getLateralSurfaceArea());
        System.out.println(box1.getSurfaceArea());
        System.out.println(box1.getVolume());
        System.out.println(box1);

    }
}
