package com.mycompany.programa_del_registro_de_kilometraje_ejercicio_14;

import java.util.Scanner;

public class Programa_del_registro_de_kilometraje_Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Registro de Kilometraje");
        System.out.println("Ingrese los datos de cada viaje (kilómetros y litros), o -1 para salir.");

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("\nIntento #" + intento);

            int viaje = 1;
            boolean intentoFallido = false;

            while (true) {
                System.out.println("\nViaje #" + viaje);

                System.out.print("Kilómetros conducidos (ingrese -1 para salir): ");
                int kilometros = scanner.nextInt();

                if (kilometros == -1) {
                    break;
                }

                if (kilometros < 0) {
                    System.out.println("Error: Los kilómetros deben ser mayores o iguales a cero. Intente de nuevo.");
                    intentoFallido = true;
                    break;
                }

                System.out.print("Litros usados: ");
                int litros = scanner.nextInt();

                if (litros <= 0) {
                    System.out.println("Error: Los litros usados deben ser mayores que cero. Intente de nuevo.");
                    intentoFallido = true;
                    break;
                }

                double kilometrosPorLitro = (double) kilometros / litros;

                System.out.println("Kilómetros por litro en este viaje: " + kilometrosPorLitro);

                totalKilometros += kilometros;
                totalLitros += litros;

                double kilometrosPorLitroTotal = (double) totalKilometros / totalLitros;

                System.out.println("Kilómetros por litro acumulados: " + kilometrosPorLitroTotal);

                viaje++;
            }

            if (!intentoFallido) {
                System.out.println("\n¡Registro de Kilometraje finalizado!");
                scanner.close();
                return;
            } else if (intento < 3) {
                System.out.println("Uno o más intentos fallidos. Reiniciando...");
            }
        }

        System.out.println("\nSe han agotado los intentos. ¡Adiós!");
        scanner.close();
    }
}
