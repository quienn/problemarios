package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que imprima con un cartel el número de docena («primera»,
 * «segunda» o «tercera») dado el resultado de una jugada de ruleta (del 0 al
 * 36). Utilizar el operador lógico and.
 * 
 **/

public class DocenaRuleta {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un numero de 0 a 36");
            int numero = sc.nextInt();
            if (!(numero < 0) && !(numero > 36)) {
                if (numero <= 12) {
                    System.out.println("La docena es primera");
                } else if (numero <= 24) {
                    System.out.println("La docena es segunda");
                } else {
                    System.out.println("La docena es tercera");
                }
            } else {
                System.out.println("El numero ingresado no es valido");
            }
        }
    }
}