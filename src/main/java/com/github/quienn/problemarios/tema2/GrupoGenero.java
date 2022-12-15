package com.github.quienn.problemarios.tema2;

import java.util.Scanner;

/**
 * Un algoritmo para calcular el porcentaje de hombres y de mujeres
 * que hay en un grupo, dados los totales de hombres y de mujeres.
 **/
public class GrupoGenero {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Ingrese el total de hombres: ");
			int hombres = sc.nextInt();

			System.out.print("Ingrese el total de mujeres: ");
			int mujeres = sc.nextInt();

			double porcentajeHombres = hombres * 100.0 / (hombres + mujeres);
			double porcentajeMujeres = 100 - porcentajeHombres;

			System.out.println("El porcentaje de hombres es: " + porcentajeHombres);
			System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres);
		}
	}
}