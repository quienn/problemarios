package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * A un grupo de 10 personas se les consulta la edad y se desea calcular el
 * promedio de edad del grupo. Mostrar el promedio y cuántas de las 10 personas
 * son mayores
 * 
 **/

public class PromedioEdadGrupo {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int edad, suma = 0, mayores = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce la edad de la persona " + (i + 1));
                edad = sc.nextInt();
                suma += edad;
                if (edad > 18) {
                    mayores++;
                }
            }
            System.out.println("El promedio de edad del grupo es: " + (suma / 10));
            System.out.println("Hay " + mayores + " personas mayores de edad");
        }
    }
}