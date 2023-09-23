package com.mycompany.calculo_del_sueldo_de_empleados_ejercicio_15;

import java.util.Scanner;

public class Calculo_del_sueldo_de_empleados_Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximoIntentos = 3;

        for (int intento = 1; intento <= maximoIntentos; intento++) {
            System.out.println("\nIntento #" + intento);

            boolean datosValidos = true;

            for (int empleado = 1; empleado <= 3; empleado++) {
                System.out.println("\nEmpleado #" + empleado);

                System.out.print("Ingrese el número de horas trabajadas: ");
                int horasTrabajadas = scanner.nextInt();
                System.out.print("Ingrese la tarifa por horas en córdobas: ");
                double tarifaPorHoras = scanner.nextDouble();

                if (horasTrabajadas < 0 || tarifaPorHoras < 0) {
                    System.out.println("Error: Los datos ingresados deben ser mayores o iguales a cero.");
                    datosValidos = false;
                    break;
                }

                double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHoras);

                System.out.println("Sueldo bruto: C$" + sueldoBruto);
            }

            if (datosValidos) {
                System.out.println("\n¡Cálculo de sueldos completado!");
                scanner.close();
                return;
            } else if (intento < maximoIntentos) {
                System.out.println("Uno o más intentos con datos inválidos. Reiniciando...");
            }
        }

        System.out.println("\nSe han agotado los intentos. ¡Adiós!");
        scanner.close();
    }

    // Función para calcular el sueldo bruto
    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHoras) {
        double sueldoBruto = 0;

        if (horasTrabajadas <= 40) {
            // Cuota normal para las primeras 40 horas
            sueldoBruto = horasTrabajadas * tarifaPorHoras;
        } else {
            // Cuota normal para las primeras 40 horas
            sueldoBruto = 40 * tarifaPorHoras;

            // Cuota y media para las horas extras
            sueldoBruto += (horasTrabajadas - 40) * (tarifaPorHoras * 1.5);
        }

        return sueldoBruto;
    }
}
