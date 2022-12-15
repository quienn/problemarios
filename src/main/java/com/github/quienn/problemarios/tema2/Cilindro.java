package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo que calcula el volumen de un cilindro a partir de los
 * valores de su radio y altura.
 **/
public class Cilindro {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese el radio del cilindro: ");
			int radio = sc.nextInt();

			System.out.print("Ingrese la altura del cilindro: ");
			int altura = sc.nextInt();

			System.out.println("El volumen del cilindro es: " + (Math.PI * Math.pow(radio, 2) * altura));
		}
	}
}
