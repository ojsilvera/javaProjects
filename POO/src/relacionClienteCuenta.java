public class relacionClienteCuenta {

    public static void main(String[] args) {

        // instanciamos las clases

        Cliente defaultCliente = new Cliente();
        Cuenta cuentaCliente = new Cuenta();

        // creando cliente

        defaultCliente.nombre = "Oscar_Silvera";
        defaultCliente.telefono = "3165656110";
        defaultCliente.documento = "6212456897";
        defaultCliente.genero = "Masculino";

        // asignando datos a la cuenta de defaultCliente

        cuentaCliente.agencia = 1;
        cuentaCliente.numero = 14376817;
        cuentaCliente.saldo = 10000;
        cuentaCliente.nombre = defaultCliente;

        System.out.println(cuentaCliente.nombre.nombre);
    }

}
