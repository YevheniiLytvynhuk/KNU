package firstlab;

import java.util.Scanner;

public class Lab02_04 {
	public static void main(String[] args) {int counterq=0; //Оголошення індикатора для циклу do-while
	do{   //Початок циклу do-while. Програма буде виконуватись поки користувач не вибере пункт "вихід"
		try {
		  System.out.println("Викреслити i-й біт з двійкового представлення натурального числа (молодші i-го біти залишаються на місці, старші зсуваються на один розряд вправо)"+ "\n");
		  int counter=0;
		  Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
	        System.out.print("Введіть два дійсних числа через пробіл:");
	        String number = in.nextLine(); //Зчитування введення до змінної

	        String aNumber[] = number.split(" "); //Створення масиву зі змінної number. Пробіл використовується як індикатор кінця попереднього елементу та початку нового.
		             String a=(Integer.toBinaryString(Integer.parseInt(aNumber[0])));
		             String b=(Integer.toBinaryString(Integer.parseInt(aNumber[1])));
		             //System.out.println(a);
		             StringBuffer stringBuffer = new StringBuffer(a);
		             stringBuffer.delete((Integer.parseInt(aNumber[1]))-1,Integer.parseInt(aNumber[1]));
		             a = stringBuffer.toString();
		             System.out.println(Integer.parseInt(a, 2));
		             //System.out.print(a);
		}catch(Exception ex) {System.out.println("Сталася помилка. Спробуйте ще");//Цей блок спрацює при помилці та виведе повідомлення
	       }
		try {
	    Scanner i = new Scanner(System.in);//Користувач вибирає продовжити виконання чи зупинити роботу програми
  System.out.print("Бажаєте продовжити використання програми? "+ "\n"+"Так (введіть 0)\r\n" + 
  		"Ні (введіть будь-яке число відмінне від нуля)");
  counterq = i.nextInt();
		 }catch(Exception ex) {};
 }while (counterq==0);}

}
