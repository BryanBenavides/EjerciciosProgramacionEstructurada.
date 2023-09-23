package com.mycompany.tienda_de_electrodomesticos;

import java.util.Scanner;

public class Tienda_de_electrodomesticos_Ejercicio_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximoIntentos = 3;

        for (int intento = 1; intento <= maximoIntentos; intento++) {
            System.out.println("\nIntento #" + intento);

            System.out.print("Ingrese el número de cuenta: ");
            int numeroCuenta = input.nextInt();

            System.out.print("Ingrese el saldo al inicio del mes: ");
            int saldoInicial = input.nextInt();

            System.out.print("Ingrese el total de cargos del cliente en el mes: ");
            int totalCargos = input.nextInt();

            System.out.print("Ingrese el total de créditos aplicados a la cuenta en el mes: ");
            int totalCreditos = input.nextInt();

            System.out.print("Ingrese el límite de crédito permitido: ");
            int limiteCredito = input.nextInt();

            int nuevoSaldo = saldoInicial + totalCargos - totalCreditos;

            System.out.println("Nuevo saldo: " + nuevoSaldo);

            if (nuevoSaldo > limiteCredito) {
                System.out.println("Se excedió el límite de su crédito.");
                if (intento < maximoIntentos) {
                    System.out.println("Uno o más intentos con datos inválidos. Reiniciando...");
                }
            } else {
                System.out.println("\nProceso completado.");
                input.close();
                return;
            }
        }

        System.out.println("\nSe han agotado los intentos. ¡Adiós!");
        input.close();
    }
}

