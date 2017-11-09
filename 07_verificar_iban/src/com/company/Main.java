package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean verificarIban(String i) {
        //dividido en tres (cuatro) operaciones por visibilidad
        long calculo = (Long.parseLong(i.substring(4, 22)) % 97) * (long) Math.pow(10, 8);
        calculo += (long) ((i.charAt(0)) - 87) * Math.pow(10, 4) + ((i.charAt(1)) - 87) * 100;
        calculo += Long.parseLong(i.substring(22, 24)) * Math.pow(10, 6) + Integer.parseInt(i.substring(2, 4));

        return (calculo % 97 == 1);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca el número IBAN a verificar: ");
        String x = br.readLine().replaceAll("\\s", "").toLowerCase();
        if (verificarIban(x)) {
            System.out.println("Número de IBAN válido.");
        } else {
            System.out.println("Número de IBAN inválido.");
        }
    }
}
