public class relacionClienteCuenta {

    public static void main(String[] args) {

        // instanciamos las clases y creamos los objetos necesarios

        Cliente defaultCliente = new Cliente();
        Cuenta cuentaCliente = new Cuenta();

        // creando cliente
        boolean clienteValido = defaultCliente.setCliente("Oscar Slivera", "3165656110", "6212456897");

        // validando creacion del cliente
        if (clienteValido) {
            System.out.println("Cliente creado satisfactoriamente: ");
        } else {
            System.out.println("Parametros de Cliente incompletos");

        }

        // asignando datos a la cuenta
        if (clienteValido) {
            cuentaCliente.setCuenta(10000, defaultCliente, 1, 14376817);
            System.out.println("Cuenta creada satisfactoriamente");
        } else {
            System.out.println("No se reporta cliente para esta operacion");

        }

        // validando creacion de la cuenta
        if (cuentaCliente.getNumero() != 0) {
            // obtenemos datos del objeto cliente a traves del capo referenciado en el
            // objeto cuenta
            System.out.println("Nombre del cliente: " + cuentaCliente.getTitular().getNombre());
            System.out.println("Documento del cliente: " + cuentaCliente.getTitular().getDocumento());
            System.out.println("Saldo de la cuenta: " + cuentaCliente.getSaldo());

        } else {
            System.out.println("Paametros de cuenta incompletos");
        }

        // deposito a cuenta propia
        // cuentaCliente.depositar(10000);

        // System.out.println("Saldo cuenta post deposito: " +
        // System.out.println("buevo saldo: " + cuentaCliente.getSaldo());

    }

}
