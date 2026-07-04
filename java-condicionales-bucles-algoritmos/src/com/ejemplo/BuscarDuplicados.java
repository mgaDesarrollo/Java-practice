package com.ejemplo;

public class BuscarDuplicados {
    public static void main(String[] args) {
        int[] misNumeros = {1, 5, 3, 2, 4, 5, 6, 7};
        boolean resultado = tieneDuplicados(misNumeros);
        System.out.println("¿Tiene Duplicados?: " + resultado);
    }

    /**
     * Comprueba si un arreglo de enteros contiene algún elemento duplicado.
     */
    public static boolean tieneDuplicados(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
