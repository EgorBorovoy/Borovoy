/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.lessons;

import java.util.Scanner;

/**
 *
 * @author ����
 */
public class Dz4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
           System.out.print("Enter: H= ");
           double H=sc.nextInt();
            System.out.print("Enter: r1= ");
             double r=sc.nextInt();
            System.out.print("Enter: r2= ");
             double r1=sc.nextInt();
            
       double Pi=3.14; //����� "�"
       double V;
       double S;
      
        System.out.println("����� ��������: V=�r^2*H");
        V=Pi*(r*r)*H;
        System.out.println(V);   
         System.out.println("����� ������� ��������: V=�H(r2^2-r1^2)");
         V=Pi*H*((r1*r1)-(r*r));
         System.out.println(V);  
          System.out.println("������� ������� ����������� ��������: S=2�rH");
         S=2*Pi*r*H;
          System.out.println(S);  
    }
}
