package Small;
import java.util.Scanner;

public class Task6 {
    static Scanner sc = new Scanner(System.in);
    
    static Seance[]conf;
    public static void main(String[] args) {
       
    }
    public static int pplQty(){
        int numConf=0;
        int pplQty=0;
        for(Seance c :conf){ 
            pplQty +=c.peopleQty;        
            numConf++;
        }
        return pplQty/numConf;
    }
         
    public static int longname() {
        int MaxNum=0;
        int MaxIndex=0;
        for(int i=0;i<conf.length;i++){
            if(conf.length>MaxNum){
                MaxNum=conf.length;
                MaxIndex=i;
                 System.out.println(MaxIndex);
            }
        }
        return MaxIndex;
    }
      public static Conference initConference(){
                String name = getConfName();
                String place = getConfAdress();
                
                return new Conference(name,place);
            }
    public static Seance initSeance(){
        int peopleQty=getSeancePplQty(); 
        String topic=getTopic();
        String date=getDate();
       return new Seance(date,topic,peopleQty);
    }
            public static String getConfName(){
                String name;
                while(true){
                    System.out.println("¬вод название конференции");
                    name=sc.nextLine();
                    if(name.length()>0){
                      break;
            }else{
                System.out.println("¬вел фигню , повтор");
            }
            
        }
        
        return name;
    }
           public static String getConfAdress(){
                String place;
                while(true){
                    System.out.println("¬вод place");
                    place=sc.nextLine();
                    if(place.length()>0){
                        break;
                       }else{
                System.out.println("¬вел фигню , повтор");
            }
            
        }
        
        return place;
    }
              public static int getSeancePplQty(){
                   int peopleQty;
                while(true){
                    try{
                System.out.println("¬вод колл людей на конференции");
                peopleQty=Integer.parseInt(sc.next());
                break;
            }catch(Exception e){
                System.out.println("Error, need enter number");
            }
        }
        return peopleQty;
    }  
                public static String getTopic(){
                   String topic;
                   while(true){
                       System.out.println("¬веди тему");
                       topic = sc.next();
                       if(topic.length() > 0){
                           break;
                       }else{
                           System.out.println("¬вел фигню , повтор");
                       }
                    }
                    return topic;
                }
                    public static String getDate(){
                      String date;
                      while(true){
                          System.out.println("¬веди ƒату");
                          date = sc.next();
                          if(date.length() > 0){
                              break;
                          }else{
                              System.out.println("¬вел фигню , повтор");
                          }
                      }
                      return date;
                  }
              }
            



  
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 
    
    


