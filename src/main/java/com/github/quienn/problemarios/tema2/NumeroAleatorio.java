package com.github.quienn.problemarios.tema2;

/**
 * Un algoritmo que genera un número aleatorio del 10 al 50, lo
 * muestra y luego calcula y muestra el mismo número disminuido en un 15%.
 **/
public class NumeroAleatorio {
	public static void main(String args[]) {
		int numero = (int) (Math.random() * 41 + 10);
		System.out.println("El numero aleatorio es: " + numero);
		System.out.println("El numero disminuido en un 15% es: " + (numero - numero * 0.15));
	}
}