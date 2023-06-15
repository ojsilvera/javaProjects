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
    }
}
