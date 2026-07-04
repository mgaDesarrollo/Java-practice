import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de la lista de productos.
        // List es la interfaz y ArrayList es la implementación concreta.
        List<Producto> productos = new ArrayList<>();
        
        // Agregamos productos mezclando las categorías "Electrónica" y "Hogar".
        productos.add(new Producto("Televisor Smart TV", 450.00, "Electrónica"));
        productos.add(new Producto("Aspiradora Robot", 250.00, "Hogar"));
        productos.add(new Producto("Auriculares Bluetooth", 80.00, "Electrónica"));
        productos.add(new Producto("Juego de Sillones", 600.00, "Hogar"));
        productos.add(new Producto("Celular Smartphone", 700.00, "Electrónica"));
        productos.add(new Producto("Cafetera Espresso", 120.00, "Hogar"));

        System.out.println("--- Lista Original de Productos ---");
        // forEach recorre cada producto y System.out::println lo imprime usando su toString().
        productos.forEach(System.out::println);

        // 2. Construcción del Pipeline de Datos usando la API de Streams.
        // Un Stream es una secuencia de elementos sobre la que podemos encadenar operaciones.
        // El resultado final lo guardamos en un 'OptionalDouble' porque el promedio podría no existir 
        // (por ejemplo, si la lista de entrada estuviese vacía o ningún producto pasara el filtro).
        OptionalDouble promedioPrecio = productos.stream()
                
                // .filter() -> Operación intermedia que evalúa una condición booleana para cada elemento.
                // Deja pasar solo los productos cuya categoría sea "Electrónica" (ignorando mayúsculas/minúsculas).
                .filter(p -> p.getCategoria().equalsIgnoreCase("Electrónica"))
                
                // .map() -> Operación intermedia que transforma cada elemento del stream.
                // En este caso, transformamos cada producto original en uno nuevo que tiene el precio incrementado un 21% (IVA).
                .map(p -> new Producto(p.getNombre(), p.getPrecio() * 1.21, p.getCategoria()))
                
                // .peek() -> Operación intermedia útil para depuración. Nos permite "mirar" qué elementos van 
                // fluyendo en esta etapa del pipeline sin alterar el flujo.
                .peek(p -> System.out.println("Producto Electrónico procesado (con IVA): " + p))
                
                // .mapToDouble() -> Transforma nuestro Stream de objetos Producto en un DoubleStream (un stream de números decimales primitivos).
                // Extrae únicamente el precio con IVA de cada producto.
                .mapToDouble(Producto::getPrecio)
                
                // .average() -> Operación terminal que calcula la media aritmética de los números del DoubleStream.
                // Al ser una operación terminal, desencadena el procesamiento de todo el pipeline.
                .average();

        System.out.println("\n--- Resultado Final ---");
        // Como el promedio es un OptionalDouble, debemos verificar si tiene un valor antes de intentar leerlo.
        if (promedioPrecio.isPresent()) {
            // %.2f da formato para mostrar solo dos decimales.
            System.out.format("El precio promedio de los productos electrónicos con IVA es: $%.2f%n", promedioPrecio.getAsDouble());
        } else {
            System.out.println("No se pudo calcular el promedio (no se encontraron productos que coincidan).");
        }
    }
}

