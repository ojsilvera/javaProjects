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
    }
}
