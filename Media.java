
public class Media {
	public static void main (String [] args) {
	
	int contador = 0;
	int num = 0;
	int suma = 0;
	
	System.out.println ("Voy a calcular la media de los números que me digas");
	
	do {
		System.out.println ("Dime un número");
		
		suma = suma + num;
		
		contador++;
		
		num = Integer.parseInt (System.console().readLine());
		
		} while (num > 0);
		
		System.out.println ("La media es " + (suma / contador));
	}
	
}
