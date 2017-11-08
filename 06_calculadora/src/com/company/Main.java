package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(int i) {
        return i * Math.PI;
    }

    public static double area(int i) {
        return (i * i) * Math.PI;
    }

    public static double volumen(int i) {
        return i * ((Math.PI / 4) * 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x;
        int radio;

        do {
            System.out.println("\n=== Calculadora ===");
            System.out.println("a) Longitud de la circunferencia");
            System.out.println("b) Área del círculo");
            System.out.println("c) Volumen de la esfera");
            System.out.println("d) Salir");
            System.out.print("Opción: ");

            x = br.readLine();

            if (x.equalsIgnoreCase("a") || x.equalsIgnoreCase("b") || x.equalsIgnoreCase("c")) {

                System.out.print("Introduzca el valor del radio de la circunferencia: ");
                radio = Integer.parseInt(br.readLine());

                switch (x.toLowerCase()) {
                    case "a":
                        System.out.printf("La longitud de la circunferencia es %.3f.", longitud(radio));
                        break;
                    case "b":
                        System.out.printf("El área del círculo es %.3f.", area(radio));
                        break;
                    case "c":
                        System.out.printf("El volumen de la esfera es %.3f.", volumen(radio));
                        break;

                }
            }

        } while (!x.equalsIgnoreCase("d"));
    }
}