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
    void depositar(double valor) {

        // obtiene el valor de incremento de saldo desde el cuerpo principal a traves de
        // una variable de entrada llamada valor
        saldo = saldo + valor;

    }

}
