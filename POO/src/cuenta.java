//por medio de una clase declaramos la entidad
public class Cuenta {
    // declaramos los campos de la entidad
    double saldo;
    int agencia;
    int numero;
    String titular;

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

        this.saldo = this.saldo + valor;

        // lo anterior se traduce como:
        // en este objeto su campo es igual a en este objeto su campo saldo mas valor
        // que es la variable que trae el dato que entra al objeto

    }

    // este metodo retorna un valor true o false
    public boolean retirar(double valor) {

        if (this.saldo >= valor) {

            this.saldo = this.saldo - valor;
            return true;

        } else {

            return false;

        }

    }

}
