package ua.knu.lytvynchuk.oop;
public class Car
{
	
	public Car (String id,String brand,String model,String year_of_issue,String price,String registration_number){
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year_of_issue=year_of_issue;
		this.price = price;
		this.registration_number=registration_number;
		
	
	}
	 
	
	private String id;
	private String brand;
	private String model;
	private String year_of_issue;
	private String price;
	private String registration_number;
	
	public String getModel(){
		return this.model;
	}
	public String getId(){
			return this.id;
	 } 

	public String getBrand(){
		return this.brand;
 } 
	
	public String getYear_of_issue(){
		return this.year_of_issue;
 } 
	public String getPrice(){
		return this.price;
 } 
	public String getRegistration_number(){
		return this.registration_number;
	}

	 
	 public String toString () {
		 return "Id: "+id+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"Year of issue: "+year_of_issue+"\n"+"Price: "+price+"\n"+"Registration number: "+registration_number+"\n"+"--------------------------------";
	
}

	 public static void getCarSearch(Car [] cars, int flag,
				boolean indicatorid,
				boolean brandindicator,
				boolean modelindicator,
				boolean year_of_issueindicator,
				boolean priceindicator,
				boolean registration_numbeindicator,
				String searchid, 
				String searchbrand, 
				String searchmodel, 
				String searchyear, 
				int searchprice,
				String searchregistration				
			 ) {

		 Car search = null;	    

				    for (Car car : cars) {
				        if (flag<=cars.length&
				        		(((searchid==cars[flag].getId())|(indicatorid))&
				        		((searchbrand.equals(cars[flag].getBrand()))|(brandindicator))&
				        		((searchmodel.equals(cars[flag].getModel()))|(modelindicator))& 
				        		((searchyear.equals(cars[flag].getYear_of_issue()))|(year_of_issueindicator))& 
				        		((searchprice<Integer.parseInt(cars[flag].getPrice()))|(priceindicator))& 
				        		((searchregistration==cars[flag].getRegistration_number())|(registration_numbeindicator))))
				        
				        {
				            search = car;
				            System.out.println (search);

				    }

				        flag++;}
			}
		  
				    

}
