package firstlab;

import java.util.Formatter;
import java.util.Scanner;

public class Lab01_04 {

	public static void main(String[] args)
	
	    {int counter=0; //���������� ���������� ��� ����� do-while
		do{   //������� ����� do-while. �������� ���� ������������ ���� ���������� �� ������ ����� "�����"
			try { 
				System.out.println("����������� � ������ � ����������."+ "\n");
	            Scanner in = new Scanner(System.in); //���������� ������� ��� ������ ����� ����� �����
	            System.out.print("������ ����� ������� ������ C:");
	            double number = in.nextDouble(); //���������� �������� �� �����
                double F = (double)(9*number/5+32);
                int i=(int )(F+0.5);
                System.out.println("F="+i);//���������� �� ������
				
		       }catch(Exception ex) {System.out.println("������� �������. ��������� ��");//��� ���� ������� ��� ������� �� ������ �����������
		       }
			try {
		    Scanner i = new Scanner(System.in);//���������� ������ ���������� ��������� �� �������� ������ ��������
            System.out.print("������ ���������� ������������ ��������? "+ "\n"+"��� (������ 0)\r\n" + 
            		"ͳ (������ ����-��� ����� ������ �� ����)");
            counter = i.nextInt();
			 }catch(Exception ex) {};
	    }while (counter==0);}




}
