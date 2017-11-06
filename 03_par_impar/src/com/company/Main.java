package com.company;

public class Main {

    public static boolean esPar(int paroimpar) {
        return (paroimpar % 2 == 0);
    }

    public static boolean esImpar(int paroimpar) {
        return (paroimpar % 2 != 0);
    }

    public static void main(String[] args) {
        // ejemplo
        int x = 286;
        if (esPar(x)) System.out.printf("%d es un número par.", x);
        if (esImpar(x)) System.out.printf("%d es un número impar.", x);
    }
}
