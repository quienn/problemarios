package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * un algoritmo que calcule si dos números son divisibles. Para ello, se
 * piden un primer número y un segundo número, entonces mostrar un cartel
 * que diga “es divisible” si el segundo número es
 * divisible al primero.
 **/
public class NumerosDivisibles {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese un número: ");
			int num1 = sc.nextInt();
			System.out.print("Ingrese otro número: ");
			int num2 = sc.nextInt();
			if (num1 % num2 == 0) {
				System.out.println("Es divisible");
			} else {
				System.out.println("No es divisible");
			}
		}
	}
}
