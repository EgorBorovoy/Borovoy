
package uits.jv1601.Borovoy;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String Numb;
        boolean finish=false;
       while(!finish){
           System.out.println("Enter number 0 do 9");
           int number=sc.nextInt();
        switch(number){
            case 1:Numb="Odin";
            
            break;
            case 2:Numb="Dva";
            break;
            case 3:Numb="Tri";
            break;
            case 4:Numb="Chetiri";
            break;
            case 5:Numb="Pati";
            break;
            case 6:Numb="Shest";
            break;
            case 7:Numb="sem";
            break;
            case 8:Numb="Vosem";
            break;
            case 9:Numb="Devet";
            break;
            default:Numb="Nety takogo chisla";
        
        }
        System.out.println(Numb);
         if(number<0){
           finish=true;
    }
      
       }
}
}