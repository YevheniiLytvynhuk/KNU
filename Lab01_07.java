package firstlab;

import java.util.Scanner;

public class Lab01_07 {

	public static void main(String[] args)
	
	    {int counter=0; //���������� ���������� ��� ����� do-while
		do{   //������� ����� do-while. �������� ���� ������������ ���� ���������� �� ������ ����� "�����"
			try {			System.out.println("�� �������� �������� ������� �������� ���� �����. ������ ����� ������ �����, ������� �� �������."+ "\n");

			Scanner in = new Scanner(System.in); // ���������� ������� ��� ������ ����� ����� �����
			System.out.print("������ ��� ������ ����� ����� �����:");
			String number = in.nextLine(); // ���������� �������� �� �����

			String aNumber[] = number.split(" "); // ��������� ������ � ����� number. ����� ��������������� ��
													// ��������� ���� ������������ �������� �� ������� ������.

			int length = aNumber.length; //�������� ������� ������
			double product = 1; //���������� ����� � ��� ���� ���������� �������
			int indexaNumber = 0;
			for (int i = 0; i < length; i++) { //���� �������� ����� ������� ������ �� �������
				double u = Double.parseDouble(aNumber[indexaNumber]);

				product = u * product;
				indexaNumber++;
			 }
			System.out.print(product+ "\n");
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


