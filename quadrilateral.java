import java.util.HashMap;
import java.util.Map;

import ua.knu.lytvynchuk.oop.Car;

public class quadrilateral{
	
	 public String toString () {
		 return "Id: ";
	
}


	
	public quadrilateral (double AB,double BC,double CD,double DA,double AC,double DB,double a,double b,double c,double d){
		this.AB = AB;
		this.BC = BC;
		this.CD = CD;
		this.DA = DA;
		this.AC = AC;
		this.DB = DB;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	 
	
	private double AB; //storona
	private double BC; //storona
	private double CD; //storona
	private double DA; //storona
	private double AC; //diagonal
	private double DB; //diagonal
	private double a;
	private double b;
	private double c;
	private double d;

	public double getAB(){
		return this.AB;
	}
	public double getBC(){
			return this.BC;
	 } 

	public double getCD(){
		return this.CD;
 } 
	
	public double getDA(){
		return this.DA;
 } 
	public double getAC(){
		return this.AC;
 } 
	public double getDB(){
		return this.DB;
	}

	public double geta(){
		return this.a;
	}
	public double getb(){
		return this.b;
	}
	public double getc(){
		return this.c;
	}
	public double getd(){
		return this.d;
	}
	 


	 public static double getArea(quadrilateral [] quadrilaterals ,double AB,double BC,double CD,double DA,double AC,double DB,double a,double b,double c,double d ) {
		 double p =(AB+BC+CD+DA)/2;

		 double area = Math.pow(((p-AB)*(p-BC)*(p-CD)*(p-DA)-0.25*(AB*CD+BC*DA+AC*DB)*(AB*CD+BC*DA-AC*DB)),0.5);
		return area;
			}
		  

	 public static void getPerimeter( ) {



			}
	 public static void sorting_of_figures (quadrilateral [] quadrilaterals){
		 int flag=0;
		  for (quadrilateral quadrilateral : quadrilaterals) {


     
     double whot1 = (Math.pow(quadrilaterals[flag].AC,2)*Math.pow(quadrilaterals[flag].DB,2));
     double whot2 = (Math.pow(quadrilaterals[flag].AB,2)*Math.pow(quadrilaterals[flag].CD,2))+(Math.pow(quadrilaterals[flag].BC,2)*Math.pow(quadrilaterals[flag].DA,2))-(2*quadrilaterals[flag].AB*quadrilaterals[flag].BC*quadrilaterals[flag].CD*quadrilaterals[flag].DA* Math.cos(Math.toRadians(quadrilaterals[flag].a+quadrilaterals[flag].c)));
     double whot3 = (Math.pow(quadrilaterals[flag].AB,2)*Math.pow(quadrilaterals[flag].CD,2))+(Math.pow(quadrilaterals[flag].BC,2)*Math.pow(quadrilaterals[flag].DA,2))-(2*quadrilaterals[flag].AB*quadrilaterals[flag].BC*quadrilaterals[flag].CD*quadrilaterals[flag].DA* Math.cos(Math.toRadians(quadrilaterals[flag].b+quadrilaterals[flag].d)));
     boolean whot = (Math.abs (whot1-whot2)<= 0.001f);
     boolean whotplus = (Math.abs (whot1-whot3)<= 0.001f);

if(whot==true&whotplus==true){

		if(quadrilaterals[flag].a==90&quadrilaterals[flag].b==90&quadrilaterals[flag].c==90&quadrilaterals[flag].d==90&quadrilaterals[flag].AB==quadrilaterals[flag].CD&quadrilaterals[flag].BC==quadrilaterals[flag].DA& (quadrilaterals[flag].AC==quadrilaterals[flag].DB)) {
			if((quadrilaterals[flag].AB==quadrilaterals[flag].BC) &(quadrilaterals[flag].AB==quadrilaterals[flag].CD) & (quadrilaterals[flag].AB==quadrilaterals[flag].DA)& (quadrilaterals[flag].AC==quadrilaterals[flag].DB)) {
				double area = getArea(quadrilaterals, quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d); 
				square.square.add( new square(quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d,area));//romb

			}
			else{
			double area = getArea(quadrilaterals, quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d); 
			 Rectangle.Rectangle.add( new Rectangle(quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d,area));//romb

			}
		}
		else {if (Math.abs((Math.pow(quadrilaterals[flag].AC,2))+(Math.pow(quadrilaterals[flag].DB,2))-4*(Math.pow(quadrilaterals[flag].AB,2))) <= 0.001f) {
			double area = getArea(quadrilaterals, quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d); 
			rhombus.rhombus.add( new Rectangle(quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d,area));//romb

		    	
		}
		        else {
				double area = getArea(quadrilaterals, quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d); 
				
				Arbitrary.Arbitrary.add (new Arbitrary(quadrilaterals[flag].AB, quadrilaterals[flag].BC, quadrilaterals[flag].CD, quadrilaterals[flag].DA, quadrilaterals[flag].AC, quadrilaterals[flag].DB, quadrilaterals[flag].a, quadrilaterals[flag].b, quadrilaterals[flag].c, quadrilaterals[flag].d, area));//romb

		        }
		    }
}

if (flag<quadrilaterals.length) {flag++;}

}
	 }
	
}

