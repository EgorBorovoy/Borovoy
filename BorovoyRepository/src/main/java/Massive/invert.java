package Massive;

import java.util.Arrays;
import java.util.Random;

public class invert {
    
public static void invert(int[][]arr){
        for(int k=0;k<arr.length/2;k++){
            for(int h=0;h<arr.length/2;h++){
                int tmp=arr[k][h];
                arr[k][h]=arr[arr.length-k-1][arr.length-h-1];
                arr[arr.length-k-1][arr.length-h-1]=tmp;
            }
        }
               
                   
    }
    public static void main(String[] args) {
        int[][]arr=new int[5][5];
        Random f=new Random();
         for (int i = 0;i < 5; i++) {
            for (int j =0; j < 5; j++){
                arr[i][j] = f.nextInt(20);
            
                System.out.println(Arrays.toString(arr)+" ->");
                invert(arr);
                System.out.print(Arrays.toString(arr));
            }
         }
    }
               
    
}
