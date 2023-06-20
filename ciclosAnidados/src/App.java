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

        // imprimir matriz de 10x10
        int rowM = 0;
        int columM = 0;

        for (rowM = 1; rowM <= 5; ++rowM) {

            System.out.println();
            System.out.print("linea # " + rowM + " -> ");

            for (columM = 1; columM <= 5; ++columM) {

                System.out.print(columM + " ");
            }

        }

        System.out.println();

        // ejercicio dibujar matriz con ciclos anidados

        int row = 0;
        int colum = 0;

        System.out.println();
        System.out.println("matriz de 10x10");

        for (colum = 0; colum <= 10; ++colum) {

            System.out.println();

            for (row = 0; row <= 10; ++row) {

                System.out.print("* ");

            }
        }
        System.out.println();

        // ejercicio dibujar matriz con ciclos anidados

        int rowTR = 0;
        int columTR = 0;

        System.out.println();
        System.out.println("matriz triangular");

        for (columTR = 0; columTR <= 10; ++columTR) {

            System.out.println();

            for (rowTR = 0; rowTR <= columTR; ++rowTR) {

                System.out.print("* ");

            }
        }
        System.out.println();

        // ejercicio de la escalera y ciclos anidados

        int rowE = 0;
        int columE = 0;
        int espaciosE = 0;

        System.out.println();
        System.out.println("intento de escalera");

        for (columE = 0; columE <= 10; ++columE) {

            System.out.println();

            for (rowE = columE; rowE >= columE; rowE -= 1) {

                for (espaciosE = 0; espaciosE <= rowE; ++espaciosE) {

                    System.out.print(" ");
                }
                System.out.print("| ");
            }
        }
    }
}
