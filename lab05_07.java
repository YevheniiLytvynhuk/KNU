package helloworld;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class lab05_07 {public static void main(String[] args) {

		System.out.println("Ця програма знаходить число, серед введених користувачем, в якому цифри ідуть по зростанню"+ "\n");
	    Scanner in = new Scanner(System.in); //Користувач вводить два дійсних числа через пробіл
	    System.out.print("Введіть послідовність чисел через пробіл:");
	    String number = in.nextLine(); //Зчитування введення до змінної
	    //number = number +"0";
	    String aNumber[] = number.split(" "); //Створення масиву зі змінної number. Пробіл використовується як індикатор кінця попереднього елементу та початку нового.
	    int length = aNumber.length;  
	   
	    for(int indexforarray = 0;indexforarray<=length-1;indexforarray++) {
//	    	System.out.println(12);
	    	int indexforstring = 0;
	    	
	    	int similarly = 0;
	    	String a = aNumber[indexforarray];
	        int lengthforstring=a.length();
	        int lengthforstringtest = 0;
	        while(lengthforstringtest<lengthforstring-1&&Character.getNumericValue(a.charAt(indexforstring))==(Character.getNumericValue(a.charAt(indexforstring+1)))-1) {
	        	indexforstring++;
	        	lengthforstringtest++;
                similarly++;
//                System.out.println("similarly "+similarly);
//                System.out.println("lengthforstring "+ lengthforstring);
	        }
	        if(similarly==lengthforstring-1) {System.out.println(aNumber[indexforarray] );}
	        
	    }
}}