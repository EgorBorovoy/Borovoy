package Small;
import java.util.Scanner;
public class Task6 {
    static Scanner sc = new Scanner(System.in);
    static Seance[]conf;
    public static void main(String[] args) {
       
        
    }
    public static int pplQty() {
        int numConf = 0;
        int pplQty = 0;
        for (Seance c : conf) {
            pplQty += c.peopleQty;
            numConf++;
        }
        return pplQty / numConf;
    }

    public static int pplMax() {
        int pplmax = 0;
        for (Seance c : conf) {
            if (c.peopleQty > pplmax) {
                pplmax = c.peopleQty;
            }
        }
        return pplmax;
    }

    public static int longname() {
        int MaxNum = 0;
        int MaxIndex = 0;
        for (int i = 0; i < conf.length; i++) {
            if (conf.length > MaxNum) {
                MaxNum = conf.length;
                MaxIndex = i;
                System.out.println(MaxIndex);
            }
        }
        return MaxIndex;
    }

    public static Conference initConference() {
        String name = getName();
        String place = getAdress();
        return new Conference(name, place);
    }

    public static Seance initSeance() {
        int peopleQty = getPplQty();
        String topic = getTopic();
        String date = getDate();
        return new Seance(date, topic, peopleQty);
    }

    public static String getName() {
        String name;
        while (true) {
            System.out.println("���� �������� ����������� ");
            name = sc.nextLine();
            if (name.length() > 0) {
                break;
            } else {
                System.out.println("����� �������� ��������,������ ");
            }
        }
        return name;
    }

    public static String getAdress() {
        String place;
        while (true) {
            System.out.println("������� ����� ");
            place = sc.nextLine();
            if (place.length() > 0) {
                break;
            } else {
                System.out.println("����� �������� �����,������ ");
            }
        }
        return place;
    }

    public static int getPplQty() {
        int peopleQty;
        while (true) {
            try {
                System.out.println("���� ���� ����� �� ����������� ");
                peopleQty = Integer.parseInt(sc.next());
                break;
            } catch (Exception e) {
                System.out.println("����� �������� ���� �����  ");
            }
        }
        return peopleQty;
    }

    public static String getTopic() {
        String topic;
        while (true) {
            System.out.println("����� ���� ");
            topic = sc.next();
            if (topic.length() > 0) {
                break;
            } else {
                System.out.println("����� �������� �������� ����,������ ");
            }
        }
        return topic;
    }

    public static String getDate() {
        String date;
        while (true) {
            System.out.println("���� ���� ");
            date = sc.next();
            if (date.length() > 0) {
                break;
            } else {
                System.out.println("����� �� ������ ����,������ ");
            }
        }
        return date;
    }
            }
            



  
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 
    
    


