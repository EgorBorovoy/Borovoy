package uits.jv1601.lessons;

import java.util.Scanner; 
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i ;
        System.out.print("Введите целое число: ");
       
          i = sc.nextInt();
          System.out.println(i*2);
     
          System.out.println("Вы ввели не целое число");
        }
    }
