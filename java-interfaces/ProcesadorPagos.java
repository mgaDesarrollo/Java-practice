public class ProcesadorPagos {
    public void ejecutar(MetodoPago metodo, double monto) {
        System.out.println("Iniciando transacción...");
        metodo.procesarPago(monto);
        System.out.println("Transacción finalizada con éxito.\n");
    }
}
