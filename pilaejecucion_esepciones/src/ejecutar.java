public class ejecutar {

    public static void main(String[] args) {

        Pila p1 = new Pila(42500);

        System.out.println(p1.getSaldo());

        p1.retiro(20000);

        System.out.println(p1.getSaldo());

    }

}
