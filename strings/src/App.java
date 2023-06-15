public class App {
    public static void main(String[] args) throws Exception {
        // probando el trabajo con cadenas de texto
        // char solo almacena un solo caracter o numero(hace ref a la la codificacion
        // ascii) y no puede estar vacio.
        // se utilizan '' comillas simples

        char letra = 'a';
        System.out.println(letra);

        // el resultado corresponde a un caracter de la trabla ascii
        letra = 65 + 1;
        System.out.println(letra);

        // al realizar una operacion entre un char y un entero, el entero debe
        // convertirse a char
        // ya que por defecto java convierte toda la operasion al tipo de dato mas
        // grande
        char letra2 = (char) (letra + 1);
        System.out.println(letra2);

        // para frases completas

        String palabra = "En busqueda de trabajo xd";
        System.out.println(palabra + letra2);

        // ejemplo de concatenacion

        String saludo = "Hola, mi nombre es ";
        String nombre = "Rómulo ";
        String continuacion = "y mi edad es ";
        int edad = 100;
        System.out.println(saludo + nombre + continuacion + edad);

    }
}
