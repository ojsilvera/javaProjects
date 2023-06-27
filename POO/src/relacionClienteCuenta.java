public class relacionClienteCuenta {

    public static void main(String[] args) {

        // instanciamos las clases y creamos los objetos necesarios

        Cliente defaultCliente = new Cliente();
        Cuenta cuentaCliente = new Cuenta();

        // creando cliente
        boolean clienteValido = defaultCliente.setCliente("Oscar Slivera", "3165656110", "6212456897");
        if (clienteValido) {
            // asignando datos a la cuenta
            boolean opercionValida = cuentaCliente.setCuenta(10000, defaultCliente, 5, 14376817);

            if (opercionValida) {
                // obtenemos datos del objeto cliente a traves del capo referenciado en el
                // objeto cuenta
                System.out.println("Nombre del cliente: " + cuentaCliente.getTitular().getNombre());
                System.out.println("Documento del cliente: " + cuentaCliente.getTitular().getDocumento());
                System.out.println("Saldo de la cuenta: " + cuentaCliente.getSaldo());

                // deposito a cuenta propia
                // cuentaCliente.depositar(10000);

                // System.out.println("Saldo cuenta post deposito: " +
                // System.out.println("buevo saldo: " + cuentaCliente.getSaldo());
            } else {
                System.out.println("Paametros de cuenta incompletos");
            }
        } else {
            System.out.println("Parametros de Cliente incompletos");
        }

    }

}
