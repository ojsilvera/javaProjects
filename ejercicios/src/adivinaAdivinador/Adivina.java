package adivinaAdivinador;

import java.util.Scanner;

public class Adivina {

    private double pInferior;

    public void adivinar(int miNumero) {

        // Math.floor(Math.random() * (MAX - MIN + 1)) + MIN; genera aleatorio entre 0 y
        // 100
        double numeroInterno = Math.floor(Math.random() * (100 - 0 + 1)) + 0;

        // evalua si es el numero
        while (miNumero != numeroInterno) {
            entregaPista(numeroInterno);
        }

        solicitar();

    }

    public void solicitar() {

        // primer pedido de numero
        Scanner dato = new Scanner(System.in);
        System.out.println("Digite numero: ");
        int miNumero = dato.nextInt();
        dato.close();

        // lamamos a adivinar
        adivinar(miNumero);

    }

    public void entregaPista(double numeroInterno) {

        if (numeroInterno - 50 < 0) {

            this.pInferior = 0;

        } else {

            this.pInferior = numeroInterno - 50;
        }

        System.out.println("El numero esta entre: " + pInferior);

        solicitar();

    }

}
