package adivinaAdivinador;

import java.util.Scanner;

public class Adivina {

    private double pInferior;
    private double pSuperior;

    // Math.floor(Math.random() * (MAX - MIN + 1)) + MIN; genera aleatorio entre 0 y
    // 100
    static double numeroInterno = Math.floor(Math.random() * (100 - 0 + 1)) + 0;

    public void adivinar(double miNumero) {

        // evalua si es el numero
        while (miNumero != numeroInterno) {

            entregaPista(miNumero);

        }

        meHasPillado(miNumero);

    }

    public void solicitar() {

        // primer pedido de numero
        try (Scanner dato = new Scanner(System.in);) {
            System.out.println("Digite numero: ");
            double miNumero = dato.nextDouble();
            // llamamos a adivinar
            adivinar(miNumero);
        } catch (Exception e) {

            e.getCause();
        }

    }

    public void entregaPista(double miNumero) {

        if (miNumero - 50 < 0) {

            this.pInferior = 0;

        } else {

            this.pInferior = miNumero - 50;
        }

        if (miNumero + 50 > 100) {

            this.pSuperior = 100;

        } else {

            this.pSuperior = miNumero + 50;
        }

        System.out.println("El numero esta entre: " + pInferior + " y " + pSuperior);

        solicitar();

    }

    public void meHasPillado(double miNumero) {

        System.out.println("el numero secreto es: " + miNumero);

    }

}
