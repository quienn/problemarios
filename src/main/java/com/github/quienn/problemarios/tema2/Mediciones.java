package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo que convierte y muestra un valor ingresado en
 * centímetros a yardas, metros, pies y pulgadas.
 **/
public class Mediciones {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese el valor en centímetros: ");
			int centimetros = sc.nextInt();

			System.out.println("El valor en yardas es: " + (centimetros / 91.44));
			System.out.println("El valor en metros es: " + (centimetros / 100));
			System.out.println("El valor en pies es: " + (centimetros / 30.48));
			System.out.println("El valor en pulgadas es: " + (centimetros / 2.54));
		}
	}
}