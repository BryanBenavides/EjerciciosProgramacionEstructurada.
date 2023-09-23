package com.mycompany.calendario_ejercicio_21;

import java.util.Scanner;

public class Calendario_Ejercicio_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximoIntentos = 3;

        for (int intento = 1; intento <= maximoIntentos; intento++) {
            System.out.println("\nIntento #" + intento);
            System.out.print("Ingrese un año en el rango de 1994 a 1999: ");
            int year = input.nextInt();

            if (year >= 1994 && year <= 1999) {
                for (int month = 1; month <= 12; month++) {
                    System.out.println("Mes " + month + " del año " + year + ":");

                    System.out.println("Dom Lun Mar Mie Jue Vie Sab");

                    int daysInMonth = getDaysInMonth(month, year);
                    int dayOfWeek = getDayOfWeek(year, month, 1);

                    for (int i = 0; i < dayOfWeek; i++) {
                        System.out.print("    ");
                    }

                    for (int day = 1; day <= daysInMonth; day++) {
                        System.out.printf("%3d ", day);

                        if ((day + dayOfWeek) % 7 == 0 || day == daysInMonth) {
                            System.out.println();
                        }
                    }

                    System.out.println();
                }

                System.out.println("Proceso completado.");
                if (intento < maximoIntentos) {
                    System.out.println("Reiniciando el programa...");
                }
            } else {
                System.out.println("Año fuera del rango especificado.");
            }
        }

        input.close();
    }

    public static boolean esAnoBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && esAnoBisiesto(year)) {
            return 29;
        }

        return daysInMonth[month];
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int h = (day + 2 * month + (3 * (month + 1)) / 5 + year + (year / 4) - (year / 100) + (year / 400)) % 7;
        return h;
    }
}
