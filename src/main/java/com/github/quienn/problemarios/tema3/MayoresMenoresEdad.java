package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Mostrar por pantalla la cantidad de mujeres mayores de edad y la cantidad de
 * hombres menores de edad de un total de N edades y sexo leídos desde teclado.
 * 
 **/

public class MayoresMenoresEdad {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Introduce el número de edades a introducir: ");
            int n = sc.nextInt();
            int mayores = 0;
            int menores = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce la edad: ");
                int edad = sc.nextInt();
                System.out.print("Introduce el sexo (M o H): ");
                String sexo = sc.next();
                if (sexo.equals("M")) {
                    if (edad >= 18) {
                        mayores++;
                    }
                } else if (edad < 18) {
                    menores++;
                }
            }
            System.out.println("Hay " + mayores + " mujeres mayores de edad.");
            System.out.println("Hay " + menores + " hombres menores de edad.");
        }
    }
}