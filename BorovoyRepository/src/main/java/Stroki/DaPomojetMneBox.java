package Stroki;
public class DaPomojetMneBox {
    
    public static void main(String[] args) {
        String s="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
                + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
                + " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Rekyrsia(s, 0);
    }
    static void Rekyrsia(String s,int cnt) {
        long strat=System.currentTimeMillis();
      int counter=cnt;
      if(s.contains("o")){
         // counter++;
          Rekyrsia(s.substring(s.indexOf("o")+1), counter+1);
             }else{
          System.out.println(counter);
      }
            
            }  
    static void countChar(String s){
        long start=System.currentTimeMillis();
        int counter=0;
        for(int i=0;i<s.length())
    }
        }    
    

