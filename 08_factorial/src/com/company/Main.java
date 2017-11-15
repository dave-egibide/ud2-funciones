package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int factorialIterativo(int i) {
        for (int count = i - 1; count > 1; --count) {
            i *= count;
        }
        return i;
    }

    public static int factorialRecursivo(int i) {
        if (i == 1) return i;
        return i * factorialRecursivo(i - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca un valor: ");
        int x = Integer.parseInt(br.readLine());

        System.out.printf("Factorial iterativo: %d", factorialIterativo(x));
        System.out.printf("\nFactorial recursivo: %d", factorialRecursivo(x));
    }
}
