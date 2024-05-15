package inCapsulation.task_1.Box;

public class Box {
    private double l;
    private double w;
    private double h;

    private double lateralSurfaceArea = 0;
    private double surfaceArea = 0;
    private double volume = 0;

    public Box(double l, double w, double h) {
       if (l > 0 && w > 0 && h  > 0) {
           this.l = l;
           this.w = w;
           this.h = h;
       }
    }
    @Override
    public String toString(){
       return String.format("%.1f %.1f %.1f",l,w,h);
    }

    public double getLateralSurfaceArea (){
       return 2 * (this.l * this.h + this.w * this.h);

    }

    public double getSurfaceArea(){
      return  2 * (this.l * this.w) + getLateralSurfaceArea();
    }

    public double getVolume(){
       return this.l * this.w * this.h;
    }
}
