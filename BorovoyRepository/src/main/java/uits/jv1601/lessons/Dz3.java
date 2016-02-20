/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.lessons;

import java.util.Scanner;

/**
 *
 * @author Егор
 */

public class Dz3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
           System.out.println("Enter: R= ");
            System.out.println("Enter: r= ");
            
       double Pi=3.14; //Число "П"
       double P;
       double S;
       double R=sc.nextInt();//Радиус внешней окружности
       double r=sc.nextInt();//Радиус
        
        System.out.println("Длина окружности: P=2Пr");
        P=Pi*(2)*r;
        System.out.println(P);   
         System.out.println("Площадь круга: S=Пr^2");
         S=Pi*(r*r);
         System.out.println(S);  
          System.out.println("Площадь кольца: S=п(R^2-r^2)");
          S=Pi*((R*R)-(r*r));
          System.out.println(S);  
           
           
    }
}
