// создание трех конструкторов 
package lessonoop2;
public class Triongall extends Shape{
    
   private int x1;// x for a
   private int x2;// x for b
   private int x3;// x for c
    
   private int y1;
   private int y2;
   private int y3;
    point a;
    point b;
    point c;

    public Triongall() {
        x1=0;
        y1=0;
        
        x2=0;
        y2=10;
        
        x3=10;
        y3=10;
        
    }

    public Triongall(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    
     public Triongall(int x1, int x2, int x3, int y1, int y2, int y3, int collor) {
        super(collor);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    @Override
    void vrashenie(double gradysi) {
        System.out.println("rotate trio or "+gradysi+" degree");
    }
    @Override
    public String toString() {
        return "Triongall{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" 
                + x3 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + '}';
    }
   }
   

