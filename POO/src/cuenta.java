//por medio de una clase declaramos la entidad
class Cuenta {
    // declaramos los campos de la entidad
    private double saldo;
    private int agencia;
    private int numero;
    // este campo referencia el objeto cliente en cuenta y establece la relacion que
    // existe entre ambos
    private Cliente titular;

    // creamos un metodo al intrudcir una accion que solo ejecuta esta entidad
    // y es accesibble solo invocandolo a traves del llamado de la entidad cuenta en
    // este caso primero

    // este metodo no retorna ningun valor
    public void depositar(double valor) {

        // obtiene el valor de incremento de saldo desde el cuerpo principal a traves de
        // una variable de entrada llamada valor
        // saldo = saldo + valor;

        // al utilizar la parabla reservada this se hace referencia al objeto en el que
        // nos encontramos

        this.saldo += valor;

        // lo anterior se traduce como:
        // en este objeto su campo es igual a en este objeto su campo saldo mas valor
        // que es la variable que trae el dato que entra al objeto

    }

    // este metodo retorna un valor true o false
    public boolean retirar(double valor) {

        if (this.saldo >= valor) {

            this.saldo -= valor;
            return true;

        }
        return false;

    }

    // este metodo realiza una transferencia entre cuentas
    public boolean transferir(double valorTranferir, Cuenta cuentaDestino) {

        if (valorTranferir <= this.saldo) {

            // llama y ejecuta el metodo retiriar para la cuenta prigen
            this.retirar(valorTranferir);

            // llama y ejecuta el metodo depositar para la cuenta destino
            cuentaDestino.depositar(valorTranferir);

            // como la operacion se realiza genera una true de salida
            return true;

        }
        // si falla la operacion, genera un false de salida
        return false;

    }

    // obtener se coloca por la convencion en java que nos indica si el metodo
    // escribe en la clase, son los metodos getter de get, los que llevan obtener.

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    // setear se coloca por la convencion en java que nos indica si el metodo lee en
    // la clase son los metodos getter de get, los que llevan obtener.

    public boolean setCuenta(int saldo, Cliente nombre, int sucursal, int numero) {

        if (saldo > 0 && sucursal > 0 && numero > 0 && nombre != null) {

            this.numero = numero;
            this.agencia = sucursal;
            this.saldo = saldo;
            this.titular = nombre;

            return true;
        }
        return false;
    }

}
