public class relacionClienteCuenta {

    public static void main(String[] args) {

        // instanciamos las clases y creamos los objetos necesarios

        Cliente defaultCliente = new Cliente();
        Cuenta cuentaCliente = new Cuenta();

        // creando cliente
        defaultCliente.setCliente("Oscar_Silvera", "3165656110", "6212456897");

        // asignando datos a la cuenta

        cuentaCliente.setCuenta(10000, defaultCliente, 1, 14376817);

        // obtenemos datos del objeto cliente a traves del capo referenciado en el
        // objeto cuenta
        System.out.println("Nombre del cliente: " + cuentaCliente.nombre.getNombre());
        System.out.println("Documento del cliente: " + cuentaCliente.nombre.getDocumento());
        System.out.println("Saldo de la cuenta: " + cuentaCliente.getSaldo());

        // deposito a cuenta propia
        cuentaCliente.depositar(10000);

        System.out.println("Saldo cuenta post deposito: " + cuentaCliente.getSaldo());
    }

}
