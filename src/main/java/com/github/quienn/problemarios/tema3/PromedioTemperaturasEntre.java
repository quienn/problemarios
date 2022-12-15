package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Se leen desde teclado pares de temperaturas (T1 y T2) hasta que T1 sea cero.
 * Hallar el promedio de las temperaturas ingresadas que están comprendidas
 * entre 5° y 15° (incluidos).
 * 
 **/

public class PromedioTemperaturasEntre {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int t1, t2;
            float promedio = 0;
            int cantidad = 0;
            do {
                System.out.println("Ingrese la temperatura 1");
                t1 = sc.nextInt();
                System.out.println("Ingrese la temperatura 2");
                t2 = sc.nextInt();
                if (t1 > 5 && t1 < 15) {
                    promedio += t1;
                    cantidad++;
                }
                if (t2 > 5 && t2 < 15) {
                    promedio += t2;
                    cantidad++;
                }
            } while (t1 != 0);
            System.out.println("El promedio es: " + promedio / cantidad);
        }
    }
}