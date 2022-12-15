package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que lea un número desde teclado y determine si el mismo es primo
 * o no.
 * 
 **/

public class NumeroEsPrimo {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un numero");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}