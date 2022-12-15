package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo para ingresar dos palabras (A, B) y luego realiza el
 * intercambio de sus valores. Finalmente mostrar el contenido de A y de B.
 **/
public class IntercambioValores {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese la palabra A: ");
			String a = sc.nextLine();

			System.out.print("Ingrese la palabra B: ");
			String b = sc.nextLine();

			String temp = a; // variable temporal para hacer el cambio
			a = b;
			b = temp;

			System.out.println("La palabra A es: " + a);
			System.out.println("La palabra B es: " + b);
		}
	}
}
