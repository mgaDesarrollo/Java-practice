public class Palindromo {
    public static void main(String[] args) {
        String entrada = "ana";
        boolean resultado = esPalindromo(entrada);
        System.out.println("¿Es Palindromo?: " + resultado);
    }

    /**
     * Comprueba si una cadena de texto es un palíndromo (se lee igual de
     * izquierda a derecha que de derecha a izquierda).
     */
    public static boolean esPalindromo(String texto) {
        int izquierda = 0;
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
