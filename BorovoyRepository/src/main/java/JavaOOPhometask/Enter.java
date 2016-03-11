package JavaOOPhometask;
import java.util.Scanner;
public class Enter {
    public static double Paralepiped(double r,double h) {
      return(double)(Math.PI*r*r*h);  
    }
    public static double Ball(double r) {
        return(double)((4*Math.PI*r*r*r)/3);
    }
    public static double Cylinder(double w,double h,double l) {
        return(double)(w*h*l);
    }
     public static double Konys(double R,double H) {
        return(double)((Math.PI*R*R*H)*1/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String vol;
    boolean finish=false;
    while(!finish){
        System.out.println("Enter Number proposals");
        System.out.println("Enter Number 1 for Volume Paralepiped");
        System.out.println("Enter Number 2 for Volume Ball");
        System.out.println("Enter Number 3 for Volume Cylinder");
        System.out.println("Enter Number 4 for Volume Konys");
        System.out.println("Enter 5 for exit");
        int operation=sc.nextInt();
     
  
         switch(operation){
            case 1: vol="Volume Paralepiped";
            System.out.println("Volume Paralepiped");
            System.out.println("Enter r");
            int r=sc.nextInt();
            System.out.println("Enter h");
            int h=sc.nextInt();
            System.out.println("Res"+Paralepiped(r, h));
               break;
        
                case 2:vol="Volume Ball";
                System.out.println("Volume Ball");
                System.out.println("Enter r");
                int r1=sc.nextInt();
                System.out.println("Res"+Ball(r1));
               break;
               
                case 3: vol="Volume Cylinder";
                System.out.println("Volume Cylinder");
                System.out.println("Enter w");
                int w=sc.nextInt();
                System.out.println("Enter h");
                int l=sc.nextInt();
                System.out.println("Enter l");
                int h1=sc.nextInt();
                System.out.println("Res"+Cylinder(w, h1, l)); 
               break;
                case 4:vol="Volume Konus";
                    System.out.println("Volume Konus");
                    System.out.println("Enter H");
                    int H=sc.nextInt();
                    System.out.println("Enter R");
                    int R=sc.nextInt();
                    System.out.println("Res"+Konys(R,H));
            default:vol="Exit";
          }
        System.out.println(vol);
        if (operation>4){
            finish=true;
        }
      
       }
    }
}
