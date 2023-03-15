/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;

public class Problema7 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el nombre del alumno " + i + ": ");
            String nombre = scanner.nextLine();

            double suma = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese la calificación del parcial " + j + ": ");
                double calificacion = scanner.nextDouble();

                suma += calificacion;
            }

            double promedio = suma / 5;
            String letra = "";

            if (promedio < 6) {
                letra = "NM";
            } else if (promedio >= 6 && promedio <= 8) {
                letra = "B";
            } else if (promedio > 8 && promedio <= 9) {
                letra = "MB";
            } else if (promedio > 9 && promedio <= 10) {
                letra = "E";
            }

            scanner.nextLine(); 

            System.out.println("Alumno " + i + ": " + nombre + ", calificación en letra: \"" + letra + "\", promedio: " + promedio);
        }
    }
}
