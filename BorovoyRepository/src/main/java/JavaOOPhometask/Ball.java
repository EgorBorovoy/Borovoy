package JavaOOPhometask;
public class Ball extends Enter{
     public static double Ball(double r) {
        return(double)((4*Math.PI*r*r*r)/3);
    }
    private int r;

    public Ball() {
    }

    public Ball(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Ball{" + "r=" + r + '}';
    }
    
}
