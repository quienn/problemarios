package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que genere números al azar múltiplos de 5, mientras el usuario
 * no ingresa la opción ‘S’ (Salir).
 * 
 **/
public class NumerosAzarS {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            String opcion = "";
            while (!opcion.equals("S")) {
                int numero = (int) (Math.random() * 1000);
                do {
                    numero = (int) (Math.random() * 1000);
                } while (numero % 5 != 0);
                System.out.println(numero);
                System.out.println("Escriba S para salir y C para continuar.");
                opcion = sc.next();
            }
        }
    }
}