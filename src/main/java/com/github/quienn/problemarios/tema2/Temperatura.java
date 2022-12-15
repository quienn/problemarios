package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo que convierte y muestra la temperatura en Fahrenheit
 * ingresando la temperatura en Celsius.
 **/
public class Temperatura {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese la temperatura en Celsius: ");
			double celsius = sc.nextDouble();

			double fahrenheit = celsius * 9 / 5 + 32;
			System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
		}
	}
}