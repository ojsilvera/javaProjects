public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // declaramos el tipo de variable y le asignamos el valor que necesitamos
        int edad = 40;
        // imprimimos la variable anteriormente creada llamandola directamente
        // como argumento del metodo println de java para imprimir en pantalla
        System.out.println(edad);
        // como el tipo de dato de edad ya fue declarado antes solo le reasignamos el
        // valor
        // y reimprimimos su valor
        edad = 55;
        System.out.println(edad);

        // podemos asignar valores aritmeticos
        edad = 19 + 21;
        System.out.println(edad);

        // concatenamos con el signo +
        System.out.println("mi edad es: " + edad + " Anos");

        // double para decimales y es posible asignar un valor entero al double
        // pero estariamos asignando mas espacio de memoria que el requerido
        // el double es usado en operaciones que arrojen decimales como resultado
        // si ejecutamos una operacion que de reultado decima, java redondea y muestra
        // solo un entero

        double peso = 110.5;
        double pesoObjetivo = 110.5 - 20;

        // los imprimo en la consola
        System.out.println("mi peso actual es: " + peso + "Kg");
        System.out.println("mi peso objetivo es: " + pesoObjetivo + "Kg");

        // coversion de datos para compatibilizarlos entre ellos
        // coloco (que tipo de datos quiero forzar) la variable que deseo forzar
        // se le conoce como cast en java
        // solo tomara la parte entera pero seraun entero no un decimal

        int pesoEntero = (int) pesoObjetivo;
        System.out.println(pesoEntero);

        // para numeros mayores a 2^31 tantopositivos como negativos se usa
        // el tipo de variable long 122222222L
        // para numeros pequeños short o byte
        // decimales pequeños float 0.25F

    }
}
