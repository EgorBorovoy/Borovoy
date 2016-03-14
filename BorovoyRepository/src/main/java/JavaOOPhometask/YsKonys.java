package JavaOOPhometask;
public class YsKonys {
     public static double YsKonys(double R1,double R2,double h2 ) {
        return(double)((Math.PI*h2*(R2*R2)+R2*R2+(R2*R2)*1/3));
    }
   private int h;
   private int r1;
   private int r2;

    public YsKonys() {
    }

    public YsKonys(int h, int r1, int r2) {
        this.h = h;
        this.r1 = r1;
        this.r2 = r2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "YsKonys{" + "h=" + h + ", r1=" + r1 + ", r2=" + r2 + '}';
    }
   
}
