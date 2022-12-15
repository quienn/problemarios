package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que ingresando un numero de 5 dígitos detecte si es capicúa y
 * muestre un cartel «Es capicúa» o «No es capicúa» según el resultado.
 * 
 **/

public class EsCapicua {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un numero de 5 digitos");
            int numero = sc.nextInt();
            if (numero > 99999) {
                System.out.println("El numero ingresado es mayor a 5 digitos");
            } else {
                int d1 = numero % 10;
                int d2 = (numero / 10) % 10;
                int d4 = (numero / 1000) % 10;
                int d5 = (numero / 10000) % 10;
                if (d1 == d5 && d2 == d4) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            }
        }
    }
}