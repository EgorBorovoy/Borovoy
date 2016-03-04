/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.lessons.oop1;

/**
 *
 * @author Егор
 */
public class App {
    public static void main(String[] args) {
        Pan pan1=new Pan();
        Pan pan2=new Pan();
        double vol,pi=3.14;
        pan1.width=10;
        pan1.height=20;
        pan2.width=3;
        pan2.height=9;
        
        vol=((pan1.width/2)*(pan1.width/2))*pan1.height*pi;
        System.out.println("Volume is"+vol);
        vol=((pan2.width/2)*(pan2.width/2))*pan2.height*pi;
         System.out.println("Volume is"+vol);
       
        
    }
}
