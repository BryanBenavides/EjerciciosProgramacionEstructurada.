package com.mycompany.almacenamiento_de_rosquillas_ejercicio_3;

import java.util.Scanner;

public class Almacenamiento_de_rosquillas_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el número total de rosquillas: ");
            int numRosquillas = scanner.nextInt();

            if (numRosquillas >= 0) {
                int rosquillasPorCaja = 24;
                int cajasPorContenedor = 75;
                int rosquillasPorContenedor = rosquillasPorCaja * cajasPorContenedor;

                int contenedoresNecesarios = numRosquillas / rosquillasPorContenedor;
                int cajasNecesarias = (numRosquillas % rosquillasPorContenedor) / rosquillasPorCaja;
                int rosquillasSobrantes = numRosquillas % rosquillasPorCaja;

                System.out.println("Número de contenedores necesarios: " + contenedoresNecesarios);
                System.out.println("Número de cajas necesarias: " + cajasNecesarias);
                System.out.println("Número de rosquillas sobrantes: " + rosquillasSobrantes);
                break;
            } else {
                System.out.println("El número de rosquillas debe ser no negativo.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos.");
                }
            }
        }

        scanner.close();
    }
}
