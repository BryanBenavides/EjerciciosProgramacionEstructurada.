package com.mycompany.clasificacion_de_triangulos_ejercicio_2;

import java.util.Scanner;

public class Clasificacion_de_Triangulos_Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Ingrese la longitud de los tres lados del triángulo:");

            System.out.print("Lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Lado 3: ");
            double lado3 = scanner.nextDouble();

            if (esTrianguloValido(lado1, lado2, lado3)) {

                String tipoTriangulo = clasificarTriangulo(lado1, lado2, lado3);
                System.out.println("Es un triángulo " + tipoTriangulo);
                break;
            } else {
                System.out.println("No es un triángulo válido.");
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

    public static boolean esTrianguloValido(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public static String clasificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero"; 
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles"; 
        } else {
            return "escaleno";
        }
    }
}