package inheritance.task_2;

public class Block extends BaseObject  {
    public Block(int x, int y, int z) {
        super(x, y, z);
    }

    public void shatter(){
        x = 0;
        y = 0;
        z = 0;
    }

}
