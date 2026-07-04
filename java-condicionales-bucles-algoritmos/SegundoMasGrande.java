public class SegundoMasGrande {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Arreglo de números de prueba
        int numeros[] = { 2, 3, 6, 6, 5 };
        
        // Imprime en consola llamando al método encontrarSegundoMayor
        System.out.println("El segundo numero mas grande es: " + encontrarSegundoMayor(numeros));
    }

    /**
     * Método para encontrar el segundo número más grande en un arreglo.
     */
    public static int encontrarSegundoMayor(int[] numeros) {
        // Inicializamos las variables con el valor entero mínimo posible en Java
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;

        // Recorremos cada número del arreglo
        for (int numero : numeros) {
            // Si el número actual es mayor que el "mayor" guardado
            if (numero > mayor) {
                // El antiguo "mayor" pasa a ser el "segundoMayor"
                segundoMayor = mayor;
                // El número actual se convierte en el nuevo "mayor"
                mayor = numero;
            // Si el número es mayor que el "segundoMayor" pero diferente al "mayor" actual (evita duplicados)
            } else if (numero > segundoMayor && numero != mayor) {
                // El número actual se convierte en el nuevo "segundoMayor"
                segundoMayor = numero;
            }
        }
        // Devolvemos el segundo número más grande encontrado
        return segundoMayor;
    }
}
