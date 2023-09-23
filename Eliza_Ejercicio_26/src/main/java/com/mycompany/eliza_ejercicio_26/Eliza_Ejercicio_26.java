package com.mycompany.eliza_ejercicio_26;

import java.util.Scanner;
import java.util.Random;

public class Eliza_Ejercicio_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hola, soy Eliza. Puedes comenzar a hablar conmigo. Escribe 'Adiós' para salir.");
        
        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("adiós")) {
                System.out.println("Hasta luego. ¡Adiós!");
                break;
            } else if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            } else if (input.contains("mi")) {
                String response = input.replace("mi", "su");
                System.out.println("Cuénteme más sobre " + response);
            } else if (input.contains("amor") || input.contains("odio")) {
                System.out.println("Parece que tiene fuertes sentimientos al respecto.");
            } else {
                int randomNumber = random.nextInt(3);
                switch (randomNumber) {
                    case 0:
                        System.out.println("Continúe.");
                        break;
                    case 1:
                        System.out.println("Dígame más.");
                        break;
                    case 2:
                        System.out.println("Continúe.");
                        break;
                }
            }

            intentos++;
        }

        scanner.close();
    }
}
