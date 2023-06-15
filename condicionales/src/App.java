public class App {
    public static void main(String[] args) throws Exception {
        // Condicionales
        int edad = 18;
        int personas = 2;

        // si la edad introducida es mayor o igual a 18 se ejecuta el cogigo dentro de
        // las llaves
        // el Y como operador de condicion se expresa ppor && y el O como ||
        // es posible anidar if de tal manera que evaluen multiples condicionea

        if (edad >= 18 && personas == 1) {
            System.out.println("Bienvenido Sr");
        }
        // else nos da una respuesta en el caso que no se cumpla la condicion o
        // condiciones propuestas
        else {
            if (edad >= 18 || personas == 2) {
                System.out.println("Bienvenido Sres");
            } else {
                System.out.println("Andate donde mami" + "Apenas tienes " + edad);
            }
        }

        // ejemplo propuesto
        double compra = 225.0;

        // forma inicial de hacerlo

        if (compra > 100 && compra < 200) {
            System.out.println("Su compra es de: " + compra);
            System.out.println("Su descuento sera del 10%");
        } else {
            if (compra > 200 && compra < 300) {
                System.out.println("Su compra es de: " + compra);
                System.out.println("Su descuento sera del 15%");
            } else {
                if (compra > 300) {
                    System.out.println("Su compra es de: " + compra);
                    System.out.println("Su descuento sera del 20%");
                }
            }
        }
        // otra forma de hacerlo--------------------------------------

        // montos de descuento
        int descuento1 = 10;
        int descuento2 = 15;
        int descuento3 = 20;

        // limites de compra para aplicar descuento
        boolean compra1 = compra > 100 && compra < 200;
        boolean compra2 = compra > 200 && compra < 300;
        boolean compra3 = compra > 300;

        if (compra1) {
            System.out.println("Su compra es de: " + compra);
            System.out.println("Su descuento sera del: " + descuento1 + "%");
        } else {
            if (compra2) {
                System.out.println("Su compra es de: " + compra);
                System.out.println("Su descuento sera del: " + descuento2 + "%");
            } else {
                if (compra3) {
                    System.out.println("Su compra es de: " + compra);
                    System.out.println("Su descuento sera del: " + descuento3 + "%");
                }
            }
        }

    }
}
