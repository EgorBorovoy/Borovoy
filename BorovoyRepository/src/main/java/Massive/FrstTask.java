package Massive;
import java.util.Arrays;
import java.util.Random;

public class FrstTask {
    public static void main(String[] args) {
       int[][] data  = new int[5][5];
       Random f=new Random(); 
        System.out.println("____________Matrix_________-");
       for(int[]arr:data){
              for (int i = 0;i < 5; i++) {
            for (int j =0; j < 5; j++){
              
              data[i][j] = f.nextInt(20);
               BblSort.sort(arr);
                    System.out.print(Arrays.toString(arr));
            

            }
          }
       }
    }   
}
    

