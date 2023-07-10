public class Pila {

    public double saldo;

    public Pila(double saldo) {

        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retiro(double saldo) {

        if (this.saldo < saldo) {

            throw new saldoExcepcion("Saldo insuficiente");

        }

        this.saldo = this.saldo - saldo;

    }

}
