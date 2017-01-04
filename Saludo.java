/* IMPORTANTE: TIENES QUE TENER JAVA PARA PODER EJECUTAR ESTE PROGRAMA */
import java.util.Scanner;

// Saluda al nombre que ingresa el usuario
public class Saludo
{
	public static void main(String[] args)
	{
		System.out.println("Introduzca su nombre: ");// Se piden los datos ql usuario
		
		String entradaTeclado = "";// Definimos donde se guardaran los datos ingresados
		Scanner entradaEscaner = new Scanner (System.in);// Se define el scanner para recibir datos
		entradaTeclado = entradaEscaner.nextLine();// Esta linea recibe datos al usuario
		
		System.out.println("Hola " + entradaTeclado + ", ¿Como estas?");// Saluda al nombre asignado
	}
}// Se cierra la clase principal
