package JavaOOPhometask;
public class Konys extends Enter{
    private int R;
    private int H;

    public Konys() {
    }

    public Konys(int R, int H) {
        this.R = R;
        this.H = H;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    @Override
    public String toString() {
        return "Konys{" + "R=" + R + ", H=" + H + '}';
    }
            
}
