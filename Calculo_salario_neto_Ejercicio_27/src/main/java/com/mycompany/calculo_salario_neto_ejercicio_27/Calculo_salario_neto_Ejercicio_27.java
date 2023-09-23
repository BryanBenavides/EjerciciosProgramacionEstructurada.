package com.mycompany.calculo_salario_neto_ejercicio_27;

import java.util.Scanner;

public class Calculo_salario_neto_Ejercicio_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            System.out.println("Ingrese el salario anual del empleado en C$:");
            double salarioAnual = scanner.nextDouble();

            System.out.println("Ingrese los años de antigüedad del empleado:");
            int anosAntiguedad = scanner.nextInt();

            double porcentajeAntiguedad = 0.0;
            if (anosAntiguedad == 1) {
                porcentajeAntiguedad = 3.0;
            } else if (anosAntiguedad >= 2 && anosAntiguedad <= 20) {
                porcentajeAntiguedad = (anosAntiguedad * 2 + 1);
            } else if (anosAntiguedad >= 21 && anosAntiguedad <= 30) {
                porcentajeAntiguedad = 50.0;
            }

            double tasaImpuesto = 0.0;
            if (salarioAnual <= 100000.0) {
                tasaImpuesto = 0.0;
            } else if (salarioAnual <= 200000.0) {
                tasaImpuesto = 0.15;
            } else if (salarioAnual <= 350000.0) {
                tasaImpuesto = 0.20;
            } else if (salarioAnual <= 500000.0) {
                tasaImpuesto = 0.25;
            } else {
                tasaImpuesto = 0.30;
            }

            double salarioBruto = salarioAnual / 12;
            double impuesto = salarioBruto * tasaImpuesto;
            double salarioNeto = salarioBruto - impuesto;

            salarioNeto += (salarioNeto * (porcentajeAntiguedad / 100));

            System.out.println("Salario Bruto Mensual: C$" + salarioBruto);
            System.out.println("Impuesto Mensual: C$" + impuesto);
            System.out.println("Salario Neto Mensual: C$" + salarioNeto);

            intentos++;

            if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            }

            System.out.println("¿Desea realizar otro cálculo? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}
