package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void morse(String texto) {

        for (int i = 0; i < texto.length(); i++) {
            switch (texto.substring(i, i + 1)) {
                case " ":
                    break;
                case "a":
                    System.out.print("· —");
                    break;
                case "b":
                    System.out.print("— · · ·");
                    break;
                case "c":
                    if (i + 1 != texto.length()) {
                        if (texto.substring(i, i + 2).equals("ch")) {
                            System.out.print("— — — —");
                            i++;
                            break;
                        }
                    }
                    System.out.print("— · — ·");
                    break;
                case "d":
                    System.out.print("— · ·");
                    break;
                case "e":
                    System.out.print("— · ·");
                    break;
                case "f":
                    System.out.print("· · — ·");
                    break;
                case "g":
                    System.out.print("— — ·");
                    break;
                case "h":
                    System.out.print("· · · ·");
                    break;
                case "i":
                    System.out.print("· ·");
                    break;
                case "j":
                    System.out.print("· — — —");
                    break;
                case "k":
                    System.out.print("· — — —");
                    break;
                case "l":
                    System.out.print("· — · ·");
                    break;
                case "m":
                    System.out.print("— —");
                    break;
                case "n":
                    System.out.print("— ·");
                    break;
                case "ñ":
                    System.out.print("— — · — —");
                    break;
                case "o":
                    System.out.print("— — —");
                    break;
                case "p":
                    System.out.print("· — — ·");
                    break;
                case "q":
                    System.out.print("— — · —");
                    break;
                case "r":
                    System.out.print("· — ·");
                    break;
                case "s":
                    System.out.print("· · ·");
                    break;
                case "t":
                    System.out.print("—");
                    break;
                case "u":
                    System.out.print("· · —");
                    break;
                case "v":
                    System.out.print("· · · —");
                    break;
                case "w":
                    System.out.print("· — —");
                    break;
                case "x":
                    System.out.print("— · · —");
                    break;
                case "y":
                    System.out.print("— · — —");
                    break;
                case "z":
                    System.out.print("— — · ·");
                    break;
                case "0":
                    System.out.print("— — — — —");
                    break;
                case "1":
                    System.out.print("· — — — —");
                    break;
                case "2":
                    System.out.print("· · — — —");
                    break;
                case "3":
                    System.out.print("· · · — —");
                    break;
                case "4":
                    System.out.print("· · · · —");
                    break;
                case "5":
                    System.out.print("· · · · ·");
                    break;
                case "6":
                    System.out.print("— · · · ·");
                    break;
                case "7":
                    System.out.print("— — · · ·");
                    break;
                case "8":
                    System.out.print("— — — · ·");
                    break;
                case "9":
                    System.out.print("— — — — ·");
                    break;
                case ".":
                    System.out.print("· — · — · —");
                    break;
                case ",":
                    System.out.print("— · — · — —");
                    break;
                case "?":
                    System.out.print("· · — — · ·");
                    break;
                case "\"":
                    System.out.print("· — · · — ·");
                    break;
                case "!":
                    System.out.print("— — · · — —");
                    break;
                default:
                    System.out.print("?");
                    break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x;
        do {
            System.out.println("Escriba un texto para traducir a morse o STOP para terminar el programa: ");
            x = br.readLine().toLowerCase();
            if (!x.startsWith("stop")) morse(x);
        } while (!x.startsWith("stop"));

    }
}
