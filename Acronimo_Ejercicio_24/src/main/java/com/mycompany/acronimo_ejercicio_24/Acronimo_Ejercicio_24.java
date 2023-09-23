package com.mycompany.acronimo_ejercicio_24;

import java.util.Scanner;

public class Acronimo_Ejercicio_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.println("Ingrese tres palabras para generar un acrónimo de tres letras:");
            String input = scanner.nextLine();

            String[] palabras = input.split(" ");

            String acronimo = "";

            for (String palabra : palabras) {
                if (acronimo.length() >= 3) {
                    break;
                }

                acronimo += palabra.charAt(0);
            }
            
            acronimo = acronimo.toUpperCase();

            System.out.println("El acrónimo de tres letras es: " + acronimo);

            intentos++;

            if (intentos < maxIntentos) {
                System.out.println("¿Desea intentarlo de nuevo? (S/N): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Ha alcanzado el número máximo de intentos.");
        }

        scanner.close();
    }
}
