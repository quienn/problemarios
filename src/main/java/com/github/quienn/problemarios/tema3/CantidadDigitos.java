package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * un algoritmo que permita obtener y mostrar la cantidad de dígitos de un
 * número ingresado, sabiendo que el máximo permitido es 4.
 **/
public class CantidadDigitos {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un número entero: ");
            int numero = sc.nextInt();
            if (numero >= 0 && numero <= 9999) {
                System.out.println("Cantidad de dígitos: " + String.valueOf(numero).length());
            } else {
                System.out.println("El número ingresado no es válido");
            }
        } catch (Exception e) {
            System.out.println("El número ingresado no es válido");
        }
    }
}