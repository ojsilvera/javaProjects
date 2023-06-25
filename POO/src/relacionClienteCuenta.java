public class relacionClienteCuenta {

    public static void main(String[] args) {

        // instanciamos las clases y creamos los objetos necesarios

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
        // cuentaCliente.saldo = 10000;
        cuentaCliente.depositar(10000);
        cuentaCliente.nombre = defaultCliente;

        // obtenemos datos del objeto cliente a traves del capo referenciado en el
        // objeto cuenta
        System.out.println(cuentaCliente.nombre.nombre);
        System.out.println(cuentaCliente.nombre.documento);

    }

}
