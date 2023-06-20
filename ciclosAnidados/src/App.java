public class App {
    public static void main(String[] args) throws Exception {
        // ciclos anidados
        int num1 = 0;
        int num2 = 0;

        for (num1 = 0; num1 <= 10; ++num1) {

            for (num2 = 0; num2 <= 10; ++num2) {

                System.out.print(num1 * num2);
                System.out.print(" ");
            }

            System.out.println();
        }

        // ciclos anidados
        int multiplicador = 0;
        int multiplicando = 0;
        int resultado = 0;

        for (multiplicador = 0; multiplicador <= 10; ++multiplicador) {

            System.out.println("Tabla del: " + multiplicador);

            for (multiplicando = 0; multiplicando <= 10; ++multiplicando) {
                resultado = multiplicador * multiplicando;
                System.out.print(multiplicador + " X " + multiplicando + " = " + resultado);
                System.out.println();

            }
            System.out.println();
        }
    }
}
