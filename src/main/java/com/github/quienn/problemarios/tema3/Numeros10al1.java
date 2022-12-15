package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * Mostrar los números del 10 al 1.
 **/
public class Numeros10al1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int numero = 10;
            while (numero > 0) {
                System.out.println(numero);
                numero--;
            }
        }
    }
}