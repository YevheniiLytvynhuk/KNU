package firstlab;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Lab01_03 {

	public static void main(String[] args)
	
	    {int counter=0; //���������� ���������� ��� ����� do-while
		do{   //������� ����� do-while. �������� ���� ������������ ���� ���������� �� ������ ����� "�����"
			try { //������� ����� ������� ���������. ��� ��������� ���������� �������� ��������� ��� ������� �� ��������� ����� ��� ����������� ������ � �������
			System.out.println("�� �������� �������� ������ ����������� ���� ������ �����"+ "\n");
            Scanner in = new Scanner(System.in); //���������� ������� ��� ������ ����� ����� �����
            System.out.print("������ ��� ������ ����� ����� �����:");
            String number = in.nextLine(); //���������� �������� �� �����

            String aNumber[] = number.split(" "); //��������� ������ � ����� number. ����� ��������������� �� ��������� ���� ������������ �������� �� ������� ������.
            int u = Integer.parseInt(aNumber[0]); //��������� ����� � ���� ���������� ������� ������ �� �������
            int r = Integer.parseInt(aNumber[1]); //��������� ����� � ���� ���������� ������� ������ �� �������
            double log= (((Math.log10(u)+Math.log10(r))/2));//������ ����������� ���������
            double Result=Math.pow(10,log);//������������
            System.out.println("� ����������� ������������:"+ "\n" + Result);//���������� �� ������
            System.out.println("� ��������� ������������:");
            Formatter frm = new Formatter();
            System.out.println(frm.format("%3.2e",Result));//���������� �� ������
            
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
