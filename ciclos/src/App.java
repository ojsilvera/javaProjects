public class App {
    public static void main(String[] args) throws Exception {
        // Los ciclos en java ejemplo imprimir los numeros del 1 - 10
        int numero = 0; // inicializamos la variable
        while (numero <= 10) {

            System.out.println(numero);
            // incrementamos el valo de la valiable para alcanzar le tope de la condicion
            numero = numero + 1;
            // numero++; -> otra forma de expresar el incremento en 1 unidad del contador
            // numero += #de incremento, numero += 1, otra manera de expresar incremento
        }

        // hallar la suma de los numeros del 1 - 10 mostrando todas las sumas
        int contador = 0; // inicializamos la variable contador
        int suma = 0; // inicializamos la variable suma

        while (contador <= 10) {

            suma = suma + contador;
            System.out.println("paso: " + contador + " " + "suma: " + suma);
            // incrementamos el valo de la valiable para alcanzar le tope de la condicion.
            // suma lod dos que son el resultado anterior y el nuevo paso.
            contador++;
            // incrementa el paso para moverse por los numero, en incremento de +1.

        }

        // hallar la suma de los numeros del 1 - 10 mostrando todas las sumas
        int paso = 0; // inicializamos la variable paso
        int total = 0; // inicializamos la variable suma

        while (paso <= 10) {

            total = total + paso; // suma el numero anterior con el actual
            paso++;
            // incrementa el paso para moverse por los numero, en incremento de +1.
        }

        System.out.println("suma Total: " + total);
        // incrementamos el valo de la valiable para alcanzar le tope de la condicion.
        // suma los dos que son el resultado anterior y el nuevo paso.
    }
}
