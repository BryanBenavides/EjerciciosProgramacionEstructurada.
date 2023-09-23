package com.mycompany.costo_del_enmarcado_de_una_fotografia_ejercicio_8;

import java.util.Scanner;

public class Costo_del_enmarcado_de_una_fotografia_Ejercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
            double longitud = scanner.nextDouble();

            System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
            double ancho = scanner.nextDouble();
            double area = longitud * ancho;

            System.out.print("Ingrese el tipo de marco (Regular o Lujoso): ");
            String tipoMarco = scanner.next();

            double costoMarco;
            if (tipoMarco.equalsIgnoreCase("Regular")) {
                costoMarco = area * 0.15;
            } else if (tipoMarco.equalsIgnoreCase("Lujoso")) {
                costoMarco = area * 0.25;
            } else {
                System.out.println("Tipo de marco no válido.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos.");
                }
                continue;
            }

            System.out.print("Ingrese el color del marco: ");
            String colorMarco = scanner.next();

            double costoCoronas = 0;
            System.out.print("¿Desea agregar coronas? (Sí/No): ");
            String agregarCoronas = scanner.next();
            if (agregarCoronas.equalsIgnoreCase("Sí")) {
                System.out.print("Ingrese la cantidad de coronas: ");
                int cantidadCoronas = scanner.nextInt();
                costoCoronas = cantidadCoronas * 0.35;
            }

            double costoTotal = costoMarco + costoCoronas;

            System.out.println("Costo total de enmarcado: U$" + costoTotal);
            break; // Sale del bucle while si se ingresan valores válidos.
        }

        scanner.close();
    }
}
