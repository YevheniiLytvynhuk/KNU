package firstlab;

import java.util.Scanner;

public class Lab01_07 {

	public static void main(String[] args)
	
	    {int counter=0; //Оголошення індикатора для циклу do-while
		do{   //Початок циклу do-while. Програма буде виконуватись поки користувач не вибере пункт "вихід"
			try {			System.out.println("Ця програма підраховує добуток введених вами чисел. Введіть числа бажанні числа, розділіть їх пробілом."+ "\n");

			Scanner in = new Scanner(System.in); // Користувач вводить два дійсних числа через пробіл
			System.out.print("Введіть два дійсних числа через пробіл:");
			String number = in.nextLine(); // Зчитування введення до змінної

			String aNumber[] = number.split(" "); // Створення масиву зі змінної number. Пробіл використовується як
													// індикатор кінця попереднього елементу та початку нового.

			int length = aNumber.length; //Перевірка довжини масиву
			double product = 1; //Оголошення змінної в якій буде зберігатися добуток
			int indexaNumber = 0;
			for (int i = 0; i < length; i++) { //Цикл перебирає кожен елемент масиву по індексу
				double u = Double.parseDouble(aNumber[indexaNumber]);

				product = u * product;
				indexaNumber++;
			 }
			System.out.print(product+ "\n");
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


