package com.mycompany.programa_de_cuentas_banpro_ejercicio_6;

import java.util.Scanner;

public class Programa_de_cuentas_Banpro_Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int intentos = 3;

            while (intentos > 0) {
                System.out.println("Ingrese los datos de la cuenta " + i + ":");
                System.out.print("Número de cuenta: ");
                int numeroCuenta = scanner.nextInt();

                System.out.print("Tipo de cuenta (S para ahorros, C para cheques): ");
                char tipoCuenta = scanner.next().charAt(0);

                System.out.print("Saldo mínimo requerido: ");
                double saldoMinimo = scanner.nextDouble();

                System.out.print("Saldo actual: ");
                double saldoActual = scanner.nextDouble();

                double saldoNuevo = saldoActual;

                if (tipoCuenta == 'S' || tipoCuenta == 's') {
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoActual - 10;
                    } else {
                        saldoNuevo = saldoActual + (saldoActual * 0.04);
                    }
                } else if (tipoCuenta == 'C' || tipoCuenta == 'c') {
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoActual - 25;
                    } else if (saldoActual <= saldoMinimo + 5000) {
                        saldoNuevo = saldoActual + (saldoActual * 0.03);
                    } else {
                        saldoNuevo = saldoActual + (saldoActual * 0.05);
                    }
                } else {
                    System.out.println("Tipo de cuenta no válido.");
                    intentos--;

                    if (intentos > 0) {
                        System.out.println("Te quedan " + intentos + " intentos.");
                    } else {
                        System.out.println("Has agotado tus intentos.");
                    }
                    continue;
                }

                System.out.println("Número de cuenta: " + numeroCuenta);
                System.out.println("Tipo de cuenta: " + tipoCuenta);
                System.out.println("Saldo actual: U$" + saldoActual);
                System.out.println("Saldo nuevo: U$" + saldoNuevo);
                break; // Sale del bucle while si se ingresan valores válidos.
            }
        }

        scanner.close();
    }
}