package JavaOOPhometask;
public class Ball extends Enter{
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
