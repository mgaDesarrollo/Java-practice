package com.ejemplo;

public class ContadorVocales {
    public static void main(String[] args) {
        String texto = "Entrevista";
        int cantidad = contarVocales(texto);
        
        System.out.println("El texto: \"" + texto + "\" tiene " + cantidad + " vocales.");
    }

    /**
     * Cuenta cuántas vocales (a, e, i, o, u) contiene un texto dado.
     * Ignora mayúsculas y minúsculas, e incluye vocales con tilde.
     */
    public static int contarVocales(String texto) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;
        // Convertimos todo a minúsculas para facilitar la comparación
        String textoMinuscula = texto.toLowerCase();

        for (int i = 0; i < textoMinuscula.length(); i++) {
            char caracter = textoMinuscula.charAt(i);
            
            // Comprobamos si el carácter actual es una vocal (incluyendo vocales con tilde)
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
                contador++;
            }
        }

        return contador;
    }
}
