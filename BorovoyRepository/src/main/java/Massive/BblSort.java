package Massive;
public class BblSort {
    public static void sort(int[]data) {
        for(int barr=data.length-1;barr>=0;barr--){
            for(int index=0;index<barr;index++){
                if (data[index]>data[index+1]){
                    int tmp=data[index];
                    data[index]=data[index+1];
                    data[index+1]=tmp;
                }
            }
        }
    }
}
