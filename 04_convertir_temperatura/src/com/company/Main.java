package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double celsius) {
        return (celsius * 9 / 5 + 32);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca una temperatura en grados celsius: ");
        double x = Double.parseDouble(br.readLine());

        System.out.printf("%.2f ºC son %.3f ºF", x, convertirTemperatura(x));
    }
}
