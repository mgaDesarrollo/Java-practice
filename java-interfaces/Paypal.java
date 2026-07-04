public class Paypal implements MetodoPago {
    private static final double COMISION_FIJA = 5.00;

    @Override
    public void procesarPago(double monto) {
        double total = monto + COMISION_FIJA;
        System.out.printf("Procesando pago con PayPal por $%.2f (Monto original: $%.2f + comisión fija: $%.2f)%n", total, monto, COMISION_FIJA);
    }
}
