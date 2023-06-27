public class Cuenta {

    private int idCuenta;
    private Sucursal idSucursal;
    private Cliente idTitular;
    private double saldo;

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

    // crear cuenta
    public boolean setCreatedCuenta(Sucursal numeroSucursal, Cliente documentoCliente, int numeroCuenta,
            double valorSaldo) {

        if (idSucursal != null && documentoCliente != null && numeroCuenta != 0) {

            this.idSucursal = numeroSucursal;
            this.idTitular = documentoCliente;
            this.idCuenta = numeroCuenta;
            this.saldo = valorSaldo;

            return true;

        } else {

            return false;
        }
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

    // metodo transferir entre cuentas
    public boolean transferir(double valor, Cuenta cuentaDestino) {

        if (this.saldo >= valor) {

            cuentaDestino.depositar(valor);
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

}
