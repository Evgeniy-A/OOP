package inheritance.task_2;

public class Entity extends BaseObject{
    public Entity(int x, int y, int z) {
        super(x, y, z);
    }

    public void  move(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
