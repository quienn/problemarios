package com.github.quienn.problemarios.tema3;

import java.util.Scanner;

/**
 * 
 * un algoritmo para mostrar un cartel que indique si un triángulo es
 * «escaleno», «equilátero» o «isósceles» ingresando sus lados.
 * 
 **/
public class CategorizarTriangulo {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Ingrese el lado A: ");
            int ladoA = sc.nextInt();
            System.out.println("Ingrese el lado B: ");
            int ladoB = sc.nextInt();
            System.out.println("Ingrese el lado C: ");
            int ladoC = sc.nextInt();
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("El triángulo es equilátero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
        } catch (Exception e) {
            System.out.println("El número ingresado no es válido");
        }
    }
}