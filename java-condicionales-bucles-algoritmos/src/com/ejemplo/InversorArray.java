package com.ejemplo;

import java.util.Arrays;

public class InversorArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Arreglo original (InversorArray): " + Arrays.toString(original));
        
        // Invertimos el arreglo (in-place)
        invertir(original);
        
        System.out.println("Arreglo invertido (InversorArray): " + Arrays.toString(original));
    }

    /**
     * Invierte los elementos de un arreglo de enteros in-place (modifica el arreglo original).
     * Usa la técnica de dos punteros (uno al inicio y otro al final).
     */
    public static void invertir(int[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda < derecha) {
            // Intercambiar elementos
            int temporal = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temporal;
            
            // Mover punteros hacia el centro
            izquierda++;
            derecha--;
        }
    }
}
