package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void convertirTemperatura(double celsius, int escala) {
        if (escala == 1) System.out.printf("%.2f ºF\n" ,(celsius * 9 / 5 + 32));
        if (escala == 2) System.out.printf("%.2f ºK\n" ,(celsius + 273.15));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int escala;

        do {
            System.out.println("\n=== Temperaturas ===");
            System.out.println("1. Convertir a Fahrenheit");
            System.out.println("2. Convertir a Kelvin");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            escala = Integer.parseInt(br.readLine());

            if (escala == 1 || escala == 2) {
                System.out.print("Introduzca una temperatura en grados celsius: ");

                double x = Double.parseDouble(br.readLine());

                System.out.printf("%.2f ºC son " ,x);
                convertirTemperatura(x,escala);
            }
        } while (escala != 3);
    }
}
