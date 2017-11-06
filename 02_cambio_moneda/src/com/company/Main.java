package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void calcularCambio(double valor, String moneda) {
        switch (moneda) {
            case "USD":
                System.out.printf("--- %.2f euros son %.2f dólares estadounidenses ---", valor, (valor * 1.16));
                break;

            case "GBP":
                System.out.printf("--- %.2f euros son %.2f libras esterlinas ---", valor, (valor * 0.88));
                break;

            case "CNY":
                System.out.printf("--- %.2f euros son %.2f dólares estadounidenses yuanes chinos---", valor, (valor * 7.70));
                break;

            case "JPY":
                System.out.printf("--- %.2f euros son %.2f yenes ---", valor, (valor * 132.17));
                break;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String moneda;

        System.out.print("Introduzca una cantidad en euros: ");
        double x = Double.parseDouble(br.readLine());

        do {
            System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
            moneda = br.readLine();
        }
        while (!moneda.equalsIgnoreCase("USD") && !moneda.equalsIgnoreCase("GBP") && !moneda.equalsIgnoreCase("CNY") && !moneda.equalsIgnoreCase("JPY"));

        //aquí también se podría poner una string con la primera mitad del mensaje para añadir la segunda por función
        calcularCambio(x, moneda);

    }
}
