package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Se ingresan 10 números cuyos valores corresponden a los de la ruleta
 * (0,1,2,…,36), se pide hallar y mostrar por pantalla lo siguiente:
 * a. Cantidad de números impares.
 * b. Promedio de los números pares (no contar los ceros).
 * c. Cantidad de números que se encuentran en la 2º docena (13 al 24).
 * d. El número más grande.
 **/

public class NumerosRuletaCantidadPromedio {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int numero;
            int cantidadImpares = 0;
            int cantidadPares = 0;
            int cantidadSegundaDocena = 0;
            int sumaPares = 0;
            int numeroMayor = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese un numero:");
                numero = sc.nextInt();
                if (numero % 2 != 0) {
                    cantidadImpares++;
                } else if (numero != 0) {
                    cantidadPares++;
                    sumaPares += numero;
                }

                if (numero >= 13 && numero <= 24) {
                    cantidadSegundaDocena++;
                }
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }
            }
            System.out.println("Cantidad de numeros impares: " + cantidadImpares);
            System.out.println("Promedio de numeros pares: " + (sumaPares / cantidadPares));
            System.out.println("Cantidad de numeros en la segunda docena: " + cantidadSegundaDocena);
            System.out.println("Numero mayor: " + numeroMayor);

            // en lugar de leer 10 números, ahora se leen números hasta que llega el valor
            // 36?
            numero = 0;
            cantidadImpares = 0;
            cantidadPares = 0;
            cantidadSegundaDocena = 0;
            sumaPares = 0;
            numeroMayor = 0;
            while (numero != 36) {
                System.out.println("Ingrese un numero:");
                numero = sc.nextInt();
                if (numero % 2 != 0) {
                    cantidadImpares++;
                } else if (numero != 0) {
                    cantidadPares++;
                    sumaPares += numero;
                }

                if (numero >= 13 && numero <= 24) {
                    cantidadSegundaDocena++;
                }
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }
            }
            System.out.println("Cantidad de numeros impares: " + cantidadImpares);
            System.out.println("Promedio de numeros pares: " + (sumaPares / cantidadPares));
            System.out.println("Cantidad de numeros en la segunda docena: " + cantidadSegundaDocena);
            System.out.println("Numero mayor: " + numeroMayor);
        }
    }
}