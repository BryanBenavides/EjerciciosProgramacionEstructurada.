package com.mycompany.calculo_del_cargo_del_parqueo_ejercicio_19;

import java.util.Scanner;

public class Calculo_del_cargo_del_parqueo_Ejercicio_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cuotaMinima = 2.00;
        double cuotaAdicionalPorHora = 0.50;
        double cargoMaximoPorDia = 10.00;

        double totalRecibos = 0.0;
        int maximoIntentos = 3;

        for (int intento = 1; intento <= maximoIntentos; intento++) {
            System.out.println("\nIntento #" + intento);

            System.out.print("Ingrese la cantidad de clientes estacionados hoy: ");
            int cantidadClientes = input.nextInt();

            boolean datosValidos = true;

            for (int i = 1; i <= cantidadClientes; i++) {
                System.out.print("Cliente #" + i + ": Ingrese las horas estacionadas: ");
                double horasEstacionadas = input.nextDouble();

                if (horasEstacionadas < 0) {
                    System.out.println("Error: Las horas estacionadas deben ser mayores o iguales a cero. Intente de nuevo.");
                    datosValidos = false;
                    break;
                }

                double cargoCliente = calcularCargo(horasEstacionadas, cuotaMinima, cuotaAdicionalPorHora, cargoMaximoPorDia);
                totalRecibos += cargoCliente;

                System.out.println("Cargo para el Cliente #" + i + ": C$" + cargoCliente);
            }

            if (datosValidos) {
                System.out.println("\nProceso completado.");
                input.close();
                return;
            } else if (intento < maximoIntentos) {
                System.out.println("Uno o más intentos con datos inválidos. Reiniciando...");
            }
        }

        System.out.println("\nSe han agotado los intentos. ¡Adiós!");
        input.close();
    }

    public static double calcularCargo(double horasEstacionadas, double cuotaMinima, double cuotaAdicionalPorHora, double cargoMaximoPorDia) {
        if (horasEstacionadas <= 3) {
            return cuotaMinima;
        } else {
            double cargo = cuotaMinima + (horasEstacionadas - 3) * cuotaAdicionalPorHora;
            return (cargo > cargoMaximoPorDia) ? cargoMaximoPorDia : cargo;
        }
    }
}
