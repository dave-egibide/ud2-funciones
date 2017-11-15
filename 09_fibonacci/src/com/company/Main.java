package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int fibonacciRepetitivo(int termino) {
        if (termino == 1 || termino == 2) return 1;
        int primero = 1, segundo = 1, fibo = 0;
        for (int i = 2; i < termino; i++) {
            fibo = segundo + primero;
            primero = segundo;
            segundo = fibo;
        }
        return fibo;
    }

    public static int fibonacciRecursivo(int termino) {
            if (termino == 1 || termino == 2) return 1;
            return fibonacciRecursivo(termino -1) + fibonacciRecursivo(termino - 2);
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el termino a desarrollar de la sucesión de Fibonacci (limité 46):");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Metodo repetitivo: " + fibonacciRepetitivo(x));
        System.out.println("Metodo recursivo: " + fibonacciRecursivo(x));


    }
}
