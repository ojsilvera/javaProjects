public class Pila {
    public static void main(String[] args) throws Exception {

        try {

            double result = 15 / 0;

            System.out.println(result);

        } catch (Exception e) {

            System.err.println(e.getMessage());

            System.err.println(e.getCause());
        }

    }
}
