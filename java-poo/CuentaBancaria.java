/**
 * Clase que representa una Cuenta Bancaria.
 * Muestra los conceptos de Atributos, Constructor y Métodos.
 */
public class CuentaBancaria {
    // Atributos de la clase
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor para inicializar la cuenta
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = Math.max(0.0, saldoInicial);
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + ". Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                System.out.println("Retiro exitoso de $" + monto + ". Nuevo saldo: $" + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para retirar $" + monto + ". Saldo actual: $" + this.saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        }
    }

    // Método para consultar saldo e información
    public void consultarSaldo() {
        System.out.println("--- Consulta de Cuenta ---");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo Actual: $" + this.saldo);
        System.out.println("--------------------------");
    }

    // Getters y Setters (Formato abreviado)
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = Math.max(0.0, saldo); }
}
