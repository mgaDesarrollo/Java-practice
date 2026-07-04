/**
 * MAIN:
 * Clase principal que ejecuta el código y sirve para entender los conceptos de:
 * 1. CLASE
 * 2. OBJETO
 * 3. CLASE ABSTRACTA
 * 4. INTERFAZ
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXPLICACIÓN DE CONCEPTOS POO ===\n");

        /*
         * 1. CLASE y OBJETO:
         * - 'Automovil' es la CLASE (el plano, la plantilla de diseño).
         * - 'miAuto' es el OBJETO (la instancia real creada en memoria usando 'new').
         */
        System.out.println("--- 1. Creando un Objeto a partir de una Clase ---");
        Automovil miAuto = new Automovil("Toyota", "Corolla");
        
        // Usamos los métodos del objeto
        miAuto.mostrarInfo();
        System.out.println();

        /*
         * 2. INTERFAZ:
         * - Podemos ver que 'miAuto' cumple con el contrato 'Conducible' 
         *   llamando a sus métodos de arranque y parada.
         */
        System.out.println("--- 2. Probando la Interfaz (Contrato Conducible) ---");
        miAuto.arrancar();
        miAuto.acelerar();
        miAuto.detener();
        System.out.println();

        /*
         * 3. CLASE ABSTRACTA y POLIMORFISMO:
         * - No podemos hacer: Vehiculo v = new Vehiculo("Ford", "Focus"); // Error de compilación
         * - Pero sí podemos usar 'Vehiculo' como tipo de referencia para un objeto 'Automovil'.
         *   Esto se conoce como Polimorfismo.
         */
        System.out.println("--- 3. Clase Abstracta y Polimorfismo ---");
        Vehiculo miSegundoAuto = new Automovil("Ford", "Mustang");
        
        miSegundoAuto.mostrarInfo(); // Llama al método concreto heredado de Vehiculo
        miSegundoAuto.acelerar();    // Llama al método abstracto implementado en Automovil
    }
}
