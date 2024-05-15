package inheritance.task_2;

public class BaseObject {
    int x;
    int y;
    int z;

    public BaseObject() {
    }

    public BaseObject(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int[]getCoordinates(){
      return  new int []{x,y,z};
    }
}

