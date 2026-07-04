package com.ejemplo;

import java.util.Arrays;

public class MayorMenor {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 23, -4, 8, 30, 1};
        
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        encontrarMayorMenor(numeros);
    }

    /**
     * Encuentra y muestra el número mayor y menor del arreglo en una sola pasada.
     */
    public static void encontrarMayorMenor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return;
        }

        // Inicializamos mayor y menor con el primer elemento del arreglo
        int mayor = arreglo[0];
        int menor = arreglo[0];

        // Recorremos el arreglo a partir de la segunda posición (índice 1) en una sola pasada
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            } else if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
