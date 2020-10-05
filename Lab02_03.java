package firstlab;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab02_03 {
	
	public static void main(String[] args) {

	    {int counterq=0; //Оголошення індикатора для циклу do-while
		do{   //Початок циклу do-while. Програма буде виконуватись поки користувач не вибере пункт "вихід"
			try {
	  System.out.println("Ця програма виводить введене число в двійковому поданні. Та показує скільки разів зустрічається \"11\""+ "\n");
	  int counter=0;
	             Scanner in = new Scanner(System.in); // Користувач вводить два дійсних числа через пробіл
	             System.out.print("Введіть ціле позитивне число:");
	             BigInteger n = in.nextBigInteger(); //Зчитування введення до змінної
	             String a = n.toString(2);
	             System.out.println(a);//Виводимо на консоль введене число в двійковому поданні
	             int lenghta=a.length();//Перевіряємо довжину строки, та присвоюємо зміній
	             int v =0;//Змінна для індекса, використовується в циклі перебору елементів строки
	             int w = 1;//Змінна для індекса, використовується в циклі перебору елементів строки
	             int t = 0;//Змінна для підрахунку кількості одинадцяток
	             for(int b=0;b<lenghta-1;b++) {//Цикл перебирає всі елементи строки,та збільшує змінну t у разі якщо кожен з сусідніх елементів =1
	            	 char by = (a.charAt(v));
	            	 counter =Character.getNumericValue(by); 
	            	 char wy = (a.charAt(w));
	            	 int counterw =Character.getNumericValue(wy);
	            	 if   (counter==1) {
	            		 if   (counterw==1) {t++;}
	            		 
	            	 }
	            	 w++;
	            	 v++;
	            	 	             }
	             System.out.println("11 в двійковому поданні введеного числа зустрічається " +t+ "разів");
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
}