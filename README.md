# Average with java :eyes:

This is a simple programe which calculate the **average** done with **Java** programming language

## Source code

This is the source code of the program:

```java
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
```

It calculates the average of the numbers that you enter with the keyboard

## Compile program

To compile it you need to type the following sentence:

```console
javac Media.java
```

## Execute the program

To execute the program type this:

```console
java Media.java
```
