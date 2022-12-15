package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Mostrar por pantalla la cantidad de personas mayores de edad (≥18) de un
 * total de N edades leídas desde teclado.
 * 
 **/

public class MayoresEdad {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Introduce el número de edades: ");
            int n = sc.nextInt();
            int mayores = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce la edad: ");
                int edad = sc.nextInt();
                if (edad >= 18) {
                    mayores++;
                }
            }
            System.out.println("Hay " + mayores + " mayores de edad.");
        }
    }
}