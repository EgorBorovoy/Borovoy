package JavaOOPhometask;
public class Paralipiped extends Enter{
   private int r;
   private int h;

    public Paralipiped() {
    }

    public Paralipiped(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Paralipiped{" + "r=" + r + ", h=" + h + '}';
    }
   
}
