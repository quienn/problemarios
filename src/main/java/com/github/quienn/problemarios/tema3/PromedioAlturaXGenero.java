package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que lea desde teclado la información sobre altura, edad,
 * y sexo (F/M) de los participantes de un curso. La lectura finaliza cuando se
 * lee un valor de altura negativo. Luego calcule:
 * a. Promedio de altura de las mujeres.
 * b. Promedio de altura de los varones.
 * c. Promedio de edad de los participantes.
 **/

public class PromedioAlturaXGenero {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int edad, edadTotal = 0, cantidadMujeres = 0, cantidadVarones = 0;
            double altura, alturaMujeres = 0, alturaVarones = 0;
            char sexo;

            do {
                System.out.println("Ingrese la altura: ");
                altura = sc.nextDouble();
                if (altura > 0) {
                    System.out.println("Ingrese la edad: ");
                    edad = sc.nextInt();
                    System.out.println("Ingrese el sexo: ");
                    sexo = sc.next().charAt(0);
                    if (sexo == 'F') {
                        alturaMujeres += altura;
                        cantidadMujeres++;
                    } else if (sexo == 'M') {
                        alturaVarones += altura;
                        cantidadVarones++;
                    }
                    edadTotal += edad;
                }
            } while (altura > 0);
            System.out.println("Promedio de altura de las mujeres: " + alturaMujeres / cantidadMujeres);
            System.out.println("Promedio de altura de los varones: " + alturaVarones / cantidadVarones);
            System.out.println(
                    "Promedio de edad de los participantes: " + edadTotal / (cantidadMujeres + cantidadVarones));
        }
    }
}