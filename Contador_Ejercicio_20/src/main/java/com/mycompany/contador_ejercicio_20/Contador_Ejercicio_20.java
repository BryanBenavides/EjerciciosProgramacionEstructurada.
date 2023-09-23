package com.mycompany.contador_ejercicio_20;

public class Contador_Ejercicio_20 {

    public static void main(String[] args) {
        final int limite = 300_000_000;
        final int incremento = 1;
        final int paso = 1_000_000;

        int maximoIntentos = 3;

        for (int intento = 1; intento <= maximoIntentos; intento++) {
            System.out.println("\nIntento #" + intento);
            long startTime = System.currentTimeMillis();
            int contador = 0;

            while (contador < limite) {
                contador += incremento;
                if (contador % paso == 0) {
                    long currentTime = System.currentTimeMillis();
                    long tiempoTranscurrido = currentTime - startTime;
                    System.out.println("Contador: " + contador + ", Tiempo transcurrido: " + tiempoTranscurrido + " ms");
                    startTime = currentTime;
                }
            }

            System.out.println("Proceso completado.");
            if (intento < maximoIntentos) {
                System.out.println("Reiniciando contador...");
            }
        }
    }
}

