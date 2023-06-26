public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        // byte bank proeject
        // crear cuenta
        // para llamar al objeto cuenta, primero debemos instanciarla
        // TiposdeObjeto(nombre de la clase a usar) nombreObjeto = new objeto(param);

        Cuenta primeraCuenta = new Cuenta();

        // llamamos al objeto con su atributo para almacenar un nuevo valor

        primeraCuenta.depositar(1000);
        primeraCuenta.agencia = 25;
        primeraCuenta.numero = 14376817;
        // primeraCuenta.titular = "Oscar Silvera";

        // para tener una segunda cuenta creamos un nuevo espacio en memoria con el
        // comando new

        Cuenta segundaCuenta = new Cuenta();

        segundaCuenta.depositar(10000);
        segundaCuenta.agencia = 35;
        segundaCuenta.numero = 25386877;
        // segundaCuenta.titular = "Mariluz Cardona";

        // System.out.println(primeraCuenta.titular);
        // System.out.println(segundaCuenta.titular);

        // a tener en cuenta java inicializa de manera autonoma las variables que no se
        // han inicializada, con 0 a los campos enteros, 0.0 a los doubles y null a
        // los strings.

        Cuenta miCuenta = new Cuenta();
        miCuenta.depositar(500);
        // System.out.println("el saldo en cuenta es: " + miCuenta.saldo);

        miCuenta.retirar(700);
        // System.out.println("el saldo en cuenta es: " + miCuenta.saldo);

        // transferencia

        // System.out.println("saldo actual 1ra cuenta: " + primeraCuenta.saldo);
        // System.out.println("saldo actual 2da cuenta: " + segundaCuenta.saldo);

        // transfiere los dos arg requeridos por el metodo, valor a transferrir y cuenta
        // destino

        // para recuperar la salida que genera el metodo lo almaceno en una variable del
        // mismo tipo de la salida que el metodo va a generar
        boolean transferir = segundaCuenta.transferir(2500, primeraCuenta);

        if (transferir) {

            System.out.println("transferencia exitosa");
            // System.out.println("nuevo saldo en: " + primeraCuenta.numero + " es: " +
            // primeraCuenta.saldo);
            // System.out.println("nuevo saldo en: " + segundaCuenta.numero + " es: " +
            // segundaCuenta.saldo);

        } else {

            System.out.println("transferencia no realizada");

        }

    }
}
