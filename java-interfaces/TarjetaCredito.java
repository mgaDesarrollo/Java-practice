public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        double interes = monto * 0.10;
        double total = monto + interes;
        System.out.printf("Procesando pago con Tarjeta de Crédito por $%.2f (Monto original: $%.2f + 10%% de interés: $%.2f)%n", total, monto, interes);
    }
}
