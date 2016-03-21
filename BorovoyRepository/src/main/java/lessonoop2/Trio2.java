package lessonoop2;
public class Trio2 extends Shape{
   point a;
   point b;
   point c;

    public Trio2() {
    }

    public Trio2(point a, point b, point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public point getA() {
        return a;
    }

    public void setA(point a) {
        this.a = a;
    }

    public point getB() {
        return b;
    }

    public void setB(point b) {
        this.b = b;
    }

    public point getC() {
        return c;
    }

    public void setC(point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trio2{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}