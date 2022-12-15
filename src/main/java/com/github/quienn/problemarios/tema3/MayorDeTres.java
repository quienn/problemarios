package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Ingresar tres números y mostrar el mayor de los tres.
 * 
 **/

public class MayorDeTres {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un numero");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese un numero");
            int numero2 = sc.nextInt();
            System.out.println("Ingrese un numero");
            int numero3 = sc.nextInt();
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("El numero mayor es " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("El numero mayor es " + numero2);
            } else if (numero3 > numero1 && numero3 > numero2) {
                System.out.println("El numero mayor es " + numero3);
            } else {
                System.out.println("Los numeros son iguales");
            }
        }
    }
}