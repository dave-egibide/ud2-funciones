package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /* Versión preliminar, rulaba pero no era flexible (sólo funcionaba con iban español) y es prácticamente ilegible

    public static boolean verificarIban(String i) {
        //dividido en tres (cuatro) operaciones por visibilidad
        long calculo = (Long.parseLong(i.substring(4, 22)) % 97) * (long) Math.pow(10, 8);
        calculo += (long) ((i.charAt(0)) - 87) * Math.pow(10, 4) + ((i.charAt(1)) - 87) * 100;
        calculo += Long.parseLong(i.substring(22, 24)) * Math.pow(10, 6) + Integer.parseInt(i.substring(2, 4));

        return (calculo % 97 == 1);
    }
    */

    static boolean verificarIban(String ibanCompleto) {
        String iban;

        // extraemos el número de cuenta
        iban = ibanCompleto.substring(4);
        // añadimos el valor numérico de las letras
        iban += ibanCompleto.charAt(0) - 87;
        iban += ibanCompleto.charAt(1) - 87;
        // y el par númerico de verificación
        iban += ibanCompleto.substring(2, 4);

        // hacemos los módulos necesarios para verificar
        do {
            if (iban.length() > 9) {
                int resto = Integer.parseInt(iban.substring(0, 9)) % 97;
                iban = resto + iban.substring(9);
            } else {
                iban = String.valueOf(Integer.parseInt(iban) % 97);
            }
        } while (iban.length() > 2);

        // existe la ínfima posiblidad de que el número saliente sea 97, 98 o 99, así que lo dividiríamos de nuevo
        if (Integer.parseInt(iban) > 97) iban = String.valueOf(Integer.parseInt(iban) % 97);
        // y devolvemos correcto si da 1
        return Integer.parseInt(iban) == 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca el número IBAN a verificar: ");
        // según leemos el valor quitamos los espacios y lo llevamos a minúsculas
        String x = br.readLine().replaceAll("\\s", "").toLowerCase();
        if (verificarIban(x)) {
            System.out.println("Número de IBAN válido.");
        } else {
            System.out.println("Número de IBAN inválido.");
        }
    }
}
