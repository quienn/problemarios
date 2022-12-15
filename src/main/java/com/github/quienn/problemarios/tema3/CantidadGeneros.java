package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * Mostrar por pantalla la cantidad de mujeres y hombres (M/H) de un total de N
 * valores leídos desde teclado. Mostrar también su porcentaje.
 * 
 **/
public class CantidadGeneros {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese la cantidad de personas: ");
            int cantidad = sc.nextInt();
            int hombres = 0;
            int mujeres = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el género de la persona " + (i + 1) + " (M/H): ");
                String genero = sc.next();
                if (genero.equalsIgnoreCase("M")) {
                    hombres++;
                } else if (genero.equalsIgnoreCase("H")) {
                    mujeres++;
                }
            }
            System.out.println("Cantidad de hombres: " + hombres);
            System.out.println("Cantidad de mujeres: " + mujeres);
            System.out.println("Porcentaje de hombres: " + (hombres * 100 / cantidad) + "%");
            System.out.println("Porcentaje de mujeres: " + (mujeres * 100 / cantidad) + "%");
        } catch (Exception e) {
            System.out.println("El número ingresado no es válido");
        }
    }
}