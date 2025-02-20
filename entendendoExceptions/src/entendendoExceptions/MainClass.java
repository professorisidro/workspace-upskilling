package entendendoExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int a, b, r;
			System.out.print("Digite um valor:");
			a = teclado.nextInt();
			System.out.print("Digite outro valor:");

			b = teclado.nextInt();

			r = a / b;
			System.out.println("Resultado = " + r);
			teclado.close();
		} catch (InputMismatchException e) {
			System.out.println("é pra digitar numer inteiroooooo!!!!");
		} catch (ArithmeticException e) {
			System.out.println("é pra digitar um denominador diferente de zeroooooo!!");
		} catch  (Exception e) {
			System.out.println("erro desconhecido - contate o administrador");
		}
		
	}
}
