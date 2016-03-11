package lessonoop2;
public class Circle extends Shape{
  private int xc;
  private int yc;
  private int r;

    public Circle() {
        xc=100;
        yc=100;
        r=10;
    }

    public Circle(int xc, int yc, int r) {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

    public Circle(int xc, int yc, int r, int collor) {
        super(collor);
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

  
    public int getXc() {
        return xc;
    }

    public void setXc(int xc) {
        this.xc = xc;
    }

    public int getYc() {
        return yc;
    }

    public void setYc(int yc) {
        this.yc = yc;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" + "xc=" + xc + ", yc=" + yc + ", r=" + r + '}';
    }

    @Override
    void vrashenie(double gradysi) {
        System.out.println("rotatee cirxle= "+gradysi+" degri");
    }
    
    
    
  }

