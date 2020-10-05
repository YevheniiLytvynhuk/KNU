package firstlab;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Lab05_03 {public static void main(String[] args)
	
{
	System.out.println("Ця програма запитує ряд цілих чисел та виводить число, яке повторюється найбільшу кількість разів підряд та скільки саме разів"+ "\n");
    Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
    System.out.print("Введіть послідовність, розділіть числа пробілом:");
    String number = in.nextLine(); //Зчитування введення до змінної
    //number = number +"0";
    String aNumber[] = number.split(" "); //Створення масиву зі змінної number. Пробіл використовується як індикатор кінця попереднього елементу та початку нового.
    int length = aNumber.length;   
    //int v =0;//Змінна для індекса, використовується в циклі перебору елементів строки
    int w = 1;//Змінна для індекса, використовується в циклі перебору елементів строки
    int t = 1;//Змінна для підрахунку кількості одинадцяток
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int v=0;w<=length-1;) {
    	if(Integer.parseInt(aNumber[v])==Integer.parseInt(aNumber[w])) {
    		while((w<=length-1&&Integer.parseInt(aNumber[v])==Integer.parseInt(aNumber[w]))) {
    			++t;
    			map.put(t,Integer.parseInt(aNumber[v]));
    			v++;
    			w++;}
    		}else{v++;
			w++;
			t=1;}
    	}
    Collection ver=map.keySet();
    int cer = (int) (Collections.max(ver));
 System.out.println("Longest run:"+cer+" consecutive "+map.get(cer)+"s");

    }

}