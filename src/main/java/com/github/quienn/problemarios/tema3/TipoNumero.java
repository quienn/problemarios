package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que indique con carteles si el número ingresado es negativo,
 * positivo o nulo.
 * 
 **/

public class TipoNumero {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un número");
            int numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("El número es nulo");
            } else if (numero > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }
        }
    }
}