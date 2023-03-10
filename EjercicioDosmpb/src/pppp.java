import java.util.Scanner;
public class pppp {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		double base, lado;
		int nTriangulo;
		
		System.out.print("dijite el numero de triangulos");

		nTriangulo =entrada.nextInt();
		Triangulo triangulo[] = new Triangulo[nTriangulo];
		

		for (int i=0;i<triangulo.length;i++) {
			System.out.print("\nDigite los valores para el triangulo"+(i+1)+":");
			System.out.print("intruduzca la base: ");
			base = entrada.nextDouble();
			System.out.println("introduzca el lado");
			lado = entrada.nextDouble();
			
			triangulo[i] =new Triangulo(lado,base);
			
			System.out.print("\nEl perimetro del triangulo es: "+triangulo[i].obtenerPerimetro());
			System.out.print("el area deltriangulo es "+triangulo[i].obtenerArea());
			
			
			
		}
		
	}
}
