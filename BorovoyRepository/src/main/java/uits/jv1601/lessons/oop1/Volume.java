package uits.jv1601.lessons.oop1;

import java.util.Scanner;

public class Volume {
     public static double Paralepiped(double r,double h) {
      return(double)(Math.PI*r*r*h);  
    }
    public static double Ball(double r1) {
        return(double)((4*Math.PI*r1*r1*r1)/3);
    }
    public static double Cylinder(double w,double h1,double l) {
        return(double)(w*h1*l);
    }
public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String vol;
    boolean finish=false;
    while(!finish){
        System.out.println("Enter Nuber proposals");
        System.out.println("Enter Nuber 1 for Volume Paralepiped");
        System.out.println("Enter Nuber 2 Volume Ball");
        System.out.println("Enter Nuber 3 Volume Cylinder");
        System.out.println("Enter 4 for exit");
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
               
            default:vol="Exit";
          }
        System.out.println(vol);
        if (operation>3){
            finish=true;
        }
      
       }
}
}


   

  




