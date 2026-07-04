/**
 * CLASE ABSTRACTA:
 * Una clase abstracta es una clase que no se puede instanciar directamente
 * (no puedes hacer 'new Vehiculo()'). Sirve como molde base para otras subclases.
 * 
 * A diferencia de una interfaz:
 * - Puede tener estado (variables de instancia como 'marca' y 'modelo').
 * - Puede tener constructores.
 * - Puede tener métodos concretos (con código/lógica) y métodos abstractos (sin código).
 */
public abstract class Vehiculo {
    // Estado (Atributos)
    private String marca;
    private String modelo;

    // Constructor (las subclases lo llamarán usando 'super')
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método concreto (ya implementado para todas las subclases)
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }

    // Método abstracto (cada subclase DEBE decidir cómo implementarlo)
    public abstract void acelerar();

    // Getters y Setters (Encapsulamiento)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
