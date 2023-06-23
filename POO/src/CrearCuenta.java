public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        // byte bank proeject
        // crear cuenta
        // para llamar al objeto cuenta, primero debemos instanciarla
        // TiposdeObjeto(nombre de la clase a usar) nombreObjeto = new objeto(param);

        Cuenta primeraCuenta = new Cuenta();

        // llamamos al objeto con su atributo para almacenar un nuevo valor

        primeraCuenta.saldo = 1000;
        primeraCuenta.agencia = 25;
        primeraCuenta.numero = 14376817;
        primeraCuenta.titular = "Oscar Silvera";

        // para tener una segunda cuenta creamos un nuevo espacio en memoria con el
        // comando new

        Cuenta segundaCuenta = new Cuenta();

        segundaCuenta.saldo = 10000;
        segundaCuenta.agencia = 35;
        segundaCuenta.numero = 25386877;
        segundaCuenta.titular = "Mariluz Cardona";

        System.out.println(primeraCuenta.titular);
        System.out.println(segundaCuenta.titular);

        // a tener en cuenta java inicializa de manera autonoma las variables que no se
        // han inicializada, con 0 a los campos enteros, 0.0 a los doubles y null a
        // los strings.
        Cuenta miCuenta = new Cuenta();
        miCuenta.depositar(500);
        System.out.println("el saldo en cuenta es: " + miCuenta.saldo);
        System.out.println("el titular de esta cuenta es: " + miCuenta.titular);
    }
}
