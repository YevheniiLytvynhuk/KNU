package firstlab;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Lab01_03 {

	public static void main(String[] args)
	
	    {int counter=0; //Оголошення індикатора для циклу do-while
		do{   //Початок циклу do-while. Програма буде виконуватись поки користувач не вибере пункт "вихід"
			try { //Початок блоку обробки виключень. При спрацювані виключення програма повідомить про помилку та запропонує вихід або продовження роботи з початку
			System.out.println("Ця програма підраховує середнє геометричне двох дійсних чисел"+ "\n");
            Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
            System.out.print("Введіть два дійсних числа через пробіл:");
            String number = in.nextLine(); //Зчитування введення до змінної

            String aNumber[] = number.split(" "); //Створення масиву зі змінної number. Пробіл використовується як індикатор кінця попереднього елементу та початку нового.
            int u = Integer.parseInt(aNumber[0]); //Створення змінної в який передається елемент масиву по індексу
            int r = Integer.parseInt(aNumber[1]); //Створення змінної в який передається елемент масиву по індексу
            double log= (((Math.log10(u)+Math.log10(r))/2));//Середнє арифметичне логарифмів
            double Result=Math.pow(10,log);//Антилогарифм
            System.out.println("В десятковому представленні:"+ "\n" + Result);//Результати на консолі
            System.out.println("В науковому представленні:");
            Formatter frm = new Formatter();
            System.out.println(frm.format("%3.2e",Result));//Результати на консолі
            
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
