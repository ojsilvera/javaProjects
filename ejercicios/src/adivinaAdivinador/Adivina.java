package adivinaAdivinador;

import java.util.Scanner;

public class Adivina {

    private int numeroInterno;

    public void adivinar(int miNumero) {

        // evalua si es el numero

        if (miNumero == numeroInterno) {

            System.out.println("el numero magico es: " + miNumero);

        } else {

            entregaPista(miNumero, numeroInterno);
        }

    }

    public void iniciar() {

        // Math.floor(Math.random() * (MAX - MIN + 1)) + MIN; genera aleatorio entre 0 y
        // 100
        this.numeroInterno = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 0;
        solicitar();

    }

    public void solicitar() {

        // primer pedido de numero
        try (Scanner dato = new Scanner(System.in);) {
            System.out.println("Digite numero: ");
            int miNumero = dato.nextInt();
            // llamamos a adivinar
            adivinar(miNumero);
        } catch (Exception e) {

            e.getCause();
        }

    }

    public void entregaPista(int miNumero, int numeroInterno) {

        if (miNumero > numeroInterno) {

            System.out.println("El numero magico es menor que el digitado");

        } else {

            System.out.println("El numero magico es mayor que el digitado");
        }

        solicitar();

    }

}
