public class App {
    public static void main(String[] args) throws Exception {

        // declaramos un array con 5 posiciones
        int[] edades = new int[5];

        // Asignamos un valor a la posicion 2 del array edades
        edades[0] = 50;
        edades[1] = 30;
        edades[2] = 20;
        edades[3] = 3;
        edades[4] = 1;

        // recuperando el valor guardado
        System.out.println(edades[2]);

        // entrega el valor alojado en el indice 0
        System.out.println(edades[0]);

        // obtener el valor del elemento en la posicion 5
        System.out.println(edades[4]);

    }
}
