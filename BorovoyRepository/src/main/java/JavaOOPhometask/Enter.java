package JavaOOPhometask;
import java.util.Scanner;
public class Enter {
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
        System.out.println("Enter Number 5 for Volume YsKonys");
        System.out.println("Enter 6 for exit");
        int operation=sc.nextInt();
     
  
         switch(operation){
            case 1: vol="Volume Paralepiped";
            System.out.println("Volume Paralepiped");
            System.out.println("Enter r");
            int r=sc.nextInt();
            System.out.println("Enter h");
            int h=sc.nextInt();
            System.out.println("Res"+Paralipiped.Paralepiped(r, h));
               break;
        
                case 2:vol="Volume Ball";
                System.out.println("Volume Ball");
                System.out.println("Enter r");
                int r1=sc.nextInt();
                System.out.println("Res"+Ball.Ball(r1));
               break;
               
                case 3: vol="Volume Cylinder";
                System.out.println("Volume Cylinder");
                System.out.println("Enter w");
                int w=sc.nextInt();
                System.out.println("Enter h");
                int l=sc.nextInt();
                System.out.println("Enter l");
                int h1=sc.nextInt();
                System.out.println("Res"+Cilindr.Cylinder(w, h1, l)); 
               break;
                case 4:vol="Volume Konus";
                    System.out.println("Volume Konus");
                    System.out.println("Enter H");
                    int H=sc.nextInt();
                    System.out.println("Enter R");
                    int R=sc.nextInt();
                    System.out.println("Res"+Konys.Konys(R,H));
                    break;
                case 5:vol="Volume YsKonys";
                    System.out.println("YsKonys");
                    System.out.println("ENTER R");
                    int R1=sc.nextInt();
                    System.out.println("Enter r1");
                    int R2=sc.nextInt();
                    System.out.println("Enter h");
                    int h2=sc.nextInt();
                    System.out.println("Res"+YsKonys.YsKonys(R1, R2, h2));
                         break;
            default:vol="Exit";
          }
        System.out.println(vol);
        if (operation>5){
            finish=true;
        }
      
       }
    }
}
