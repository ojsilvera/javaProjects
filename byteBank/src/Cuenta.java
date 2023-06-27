public class Cuenta {

    private int idCuenta;
    private Sucursal idSucursal;
    private Cliente idTitular;
    private int saldo;

    public int getIdCuenta() {
        return idCuenta;
    }

    public Cliente getIdTitular() {
        return idTitular;
    }

    public Sucursal getIdSucursal() {
        return idSucursal;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setCreatedCuenta(Sucursal numeroSucursal, Cliente documentoCliente, int numeroCuenta,
            int valorSaldo) {

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

}
