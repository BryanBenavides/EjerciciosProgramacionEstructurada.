package com.mycompany.calculo_de_grasa_corporal_ejercicio_10;

import java.util.Scanner;

public class Calculo_de_grasa_corporal_Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese su género (H para hombres, M para mujeres): ");
            char genero = scanner.next().charAt(0);

            if (genero == 'H' || genero == 'h') {
                calcularGrasaCorporalHombres(scanner);
                break;
            } else if (genero == 'M' || genero == 'm') {
                calcularGrasaCorporalMujeres(scanner);
                break;
            } else {
                System.out.println("Género no válido.");
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

    public static void calcularGrasaCorporalHombres(Scanner scanner) {
        System.out.print("Ingrese su peso corporal en kilogramos: ");
        double pesoCorporal = scanner.nextDouble();

        System.out.print("Ingrese la medida de su cintura en centímetros: ");
        double medidaCintura = scanner.nextDouble();

        double a1 = (pesoCorporal * 1.082) + 94.42;
        double a2 = medidaCintura * 4.15;
        double b = a1 - a2;
        double grasaCorporal = pesoCorporal - b;
        double porcentajeGrasaCorporal = (grasaCorporal / pesoCorporal) * 100;

        System.out.println("Su grasa corporal es: " + grasaCorporal + " kilogramos");
        System.out.println("Su porcentaje de grasa corporal es: " + porcentajeGrasaCorporal + "%");
    }

    public static void calcularGrasaCorporalMujeres(Scanner scanner) {
        System.out.print("Ingrese su peso corporal en kilogramos: ");
        double pesoCorporal = scanner.nextDouble();

        System.out.print("Ingrese la medida de su muñeca en centímetros (en el punto más amplio): ");
        double medidaMuneca = scanner.nextDouble();

        System.out.print("Ingrese la medida de su cintura en centímetros (en el ombligo): ");
        double medidaCintura = scanner.nextDouble();

        System.out.print("Ingrese la medida de su cadera en centímetros (en el punto más amplio): ");
        double medidaCadera = scanner.nextDouble();

        System.out.print("Ingrese la medida de su antebrazo en centímetros (en el punto más amplio): ");
        double medidaAntebrazo = scanner.nextDouble();

        double a1 = (pesoCorporal * 0.732) + 8.987;
        double a2 = medidaMuneca / 3.140;
        double a3 = medidaCintura * 0.157;
        double a4 = medidaCadera * 0.249;
        double a5 = medidaAntebrazo * 0.434;
        double b = a1 + a2 - a3 - a4 + a5;
        double grasaCorporal = pesoCorporal - b;
        double porcentajeGrasaCorporal = (grasaCorporal / pesoCorporal) * 100;

        System.out.println("Su grasa corporal es: " + grasaCorporal + " kilogramos");
        System.out.println("Su porcentaje de grasa corporal es: " + porcentajeGrasaCorporal + "%");
    }
}
