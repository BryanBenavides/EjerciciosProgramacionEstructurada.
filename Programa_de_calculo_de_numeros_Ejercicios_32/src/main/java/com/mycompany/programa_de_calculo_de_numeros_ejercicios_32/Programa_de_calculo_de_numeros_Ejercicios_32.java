package com.mycompany.programa_de_calculo_de_numeros_ejercicios_32;

import java.util.Scanner;

public class Programa_de_calculo_de_numeros_Ejercicios_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.println("Ingrese dos enteros: el primero debe ser menor que el segundo.");
            int numeroMenor = scanner.nextInt();
            int numeroMayor = scanner.nextInt();

            if (numeroMenor >= numeroMayor) {
                System.out.println("El primer número debe ser menor que el segundo.");
                intentos++;
            } else {
                System.out.println("Números impares entre " + numeroMenor + " y " + numeroMayor + ":");
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

                int sumaPares = 0;
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    if (i % 2 == 0) {
                        sumaPares += i;
                    }
                }
                System.out.println("Suma de números pares entre " + numeroMenor + " y " + numeroMayor + ": " + sumaPares);

                System.out.println("Números y sus cuadrados entre " + numeroMenor + " y " + numeroMayor + ":");
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    int cuadrado = i * i;
                    System.out.println(i + " -> " + cuadrado);
                }

                int sumaCuadradosImpares = 0;
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    if (i % 2 != 0) {
                        int cuadrado = i * i;
                        sumaCuadradosImpares += cuadrado;
                    }
                }
                System.out.println("Suma de cuadrados de números impares entre " + numeroMenor + " y " + numeroMayor + ": " + sumaCuadradosImpares);

                System.out.println("Números perfectos entre " + numeroMenor + " y " + numeroMayor + ":");
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    if (esNumeroPerfecto(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                
                System.out.println("Números primos entre " + numeroMenor + " y " + numeroMayor + ":");
                for (int i = numeroMenor; i <= numeroMayor; i++) {
                    if (esNumeroPrimo(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

                break;
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Ha alcanzado el número máximo de intentos. Adiós.");
        }

        scanner.close();
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
