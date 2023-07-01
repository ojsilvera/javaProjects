public class CuentaAhorros extends Cuenta {

    // constructor

    public CuentaAhorros(Sucursal numeroSucursal, Cliente documentoCliente, int numeroCuenta) {
        super(numeroSucursal, documentoCliente, numeroCuenta);

    }

    // Metodo para calculo de comision copmision

    public double comision(double cantidad) {

        double comision = cantidad * 0.05;
        double nuevoValor = cantidad - comision;

        return nuevoValor;

    }

    // depositar

    @Override
    public boolean depositar(double valor) {

        return super.depositar(comision(valor));

    }

    @Override
    public boolean retirar(double valor) {

        return super.retirar(comision(valor));

    }

    // transferencia entre cuentas
    @Override
    public boolean transferir(double valor, Cuenta cuentaDestino) {

        return super.transferir(valor, cuentaDestino);

    }

}
