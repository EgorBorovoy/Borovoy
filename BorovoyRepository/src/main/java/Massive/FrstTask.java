package Massive;
import java.util.Arrays;
import java.util.Random;

public class FrstTask {
    public static void main(String[] args) {
       int[][] data  = new int[5][5];
       Random f=new Random(); 
        System.out.println("________Matrix_______");
        
              for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5; j++){
                 data[i][j] = f.nextInt(20);
                   System.out.print(data[i][j]+"\t");
              }
                  System.out.println();
            }
              int min = data[0][0];
        for(int i = 0; i < data.length-1; i ++){
         for(int j = 0; j < data.length-1; j ++){
            if(data[i][j]<min){
            min = data[i][j];
             }
           }
         }
        System.out.println(min);
 } 
}





            
                



    

