package co.byteBank.operaciones;

public abstract class Cuenta {

    private int idCuenta;
    private Sucursal idSucursal;
    private Cliente idTitular;
    private double saldo;

    // Constructor
    public Cuenta(Sucursal numeroSucursal, Cliente documentoCliente, int numeroCuenta) {

        this.idSucursal = numeroSucursal;
        this.idTitular = documentoCliente;
        this.idCuenta = numeroCuenta;

    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public Cliente getIdTitular() {
        return idTitular;
    }

    public Sucursal getIdSucursal() {
        return idSucursal;
    }

    public double getSaldo() {
        return saldo;
    }

    // metodo depositar
    public boolean depositar(double valor) {

        if (valor > 0) {

            this.saldo += valor;
            return true;

        } else {

            return false;
        }
    }

    // metodo retirar
    public boolean retirar(double valor) {

        if (this.saldo >= valor) {

            this.saldo -= valor;
            return true;

        } else {

            return false;
        }
    }

    // metodo transferir entre cuentas
    public boolean transferir(double valor, Cuenta cuentaDestino) {

        if (this.saldo >= valor) {

            this.retirar(valor);
            cuentaDestino.depositar(valor);
            System.out.println("----------------resultado de de la transferencia-----");
            System.out.println("Transferencia exitosa");
            System.out.println("saldo cuenta Destino: " + cuentaDestino.saldo);
            System.out.println("saldo cuenta origen: " + this.saldo);
            System.out.println("-----------------------------------------------------");
            return true;

        } else {
            System.out.println("----------------resultado de de la transferencia-----");
            System.out.println("Saldo en cuenta origen insuficiente");
            return false;
        }
    }
}
