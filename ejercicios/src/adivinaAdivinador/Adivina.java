package adivinaAdivinador;

import java.util.Scanner;

public class Adivina {

    private int pInferior;
    private int pSuperior;
    private int numeroInterno;

    public void adivinar(int miNumero) {

        // evalua si es el numero

        if (miNumero == numeroInterno) {

            meHasPillado(numeroInterno);

        } else {

            entregaPista(miNumero, numeroInterno);
        }

    }

    public void generar() {

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

            this.pSuperior = numeroInterno;
            this.pInferior = miNumero - numeroInterno;

        } else {

            this.pSuperior = numeroInterno - miNumero;
            this.pInferior = numeroInterno;
        }

        System.out.println("El numero esta entre: " + pInferior + " y " + pSuperior);

        solicitar();

    }

    public void meHasPillado(int miNumero) {

        System.out.println("el numero secreto es: " + miNumero);

    }

}
