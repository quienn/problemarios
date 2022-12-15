package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * Se leen desde teclado números hasta que la suma de los mismos llegue a 1000.
 * Mientras tanto debe hallar:
 * a. La cantidad de números múltiplos de 6.
 * b. La suma de los números que se encuentran entre el 1 y el 10 (incluidos).
 **/

public class SumaNumerosTeclado {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int suma = 0;
            int multiplos6 = 0;
            int suma1a10 = 0;
            int numero = 0;
            do {
                System.out.print("Ingrese un número: ");
                numero = sc.nextInt();
                suma += numero;
                if (numero % 6 == 0) {
                    multiplos6++;
                }
                if (numero >= 1 && numero <= 10) {
                    suma1a10 += numero;
                }
            } while (suma < 1000);
            System.out.println("La cantidad de números múltiplos de 6 es: " + multiplos6);
            System.out.println("La suma de los números entre 1 y 10 es: " + suma1a10);
        }
    }
}