package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo que imprima el área y el perímetro de un rectángulo
 * ingresando su base y altura.
 **/
public class Rectangulo {
	public static void main() {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese la base del rectángulo: ");
			int base = sc.nextInt();

			System.out.print("Ingrese la altura del rectángulo: ");
			int altura = sc.nextInt();

			System.out.println("El área del rectángulo es: " + (base * altura));
			System.out.println("El perímetro del rectángulo es: " + (2 * (base + altura)));
		}
	}
}