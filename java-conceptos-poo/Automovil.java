/**
 * CLASE CONCRETA:
 * Es una clase normal de la cual sí podemos crear objetos ('new Automovil()').
 * 
 * - Hereda (extends) de la clase abstracta 'Vehiculo'.
 * - Implementa (implements) la interfaz 'Conducible'.
 * 
 * Al heredar de una clase abstracta e implementar una interfaz, está obligada a:
 * 1. Definir el constructor de la superclase (Vehiculo).
 * 2. Implementar el método abstracto 'acelerar()' de Vehiculo.
 * 3. Implementar los métodos 'arrancar()' y 'detener()' de Conducible.
 */
public class Automovil extends Vehiculo implements Conducible {
    private int velocidadActual;

    // Constructor que invoca al de la clase abstracta padre
    public Automovil(String marca, String modelo) {
        super(marca, modelo); // Llama al constructor de Vehiculo
        this.velocidadActual = 0;
    }

    // --- Implementación de los métodos de la INTERFAZ (Conducible) ---
    @Override
    public void arrancar() {
        System.out.println("El automóvil " + getMarca() + " ha arrancado (Motor encendido).");
    }

    @Override
    public void detener() {
        this.velocidadActual = 0;
        System.out.println("El automóvil " + getMarca() + " se ha detenido.");
    }

    // --- Implementación del método de la CLASE ABSTRACTA (Vehiculo) ---
    @Override
    public void acelerar() {
        this.velocidadActual += 20;
        System.out.println("El automóvil acelera. Velocidad actual: " + velocidadActual + " km/h.");
    }
}
