package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetroRectangulo(int base, int altura) {
        int peri = (base + altura) * 2;
        return peri;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y;

        System.out.println("Escriba la base del rectángulo:");
        x = Integer.parseInt(br.readLine());
        System.out.println("Escriba la altura del rectángulo:");
        y = Integer.parseInt(br.readLine());
        
        System.out.printf("El perímetro del rectángulo es %d.", perimetroRectangulo(x, y));
    }
}
