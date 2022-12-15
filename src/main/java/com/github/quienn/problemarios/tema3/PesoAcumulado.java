package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * Se desea conocer el peso acumulado de 10 personas.
 **/

public class PesoAcumulado {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int pesoAcumulado = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Introduce el peso de la persona " + i + ":");
                pesoAcumulado += sc.nextInt();
            }
            System.out.println("El peso acumulado es: " + pesoAcumulado);

            // ahora son 100 personas
            pesoAcumulado = 0;
            for (int i = 1; i <= 100; i++) {
                System.out.println("Introduce el peso de la persona " + i + ":");
                pesoAcumulado += sc.nextInt();
            }
            System.out.println("El peso acumulado es: " + pesoAcumulado);
        }
    }
}