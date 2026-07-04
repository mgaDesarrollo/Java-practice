/**
 * INTERFAZ:
 * Una interfaz es un contrato. Define qué acciones (métodos) debe poder realizar
 * cualquier clase que la implemente, pero no dice *cómo* hacerlas (no tienen cuerpo).
 * 
 * - Todos los métodos en una interfaz son implícitamente 'public' y 'abstract'.
 * - No puede tener variables de instancia (solo constantes 'public static final').
 */
public interface Conducible {
    // Método que cualquier clase "conducible" debe implementar
    void arrancar();
    
    // Otro método del contrato
    void detener();
}
