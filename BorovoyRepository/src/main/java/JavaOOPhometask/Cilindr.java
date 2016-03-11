package JavaOOPhometask;
public class Cilindr extends Enter{
    private int w;
    private int h;
    private int l;

    public Cilindr() {
    }

    public Cilindr(int w, int h, int l) {
        this.w = w;
        this.h = h;
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Cilindr{" + "w=" + w + ", h=" + h + ", l=" + l + '}';
    }
    
}
