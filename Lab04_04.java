package firstlab;

import java.util.Scanner;

public class Lab04_04 {
	public static void main(String[] args)
	
    {
		System.out.println("Ця програма підраховує кількість змін знаку у введеній послідовності"+ "\n");
        Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
        System.out.print("Введіть послідовність цілих чисел, розділіть комою:");
        String number = in.nextLine(); //Зчитування введення до змінної

        String aNumber[] = number.split(","); //Створення масиву зі змінної number. Пробіл використовується як індикатор кінця попереднього елементу та початку нового.
        //int length = aNumber.length;   
        System.out.println(length);
        int v =0;//Змінна для індекса, використовується в циклі перебору елементів строки
        int w = 1;//Змінна для індекса, використовується в циклі перебору елементів строки
        int t = 0;//Змінна для підрахунку кількості одинадцяток
        for(int a=0;a<length-1; a++) {
        	if(((Integer.parseInt(aNumber[v])==0)||(Integer.parseInt(aNumber[w])==0))) {break;}
        	if(((Integer.parseInt(aNumber[v])<0)^(Integer.parseInt(aNumber[w])<0))) {t++;}
        	
        	
        	v++;
        	w++;
        }
        System.out.println("У послідовності знак змінюється"+t+"разів");
       
}
}