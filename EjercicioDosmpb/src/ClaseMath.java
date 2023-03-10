import static java.lang.Math.*;
public class ClaseMath {

	public static void main(String[]args) {
		
	double x = 10;
	double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
	System.out.println("El resultado de a es: "+a);
	
	
	double y = 2;
	double b = Math.pow(x, y) - Math.pow(6, x);
	System.out.println("El resultado de b es: "+b); 
	
	

	double z = 1; 
	double c = (4 * Math.cos(z)) / 5 - Math.sin(Math.pow(x, 2));
	System.out.println("El resultado de c es: "+c); 
	
	

	double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
	System.out.println("El resultado de d es: "+d); 
	
	

	double e = 1 / (y - 1) / (x - Math.pow(2, y)); 
	System.out.println("El resultado de e es: "+e); 
	
	   
	        double f = 7 * (cos(sqrt(5) - sin(sqrt(3) * x - 4)));
	        System.out.println("El resultado de f es: " + f);
	    }
}
	
	