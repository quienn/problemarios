package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Realice un algoritmo que permita ingresar 10 edades de personas para luego
 * hallar y mostrar el % de gente mayor de edad (≥ 18) y el % de menores de
 * edad.
 * 
 **/

public class PorcentajeMayoresDeEdad {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int[] edades = new int[10];
            int mayores = 0;
            int menores = 0;
            for (int i = 0; i < edades.length; i++) {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                edades[i] = sc.nextInt();
                if (edades[i] >= 18) {
                    mayores++;
                } else {
                    menores++;
                }
            }
            System.out.println("El porcentaje de mayores de edad es: " + (mayores * 100) / edades.length + "%");
            System.out.println("El porcentaje de menores de edad es: " + (menores * 100) / edades.length + "%");
        }
    }
}