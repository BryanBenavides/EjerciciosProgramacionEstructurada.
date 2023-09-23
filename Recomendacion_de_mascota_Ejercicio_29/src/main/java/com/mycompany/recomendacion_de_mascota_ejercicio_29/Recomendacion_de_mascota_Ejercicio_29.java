package com.mycompany.recomendacion_de_mascota_ejercicio_29;

import java.util.Scanner;

public class Recomendacion_de_mascota_Ejercicio_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            System.out.println("Bienvenido a la aplicación de recomendación de mascotas.");
            System.out.println("Por favor, indique su tipo de residencia:");
            System.out.println("1. Apartamento");
            System.out.println("2. Casa");
            System.out.println("3. Dormitorio");
            int tipoResidencia = scanner.nextInt();

            System.out.println("Ingrese la cantidad de horas que pasa en casa durante el día promedio:");
            int horasEnCasa = scanner.nextInt();

            System.out.println("Seleccione una categoría de horas del siguiente menú:");
            System.out.println("1. 0–5 horas");
            System.out.println("2. 6 o más horas");
            System.out.println("3. 8–9 horas");
            System.out.println("4. 10–17 horas");
            System.out.println("5. 18 o más horas");
            int categoriaHoras = scanner.nextInt();

            String recomendacion = "";

            if (tipoResidencia == 1) { // Apartamento
                if (categoriaHoras >= 2) {
                    recomendacion = "Gato";
                } else {
                    recomendacion = "Hamster";
                }
            } else if (tipoResidencia == 2) { // Casa
                if (categoriaHoras >= 2) {
                    recomendacion = "Perro";
                } else if (categoriaHoras >= 3) {
                    recomendacion = "Perro";
                } else {
                    recomendacion = "Serpiente";
                }
            } else if (tipoResidencia == 3) { // Dormitorio
                if (categoriaHoras >= 1) {
                    recomendacion = "Pez";
                } else {
                    recomendacion = "Granja de hormigas";
                }
            }

            System.out.println("Según su estilo de vida, le recomendamos tener un/a " + recomendacion + ".");
            
            intentos++;

            if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            }

            System.out.println("¿Desea hacer otra recomendación? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}
