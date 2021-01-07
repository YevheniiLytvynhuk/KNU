package ua.knu.lytvynchuk.oop;
import java.util.*;
public class Main {
	

	static String doThis (){
		   System.out.println("Введіть марку автомобіля");
			Scanner brand = new Scanner(System.in); //Користувач 
	  String searchbrand1 = brand.nextLine(); //Зчитування введення до змінної
	  
	  return searchbrand1;
	}  
//	static String searchbrand = doThis ();
	static String doThisyear (){
		   System.out.println("Введіть year автомобіля");
			Scanner year = new Scanner(System.in); //Користувач 
	  String year1 = year.nextLine(); //Зчитування введення до змінної
	  
	  return year1;
	}  
	static String doThismodel (){
		   System.out.println("Введіть model автомобіля");
			Scanner model = new Scanner(System.in); //Користувач 
	  String model1 = model.nextLine(); //Зчитування введення до змінної
	  
	  return model1;
	}  
	static String doThisprice (){
		   System.out.println("Введіть price автомобіля");
			Scanner price = new Scanner(System.in); //Користувач 
	  String price1 = price.nextLine(); //Зчитування введення до змінної
	  
	  return price1;
	}  
public static void main(String[] args) {
		int flag = 0;
	Car[] cars = new Car[52];
		   cars[0] =   new Car("1211","Land Rover","Defender","2008","19999","AA1212AA");
		   cars[1] =   new Car("3452234","ZAZ","965","1968","400","AA1212AA");
		   cars[2] =   new Car("2346563","BMW","321","1948","10000","AA1212AA");
		   cars[3] =   new Car("24546575","ZAZ","965","1965","850","AA1012AA");
		   cars[4] =   new Car("5686796","Volvo","XC90","2021","67330","AA1012AA");
		   cars[5] =   new Car("2452352","Toyota","Mark 2","1990","4500","AA1012AA");
		   cars[6] =   new Car("23585","Opel","Vectra A","1995","3700","AA1012AA");
		   cars[7] =   new Car("345245","Volkswagen","Kafet","1971","9000","AA1012AA");
		   cars[8] =   new Car("245634573","Mercedes","V-Class 300d","2020","216349","AA1012AA");
		   cars[9] =   new Car("356456345","Mercedes","S320","1992","6000","AA1012AA");
		   cars[10] =   new Car("3465357","Ford","Sierra","1986","2600","AA1012AA");
		   cars[11] =   new Car("5673673","Toyota","RAV4","1997","6300","AA1012AA");
		   cars[12] =   new Car("67567865","Alfa Romeo","33","1992","1000","AA1012AA");
		   cars[13] =   new Car("56796756","Land Rover","Defender","2010","23999","AA2545AA");
		   cars[14] =   new Car("3563779","ZAZ","965","1967","424","AA2862AA");
		   cars[15] =   new Car("069806","BMW","321","1949","17000","BG5670RF");
		   cars[16] =   new Car("Ц4576796","ZAZ","965","1969","980","AA1657AA");
		   cars[17] =   new Car("4567","Mercedes","EQC 400T","2021","122684","AA5413ЛA");
		   cars[18] =   new Car("46574789","Toyota","Mark 2","1992","4570","AA7634AA");
		   cars[19] =   new Car("80678","Opel","Vectra A","1995","3700","AA6425AA");
		   cars[20] =   new Car("5784784","Volkswagen","Kafet","1971","9000","AA6433AA");
		   cars[21] =   new Car("485784","Mercedes","V-Class 300d","2020","216349","AA8759AA");
		   cars[22] =   new Car("468478","Mercedes","S320","1992","6000","AA7434AA");
		   cars[23] =   new Car("76347","Ford","Sierra","1986","2600","AA8745AA");
		   cars[24] =   new Car("24545","Toyota","RAV4","1997","6300","AA9865AA");
		   cars[25] =   new Car("1341413","Alfa Romeo","33","1992","1000","AA5439AA");
		   cars[26] =   new Car("134135","Land Rover","Defender","2008","19999","AA7456AA");
		   cars[27] =   new Car("1354135","ZAZ","965","1968","400","AA9086AA");
		   cars[28] =   new Car("5114353","BMW","321","1948","10000","AA8654AA");
		   cars[29] =   new Car("11624536","ZAZ","965","1965","850","AA4567AA");
		   cars[30] =   new Car("5473448","Tesla","Model X","2021","125000","AA9854AA");
		   cars[31] =   new Car("56978079","Toyota","Mark 2","1990","4500","AA4380AA");
		   cars[32] =   new Car("606907","Opel","Vectra A","1995","3700","AП5647AA");
		   cars[33] =   new Car("67909-","Volkswagen","Kafet","1971","9000","AA9673AA");
		   cars[34] =   new Car("46576","Mercedes","V-Class 300d","2020","216349","AA8464AA");
		   cars[35] =   new Car("367356","Mercedes","S320","1992","6000","AA84628AA");
		   cars[36] =   new Car("265536","Ford","Sierra","1986","2600","AA94648AA");
		   cars[37] =   new Car("26236423","Toyota","RAV4","1997","6300","AA84648НР");
		   cars[38] =   new Car("264246","Alfa Romeo","33","1992","1000","AA484647РП");
		   cars[39] =   new Car("526456808","Land Rover","Defender","2008","19999","AA847649РА");
		   cars[40] =   new Car("06790687","ZAZ","965","1968","400","AA94047ОП");
		   cars[41] =   new Car("670678","BMW","321","1948","10000","AA93748ОП");
		   cars[42] =   new Car("69709","ZAZ","965","1965","850","AA94848ОА");
		   cars[43] =   new Car("245245","Audi","e-tron 95kWh","2021","110415","AA84849РМ");
		   cars[44] =   new Car("6836573","Toyota","Mark 2","1990","4500","AA84748АР");
		   cars[45] =   new Car("89597567","Porshe","Taycan Turbo S","2021","269907","AA04849ОМ");
		   cars[46] =   new Car("670859","Volkswagen","Kafet","1971","9000","AA8494ИМ");
		   cars[47] =   new Car("957835","Mercedes","V-Class 300d","2020","216349","AA93885РП");
		   cars[48] =   new Car("256262","Mercedes","S320","1992","6000","AA84937ММ");
		   cars[49] =   new Car("224524","Ford","Sierra","1986","2600","AA83484РП");
		   cars[50] =   new Car("2462466","Toyota","RAV4","1997","6300","AA8484Р");
		   cars[51] =   new Car("754756","Alfa Romeo","33","1992","1000","AA8474ТИ");
		   
		   System.out.println("Menu"+ "\n"+"1.Вивести список автомобілів заданої марки"+ "\n"
			       +"2.Вивести список автомобілів певної моделі та строку експлуатації"+ "\n"
			        +"3.Вивести список авто конкретного року, ціна яких перевищує задану суму"+ "\n");
		          Scanner in = new Scanner(System.in); //Користувач 
		          String number = in.nextLine(); //Зчитування введення до змінної
		          switch(number) {
		                     case("1"):
		                        String searchbrand = doThis ();
                                Car.getCarSearch(cars,0,
		                                  			true,
		                                			false,
		                                			true,
		                                			true,
		                                			true,
		                                  			true,
		                                  			"",
		                                  			searchbrand,
		                                  			"",
		                                 			"",
		                                  			0,
		                                 			""); {}
		                         break;
		                     case("2"):
		                                 System.out.print("2");
		                                String searchmodel = doThismodel ();
		                                String searchyear = String.valueOf(2021-(Integer.parseInt(doThisyear ())));
		                                 Car.getCarSearch(cars,0,
		                                  			true,
		                                  			true,
		                                			false,
		                                			false,
		                                			true,
		                                  			true,
		                                  			"",
		                                  			"",
		                                  			searchmodel,
		                                  			searchyear,
		                                  			0,
		                                 			""); {}
		                         break;
		                        case("3"):
		                                 System.out.print("3");
		                                     int searchprice = Integer.parseInt(doThisprice ());
			                                 searchyear = doThisyear ();
			                                 Car.getCarSearch(cars,0,
			                                  			true,
			                                  			true,
			                                			true,
			                                			false,
			                                			false,
			                                  			true,
			                                  			"",
			                                  			"",
			                                  			"",
			                                  			searchyear,
			                                  			searchprice,
			                                 			""); {}
			                         break;
		                        case("4"):
		                                 System.out.print("4");
		                                  break;
		}


}  }