/**
 * Clase Principal para ejecutar y probar el sistema de Cuenta Bancaria.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando simulación del sistema bancario...\n");

        // Instanciar un objeto de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", "123456789", 500.0);

        // Consultar saldo inicial
        cuenta1.consultarSaldo();

        // Depositar dinero
        cuenta1.depositar(200.0);

        // Intentar retirar dinero con éxito
        cuenta1.retirar(150.0);

        // Intentar retirar más dinero del saldo disponible (insuficiente)
        cuenta1.retirar(600.0);

        // Consultar el estado final de la cuenta
        cuenta1.consultarSaldo();
    }
}
