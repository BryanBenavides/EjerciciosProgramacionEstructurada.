package com.mycompany.admision_de_personas_en_una_disco_ejercicio_1;

import java.util.Scanner;

public class Admision_de_personas_en_una_disco_Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 18) {
                System.out.println("Lo siento, eres menor de 18 años. No puedes acceder al programa.");
            } else {
                System.out.print("Ingrese su género (M/F): ");
                char genero = scanner.next().charAt(0);

                if (edad >= 18 && genero == 'F') {
                    if (edad >= 20) {
                        System.out.println("Bienvenida. Puedes entrar y consumir bebidas alcohólicas.");
                    } else {
                        System.out.println("Bienvenida. Puedes entrar, pero no puedes consumir bebidas alcohólicas.");
                    }
                } else if (edad >= 18 && genero == 'M') {
                    System.out.print("¿Portas armas? (Sí/No): ");
                    String portaArmas = scanner.next();

                    if (portaArmas.equalsIgnoreCase("Sí")) {
                        System.out.println("Lo siento, no puedes entrar debido a que portas armas.");
                    } else {
                        if (edad >= 20) {
                            System.out.println("Bienvenido. Puedes entrar y consumir bebidas alcohólicas.");
                        } else {
                            System.out.println("Bienvenido. Puedes entrar, pero no puedes consumir bebidas alcohólicas.");
                        }
                    }
                } else {
                    System.out.println("Género no válido.");
                }
                break; // Sale del bucle while si las condiciones son válidas.
            }

            intentos--;
            if (intentos > 0) {
                System.out.println("Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("Has agotado tus intentos.");
            }
        }

        scanner.close();
    }
}


