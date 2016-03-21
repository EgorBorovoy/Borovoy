
package oop2;

public class Car implements Comparable<Car>{
   private int cleanrnc;
   private int weight;
   private int volume;
   private int passajir;
   private String collor;

    public Car() {
        
    }

    public Car(int cleanrnc, int weight, int volume, int passajir, String collor) {
        this.cleanrnc = cleanrnc;
        this.weight = weight;
        this.volume = volume;
        this.passajir = passajir;
        this.collor = collor;
    }

    public int compareTo(Car o) {
         return this.volume - o.volume; 
    }

    @Override
    public String toString() {
        return "Car{" + "cleanrnc=" + cleanrnc + ", weight=" + weight + ", volume=" + volume + ", passajir=" + passajir + ", collor=" + collor + '}';
    }
    

    public int getCleanrnc() {
        return cleanrnc;
    }

    public void setCleanrnc(int cleanrnc) {
        this.cleanrnc = cleanrnc;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPassajir() {
        return passajir;
    }

    public void setPassajir(int passajir) {
        this.passajir = passajir;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }
   
}
