package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Se desea conocer el peso promedio de 5 personas.
 * 
 **/

public class PesoPromedio {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int peso = 0;
            int suma = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingrese el peso de la persona " + i);
                peso = sc.nextInt();
                suma = suma + peso;
            }
            System.out.println("El peso promedio es: " + suma / 5);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}