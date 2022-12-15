package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que muestre cada uno de los dígitos de un número ingresado por
 * el usuario. El máximo permitido es de 4 dígitos. Por ejemplo: si se ingresa
 * el número 187, entonces debe mostrar en un único cartel lo siguiente: “d1 =
 * 0, d2 = 1, d3 = 8 y d4 =7”.
 * 
 **/

public class DigitosNumero {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un numero de hasta 4 digitos");
            int numero = sc.nextInt();
            if (numero > 9999) {
                System.out.println("El numero ingresado es mayor a 4 digitos");
            } else {
                int d1 = numero % 10;
                int d2 = (numero / 10) % 10;
                int d3 = (numero / 100) % 10;
                int d4 = (numero / 1000) % 10;
                System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3 + " y d4 = " + d4);
            }
        }
    }
}