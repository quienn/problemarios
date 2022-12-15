package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Se ingresan 10 pares de temperaturas (T1 y T2). Hallar el promedio de las
 * temperaturas T1 y el promedio de las temperaturas T2.
 * 
 **/
public class ParesTemperaturasPromedio {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int temperatura1;
            int temperatura2;
            int sumaTemperatura1 = 0;
            int sumaTemperatura2 = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese una temperatura 1:");
                temperatura1 = sc.nextInt();
                System.out.println("Ingrese una temperatura 2:");
                temperatura2 = sc.nextInt();
                sumaTemperatura1 += temperatura1;
                sumaTemperatura2 += temperatura2;
            }
            System.out.println("Promedio de temperaturas 1: " + (sumaTemperatura1 / 10));
            System.out.println("Promedio de temperaturas 2: " + (sumaTemperatura2 / 10));
        }
    }
}