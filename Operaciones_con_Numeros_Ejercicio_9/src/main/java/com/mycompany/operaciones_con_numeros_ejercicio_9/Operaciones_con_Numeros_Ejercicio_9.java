package com.mycompany.operaciones_con_numeros_ejercicio_9;

import java.util.Scanner;

public class Operaciones_con_Numeros_Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el primer entero (menor): ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo entero (mayor): ");
            int num2 = scanner.nextInt();

            if (num1 >= num2) {
                System.out.println("El primer número debe ser menor que el segundo. Por favor, inténtelo de nuevo.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos.");
                }
                continue;
            }

            int sumaPares = 0;
            int sumaCuadradosImpares = 0;

            System.out.println("Números impares entre " + num1 + " y " + num2 + ":");
            while (num1 <= num2) {
                if (num1 % 2 != 0) {
                    System.out.print(num1 + " ");
                    sumaCuadradosImpares += num1 * num1;
                } else {
                    sumaPares += num1;
                }

                System.out.println(num1 + " - Cuadrado: " + (num1 * num1));

                num1++;
            }

            System.out.println("\nSuma de los números pares: " + sumaPares);
            System.out.println("Suma de los cuadrados de los números impares: " + sumaCuadradosImpares);

            System.out.println("\nNúmeros perfectos entre " + num1 + " y " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                if (esNumeroPerfecto(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nNúmeros primos entre " + num1 + " y " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                if (esNumeroPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
            break; // Sale del bucle while si se ingresan valores válidos.
        }

        scanner.close();
    }

    public static boolean esNumeroPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }

    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
