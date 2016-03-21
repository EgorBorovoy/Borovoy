package Massive;
public class BblSort {
    public static void sort(int[]data) {
        for(int i=data.length-1;i>=0;i--){
            for(int index=0;index<i;index++){
                if (data[index]>data[index+1]){
                    int tmp=data[index];
                    data[index]=data[index+1];
                    data[index+1]=tmp;
                }
            }
        }
    }
}
