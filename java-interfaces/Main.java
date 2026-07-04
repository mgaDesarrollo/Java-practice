public class Main {
    public static void main(String[] args) {
        ProcesadorPagos procesador = new ProcesadorPagos();
        
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new Paypal();
        
        double montoCompra = 100.00;
        
        System.out.println("--- Probando Sistema de Checkout ---\n");
        
        System.out.println("Compra de: $" + montoCompra);
        procesador.ejecutar(tarjeta, montoCompra);
        
        procesador.ejecutar(paypal, montoCompra);
    }
}
