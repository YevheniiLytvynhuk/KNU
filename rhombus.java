import java.util.ArrayList;
import java.util.Collections;

public class rhombus extends quadrilateral implements Comparable<rhombus>{
	public rhombus(double AB, double BC, double CD, double DA, double AC, double DB, double a, double b, double c,
		double d,double area) {
	super(AB, BC, CD, DA, AC, DB, a, b, c, d);
	// TODO Auto-generated constructor stub		this.AB = AB;
	this.BC = BC;
	this.CD = CD;
	this.DA=DA;
	this.AC = AC;
	this.DB=DB;
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	this.area=area;
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
private double area;

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
public double getarea(){
	return this.area;
}
 





 public String toString () {
	 return "Id: "+area;}
//	 public Object getArbitrary1(){
//			return Arbitrary1[0];
//}
 static ArrayList rhombus  = new ArrayList();
 
 {
	  Collections.sort(rhombus);

	  }

	  public int compareTo(rhombus anothersquare)
	    {
	        if (this.area == anothersquare.area) {
	            return 0;
	        } else if (this.area > anothersquare.area) {
	            return -1;
	        } else {
	            return 1;
	        }
	    }
	  
}	