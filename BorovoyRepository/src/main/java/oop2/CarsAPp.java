package oop2;

import java.util.Arrays;
import java.util.Random;

public class CarsAPp {
     static Car[] cars=new Car[10];
    public static void main(String[] args) {
        System.out.println("befor init");
        PrintCars();
        init();
        
        System.out.println("after init");
        PrintCars();
        
        Arrays.sort(cars);
        System.out.println("After sort");
         PrintCars();
        }
    static void init(){
    for(int i=0;i<10;i++){
        Car t=new Car();
        Random r=new Random();
        t.setCleanrnc(r.nextInt(15)+10);
        t.setPassajir(r.nextInt(2)+2);
        t.setCollor(String.valueOf(r.nextInt(15)));
        t.setVolume(r.nextInt(150)+100);
        t.setWeight(r.nextInt(1500)+1000);
        cars[i]=t; 
        
    }
    }
    public static void PrintCars(){
    for (Car c:cars){
        System.out.println(c);
    }
}
}
