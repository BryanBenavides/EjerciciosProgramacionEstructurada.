package com.mycompany.adivinador_de_numeros_ejercicio_22;

import java.util.Random;
import java.util.Scanner;

public class Adivinador_de_numeros_Ejercicio_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char jugarDeNuevo;
        int maximoIntentos = 3;

        do {
            int numeroAdivinar = random.nextInt(50) + 1;
            int intentos = 0;
            boolean adivino = false;

            System.out.println("Adivine un número entre 1 y 50.");

            while (intentos < maximoIntentos) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                int intento = input.nextInt();

                if (intento == numeroAdivinar) {
                    adivino = true;
                    System.out.println("Felicidades. ¡Adivinó el número!");
                    break;
                } else if (intento < numeroAdivinar) {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                } else {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                }

                intentos++;
            }

            if (!adivino) {
                System.out.println("Se agotaron los intentos. El número correcto era: " + numeroAdivinar);
            }

            System.out.print("¿Desea jugar de nuevo? (S/N): ");
            jugarDeNuevo = input.next().charAt(0);

        } while (jugarDeNuevo == 'S' || jugarDeNuevo == 's');

        System.out.println("¡Gracias por jugar!");
        input.close();
    }
}
