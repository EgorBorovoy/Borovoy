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

public class Dz3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
           System.out.println("Enter: R= ");
            System.out.println("Enter: r= ");
            
       double Pi=3.14; //����� "�"
       double P;
       double S;
       double R=sc.nextInt();//������ ������� ����������
       double r=sc.nextInt();//������
        
        System.out.println("����� ����������: P=2�r");
        P=Pi*(2)*r;
        System.out.println(P);   
         System.out.println("������� �����: S=�r^2");
         S=Pi*(r*r);
         System.out.println(S);  
          System.out.println("������� ������: S=�(R^2-r^2)");
          S=Pi*((R*R)-(r*r));
          System.out.println(S);  
           
           
    }
}
