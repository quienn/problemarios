package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Ingresar 10 temperaturas por teclado y mostrar la mayor.
 * 
 **/

public class TemperaturasMayor {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int mayor = 0;
            int temperatura = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese una temperatura: ");
                temperatura = sc.nextInt();
                if (temperatura > mayor) {
                    mayor = temperatura;
                }
            }
            System.out.println("La temperatura mayor es: " + mayor);
        }
    }
}