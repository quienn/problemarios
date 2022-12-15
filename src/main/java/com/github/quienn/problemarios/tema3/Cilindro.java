package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * un algoritmo que calcule el volumen de un cilindro dados su radio y
 * altura (primero el programa deberá verificar si son positivas).
 **/
public class Cilindro {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Introduce el radio: ");
			double radio = sc.nextDouble();
			System.out.print("Introduce la altura: ");
			double altura = sc.nextDouble();
			if (radio > 0 && altura > 0) {
				double volumen = Math.PI * Math.pow(radio, 2) * altura;
				System.out.println("El volumen es: " + volumen);
			} else {
				System.out.println("El radio y la altura deben ser positivos");
			}
		}
	}
}