package com.mycompany.programa_de_loteria_ejercicio_28;

import java.util.Random;
import java.util.Scanner;

public class Programa_de_loteria_Ejercicio_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            int[] numerosAleatorios = new int[3];
            int[] numerosUsuario = new int[3];

            for (int i = 0; i < 3; i++) {
                numerosAleatorios[i] = random.nextInt(10);
            }

            System.out.println("¡Bienvenido al juego de lotería!");
            System.out.println("Adivina tres números entre 0 y 9 (sin repetirlos):");

            for (int i = 0; i < 3; i++) {
                while (true) {
                    System.out.print("Ingrese el número #" + (i + 1) + ": ");
                    int numero = scanner.nextInt();
                    if (numero >= 0 && numero <= 9) {
                        boolean repetido = false;
                        for (int j = 0; j < i; j++) {
                            if (numero == numerosUsuario[j]) {
                                repetido = true;
                                break;
                            }
                        }
                        if (!repetido) {
                            numerosUsuario[i] = numero;
                            break;
                        } else {
                            System.out.println("El número ya ha sido ingresado. Inténtelo de nuevo.");
                        }
                    } else {
                        System.out.println("Número fuera de rango. Inténtelo de nuevo.");
                    }
                }
            }

            int coincidencias = 0;
            for (int i = 0; i < 3; i++) {
                if (numerosUsuario[i] == numerosAleatorios[i]) {
                    coincidencias++;
                }
            }

            int premio = 0;
            if (coincidencias == 0) {
                premio = 0;
            } else if (coincidencias == 1) {
                premio = 100;
            } else if (coincidencias == 2) {
                premio = 1000;
            } else if (coincidencias == 3) {
                premio = 1000000;
            }

            System.out.println("Números aleatorios: " + numerosAleatorios[0] + ", " + numerosAleatorios[1] + ", " + numerosAleatorios[2]);
            System.out.println("Tus números: " + numerosUsuario[0] + ", " + numerosUsuario[1] + ", " + numerosUsuario[2]);
            System.out.println("Coincidencias: " + coincidencias);
            System.out.println("Premio: C$" + premio);

            intentos++;

            if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            }

            System.out.println("¿Desea jugar de nuevo? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}
