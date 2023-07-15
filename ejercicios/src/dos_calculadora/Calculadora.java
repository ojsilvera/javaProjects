package dos_calculadora;

public class Calculadora {

    public void Calcular(double dato1, double dato2, String operacion) {

        switch (operacion) {

            case "+":
                System.out.println(dato1 + dato2);
                break;

            case "-":
                System.out.println(dato1 - dato2);
                break;

            case "*":
                System.out.println(dato1 * dato2);
                break;

            case "/":
                System.out.println(dato1 / dato2);
                break;

        }

    }
}
