	import java.util.Scanner;
	
public class Bus {
	
	
	    public static void main(String[] args) {
	    	
	 
	            Scanner input = new Scanner(System.in);
	            
	            int nPersonas = 0;
	            int nAutobuses = 0;
	            int nFurgonetas = 0;
	            final int CAPACIDAD_BUS = 45;
	            
	            System.out.print("Ingrese el número de personas que se apuntaron para el viaje: ");
	            nPersonas = input.nextInt();
	            
	            if (nPersonas % CAPACIDAD_BUS == 0) {
	                nAutobuses = nPersonas / CAPACIDAD_BUS;
	            } else {
	                nAutobuses = nPersonas / CAPACIDAD_BUS + 1;
	            }
	            
	            nFurgonetas = nPersonas - nAutobuses * CAPACIDAD_BUS;
	            
	            System.out.println( + nAutobuses + " autobuses.");
	            System.out.println(+ nFurgonetas + " personas tendrán que viajaran en furgonetas.");
	        }
	    }
	   








