package lessonoop2;
public class OOP {
    public static void main(String[] args) {
       Shape[] shapes=new Shape[10];
       for(int i=0;i<10;i++){
           if(i%2==0){
              shapes[i]=new Trio2();
           }else{
               shapes[i]=new Circle();
           }
       }
       double gradysi=23.5;
       for(Shape s:shapes){
           s.vrashenie(gradysi);
          }
        for(Shape s:shapes){
            System.out.println(s);
  }
}
}
 //for(Shape s:shapes){ //foreach