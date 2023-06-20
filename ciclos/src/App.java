public class App {
    public static void main(String[] args) throws Exception {
        // Los ciclos en java ejemplo imprimir los numeros del 1 - 10
        int numero = 0; // inicializamos la variable

        System.out.println("Contar del 1 al 10");

        while (numero <= 10) {

            System.out.println(numero);
            // incrementamos el valo de la valiable para alcanzar le tope de la condicion
            numero = numero + 1;
            // numero++; -> otra forma de expresar el incremento en 1 unidad del contador
            // numero += # de incremento, numero += 1, otra manera de expresar incremento
        }

        // hallar la suma de los numeros del 1 - 10 mostrando todas las sumas

        int contador = 0; // inicializamos la variable contador
        int suma = 0; // inicializamos la variable suma

        System.out.println("muestra la suma de los numeros del 1 al 10");

        while (contador <= 10) {

            suma = suma + contador;
            System.out.println("paso: " + contador + " " + "suma: " + suma);
            // incrementamos el valo de la valiable para alcanzar le tope de la condicion.
            // suma lod dos que son el resultado anterior y el nuevo paso.
            contador++;
            // incrementa el paso para moverse por los numero, en incremento de +1.

        }

        // hallar la suma de los numeros del 1 - 10 mostrando la suma total
        int paso = 0; // inicializamos la variable paso
        int total = 0; // inicializamos la variable suma

        System.out.println("muestra la suma total de los numeros del 1 al 10");

        while (paso <= 10) {

            total = total + paso; // suma el numero anterior con el actual
            paso++;
            // incrementa el paso para moverse por los numero, en incremento de +1.
        }

        System.out.println("suma Total: " + total);
        // incrementamos el valo de la valiable para alcanzar le tope de la condicion.
        // suma los dos que son el resultado anterior y el nuevo paso.

        // ciclo for.---------------------------------------------------------
        // contar con ciclo for.
        int contadorF = 0;

        System.out.println("contar del 1 al 10 con ciclo for");

        for (contadorF = 0; contadorF <= 10; ++contadorF) {
            System.out.println(contadorF);
            // nos es necesario incrementar el contador porque el for ya lo lleva implicito
        }

        // sumar los numero del 1 al 10 con ciclo for

        int pasoF = 0;
        int sumaT = 0;

        System.out.println("sumar los numero del 1 al 10 con ciclo for");

        for (pasoF = 0; pasoF <= 10; ++pasoF) {
            sumaT = pasoF + sumaT;
            System.out.println(sumaT);
            // nos es necesario incrementar el contador porque el for ya lo lleva implicito
        }

        // sumar los numero del 1 al 10 con ciclo for y solo mostrar uñtimo resultado

        int pasoFT = 0;
        int sumaTF = 0;

        System.out.println("mostrar el resultado final de la suma de los enteros del 1..10");

        for (pasoFT = 0; pasoFT <= 10; ++pasoFT) {
            sumaTF = pasoFT + sumaTF;
            // nos es necesario incrementar el contador porque el for ya lo lleva implicito
        }

        System.out.println(sumaTF);
    }
}
