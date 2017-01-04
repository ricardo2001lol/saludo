import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Introduzca su nombre: ");
		
		String entradaTeclado = "";
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextLine();
		
		System.out.println("Hola " + entradaTeclado + ", ¿Como estas?");
	}
}
