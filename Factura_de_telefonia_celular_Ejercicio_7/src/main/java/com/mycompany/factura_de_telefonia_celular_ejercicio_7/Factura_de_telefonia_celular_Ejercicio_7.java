package com.mycompany.factura_de_telefonia_celular_ejercicio_7;

import java.util.Scanner;

public class Factura_de_telefonia_celular_Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Bienvenido a la compañía de telefonía celular.");
            System.out.print("Ingrese el número de cuenta: ");
            int numeroCuenta = scanner.nextInt();

            System.out.print("Ingrese el tipo de servicio (R para Regular, P para Premium): ");
            char tipoServicio = scanner.next().charAt(0);

            double costoTotal = 0.0;

            if (tipoServicio == 'R' || tipoServicio == 'r') {
                System.out.print("Ingrese la cantidad de minutos utilizados: ");
                int minutos = scanner.nextInt();

                if (minutos <= 50) {
                    costoTotal = 10.0; // Tarifa base
                } else {
                    costoTotal = 10.0 + 0.20 * (minutos - 50); // Tarifa base + cargo adicional por minutos extra
                }
            } else if (tipoServicio == 'P' || tipoServicio == 'p') {
                System.out.print("Ingrese la cantidad de minutos diurnos utilizados: ");
                int minutosDiurnos = scanner.nextInt();

                System.out.print("Ingrese la cantidad de minutos nocturnos utilizados: ");
                int minutosNocturnos = scanner.nextInt();

                if (minutosDiurnos <= 75) {
                    costoTotal += 25.0; // Tarifa base diurna
                } else {
                    costoTotal += 25.0 + 0.10 * (minutosDiurnos - 75); // Tarifa base diurna + cargo adicional por minutos extra
                }

                if (minutosNocturnos <= 100) {
                    costoTotal += 0.0; // Tarifa base nocturna (primeros 100 minutos son gratis)
                } else {
                    costoTotal += 0.05 * (minutosNocturnos - 100); // Cargo adicional por minutos extra nocturnos
                }
            } else {
                System.out.println("Tipo de servicio no válido. Por favor, ingrese R o P.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos.");
                }
                continue;
            }

            
            System.out.println("\nNúmero de cuenta: " + numeroCuenta);
            System.out.println("Tipo de servicio: " + (tipoServicio == 'R' || tipoServicio == 'r' ? "Regular" : "Premium"));
            int minutosDiurnos = 0;
            String minutosDiurnosStr = (tipoServicio == 'R' || tipoServicio == 'r') ? "N/A" : Integer.toString(minutosDiurnos);
            int minutosNocturnos = 0;
            String minutosNocturnosStr = (tipoServicio == 'R' || tipoServicio == 'r') ? "N/A" : Integer.toString(minutosNocturnos);
            System.out.println("Minutos utilizados: Diurnos: " + minutosDiurnosStr + ", Nocturnos: " + minutosNocturnosStr);
            System.out.println("Costo total: $" + costoTotal);
            break; // Sale del bucle while si se ingresan valores válidos.
        }

        scanner.close();
    }
}