package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo que muestre cada uno de los digitos de un número ingresado por
 * el usuario. Máximo permitido es de 4 dígitos. Imprimir la suma de los
 * dígitos.
 * 
 **/

public class SumaDigitosNumero {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese un número de máximo 4 dígitos");
            int numero = sc.nextInt();
            int suma = 0;
            int digito = 0;
            while (numero > 0) {
                digito = numero % 10;
                numero = numero / 10;
                suma = suma + digito;
                System.out.println(digito);
            }
            System.out.println("La suma de los dígitos es: " + suma);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}