package uits.jv1601.lessons.oop1;

import java.util.*; 
import java.util.Random; 
public class PhrasesGenerator { 
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Random r = new Random(); 
        String[] s1 = {"������� ������!" , "� ������ ������� " , "������ ������� ", 
        "�� �������, ������, �������� � ���, ��� ", "����� �������, ", 
        "������������ �������� ����������, ��� ", "���������� ���� ������� ��������� ��������, ��� ", 
        "������������� � ������� ���� ","������ �����������, � ����������� �� ", 
        "����������� ������� �������, � ����� "}; 

        String[] s2 = {"���������� ���������� �������� �������","����� � ����� �������� ������ ", 
        "���������� �������������� ���� � ����� ����� ���������� ����������� ��������� ����������� ", 
        "����� ������ ","��������������� ������������","���������� �������� ��������� ���� ������������ ", 
        "���������� �������������-���������������� ����������� ����� ������������ ", 
        "���������� � �������� ���������","������������ � ������� ������� ", 
        " ������ ������������ ������ �� ������������ ������� "}; 

        String[] s3 = {"������ ������ ���� � ������������ ", "������� �� ��� ������� ", "������� ����������� � ���������", 
        "������������ ���������� � ���������� ", "������������ �������� ����� ������������ ������� � ������������ ", 
        "��������� ���������","��������� ������� �� ���������� ","� ������������ ������� ������������� �������� ", 
        "��������� ������� �������� ","������������ ����� ���������� ����������� �������� ", 
        "������ �� ����� ������� ��������� � ������������"}; 

        String s4 [ ] = {"������������ ���������� � ���������������� �������","���������� ����������� ��������", 
        "������� ��������� �������","�������, ���������� ����������� � ��������� ������������ �����","����� �����������", 
        "����������� �������������� ��������","������� �������� ������ " + 
        "��������������� �������� ������������","c�������������� ������� ����������� ","������ �������� ","���� �����������"}; 

        System.out.println("Choose ki-vo predlogeniy"); 
        int rows = sc.nextInt();
        int current = 0;
        while(current < rows){
            
            int b6 = r.nextInt(10); 
            int b7 = r.nextInt(10); 
            int b8 = r.nextInt(10); 
            int b9 = r.nextInt(10);
            System.out.println(s1[b6] +" "+ s2[b7]+" "+s3[b8]+" "+s4[b9]);
            
            current++;
            

        }
    }
}
	
