package com.mycompany.factorizacion_de_enteros_ejercicio_31;

import java.util.Scanner;

public class Factorizacion_de_enteros_ejercicio_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            System.out.print("Ingrese un número entero positivo grande: ");
            long numero = scanner.nextLong();

            if (numero <= 1) {
                System.out.println("El número debe ser mayor que 1.");
            } else {
                System.out.print("Factores primos de " + numero + ": ");
                factorizarYMostrar(numero);
            }

            intentos++;

            if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            }

            System.out.println("¿Desea factorizar otro número? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }

    public static void factorizarYMostrar(long numero) {
        for (long i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        System.out.println();
    }
}
