package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que imprima con un cartel «Correcto» según el siguiente caso: si
 * el numero N es múltiplo de 5 y se encuentra entre los 25 primeros números. N
 * debe ser obtenido aleatoriamente entre números del 1 al 1000. Primero debe
 * mostrar N.
 * 
 **/
public class MultiploCorrecto {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int n = (int) (Math.random() * 1000 + 1);
            System.out.println("N: " + n);
            if (n % 5 == 0 && n <= 25) {
                System.out.println("Correcto");
            }
        }
    }
}