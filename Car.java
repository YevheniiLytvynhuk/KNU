package oop;

import ua.knu.lytvynchuk.oop.Car;

public class Car {
	Car (String id,String brand,String model,String year_of_issue,String price,String registration_number){
		public String Id = id;
		String Brand = brand;
		String Model = model;
		year_of_issue=year_of_issue;
		String Price = price;
		registration_number=registration_number;
		
		Car[] cars = new Car[1];
		cars [0] = new Car(Id="1212", brand="audi", model="TT", year_of_issue="1992", Price="12000", registration_number="AA1212AA");
	}
	
}
