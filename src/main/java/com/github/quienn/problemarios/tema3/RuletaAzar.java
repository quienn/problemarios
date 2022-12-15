package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que genere al azar 5 números de la ruleta (del 0 al 36) y
 * muestre el % de números pares, % de impares y % de ceros generados.
 * 
 **/

public class RuletaAzar {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int num;
            int pares = 0;
            int impares = 0;
            int ceros = 0;
            for (int i = 0; i < 5; i++) {
                num = (int) (Math.random() * 37);
                System.out.println(num);
                if (num == 0) {
                    ceros++;
                } else if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Porcentaje de Pares: " + (pares * 100 / 5) + "%");
            System.out.println("Porcentaje de Impares: " + (impares * 100 / 5) + "%");
            System.out.println("Porcentaje de Ceros: " + (ceros * 100 / 5) + "%");
        }
    }
}