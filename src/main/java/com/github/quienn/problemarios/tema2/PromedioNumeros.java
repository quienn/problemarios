package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo que, dados tres números enteros, calcula e imprime el
 * promedio entre ellos.
 **/
public class PromedioNumeros {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Introduce el primer número: ");
			int num1 = sc.nextInt();

			System.out.println("Introduce el segundo número: ");
			int num2 = sc.nextInt();

			System.out.println("Introduce el tercer número: ");
			int num3 = sc.nextInt();

			System.out.println("El promedio es: " + (num1 + num2 + num3) / 3);
		}
	}
}
