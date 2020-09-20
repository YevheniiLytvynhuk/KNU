package firstlab;

import java.util.Formatter;
import java.util.Scanner;

public class Lab01_04 {

	public static void main(String[] args)
	
	    {int counter=0; //Оголошення індикатора для циклу do-while
		do{   //Початок циклу do-while. Програма буде виконуватись поки користувач не вибере пункт "вихід"
			try { 
				System.out.println("Конвертація з Цельсія в Фаренгейта."+ "\n");
	            Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
	            System.out.print("Введіть число градусів Цельсія C:");
	            double number = in.nextDouble(); //Зчитування введення до змінної
                double F = (double)(9*number/5+32);
                int i=(int )(F+0.5);
                System.out.println("F="+i);//Результати на консолі
				
		       }catch(Exception ex) {System.out.println("Сталася помилка. Спробуйте ще");//Цей блок спрацює при помилці та виведе повідомлення
		       }
			try {
		    Scanner i = new Scanner(System.in);//Користувач вибирає продовжити виконання чи зупинити роботу програми
            System.out.print("Бажаєте продовжити використання програми? "+ "\n"+"Так (введіть 0)\r\n" + 
            		"Ні (введіть будь-яке число відмінне від нуля)");
            counter = i.nextInt();
			 }catch(Exception ex) {};
	    }while (counter==0);}




}
