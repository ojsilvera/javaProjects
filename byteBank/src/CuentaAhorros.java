public class CuentaAhorros extends Cuenta {

    private int contComision;

    // constructor

    public CuentaAhorros(Sucursal numeroSucursal, Cliente documentoCliente, int numeroCuenta) {
        super(numeroSucursal, documentoCliente, numeroCuenta);

    }

    // Metodo para calculo de comision copmision

    public double comision(double cantidad) {

        this.contComision += 1;
        double comision = cantidad * 0.05;
        System.out.println("Valor neto comision:" + comision);
        double nuevoValor = cantidad - comision;
        return nuevoValor;

    }

    // depositar

    @Override
    public boolean depositar(double valor) {

        if (this.contComision == 0) {

            this.contComision += 1;
            System.out.println("Metodo depo CA: calcula comision");
            return super.depositar(comision(valor));

        } else {
            System.out.println("Metodo depo CA: sin comision");
            return super.depositar(valor);
        }

    }

    @Override
    public boolean retirar(double valor) {

        if (this.contComision == 0) {

            this.contComision += 1;
            System.out.println("Metodo retirar CA: calcula comision");
            return super.retirar(comision(valor));

        } else {

            System.out.println("Metodo retirar CA: sin comision");
            return super.retirar(valor);

        }

    }

    // transferencia entre cuentas
    @Override
    public boolean transferir(double valor, Cuenta cuentaDestino) {

        return super.transferir(valor, cuentaDestino);

    }

}
