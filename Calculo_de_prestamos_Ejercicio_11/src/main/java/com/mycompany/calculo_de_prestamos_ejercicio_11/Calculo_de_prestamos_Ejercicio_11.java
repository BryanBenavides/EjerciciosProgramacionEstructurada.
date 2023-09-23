package com.mycompany.calculo_de_prestamos_ejercicio_11;

import java.util.Scanner;

public class Calculo_de_prestamos_Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el monto del préstamo: ");
            double montoPrestamo = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
            double tasaInteresAnual = scanner.nextDouble() / 100;

            System.out.print("Ingrese el pago mensual: ");
            double pagoMensual = scanner.nextDouble();

            double saldoRestante = montoPrestamo;
            int numeroMeses = 0;

            while (saldoRestante > 0) {
                double interesMensual = saldoRestante * (tasaInteresAnual / 12);
                double pagoAlCapital = pagoMensual - interesMensual;

                if (pagoMensual <= interesMensual) {
                    System.out.println("El pago mensual es demasiado bajo. No se podrá liquidar el préstamo.");
                    break;
                }

                saldoRestante -= pagoAlCapital;
                numeroMeses++;

                if (saldoRestante < 0) {
                    saldoRestante = 0;
                }
            }

            System.out.println("Número de meses para pagar el préstamo: " + numeroMeses);
            break;
        }

        scanner.close();
    }
}
