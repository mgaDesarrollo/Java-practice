// Esta clase representa la plantilla (molde) para crear objetos de tipo Producto.
public class Producto {
    // Atributos privados: definen el estado de cada objeto Producto.
    // Usamos 'private' por encapsulamiento (proteger los datos internos de accesos no deseados).
    private String nombre;
    private double precio;
    private String categoria;

    // Constructor: es el método especial que se ejecuta al usar 'new Producto(...)'.
    // Sirve para inicializar los atributos del nuevo producto.
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Getters y Setters: métodos públicos para leer (get) y escribir/modificar (set) los atributos privados.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método toString: redefine cómo se representará este objeto cuando lo imprimamos con System.out.println.
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

