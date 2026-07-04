package com.ejemplo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InversorArrayStream {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Arreglo original (InversorArrayStream): " + Arrays.toString(original));
        
        // Invertimos usando streams
        int[] invertido = invertirConStreams(original);
        
        System.out.println("Arreglo invertido (InversorArrayStream): " + Arrays.toString(invertido));
    }

    /**
     * Invierte un arreglo utilizando Java Streams (retorna un nuevo arreglo).
     */
    public static int[] invertirConStreams(int[] arreglo) {
        return IntStream.range(0, arreglo.length)
                .map(i -> arreglo[arreglo.length - 1 - i])
                .toArray();
    }
}
