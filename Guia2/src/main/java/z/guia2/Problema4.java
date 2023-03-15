/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;

public class Problema4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantMayores = 0;
        int cantNegativos = 0;
        double sumPositivos = 0;
        int cantPositivos = 0;

        double num = 1;
        while (num != 0) {
            System.out.print("Ingrese un número (0 para salir): ");
            num = scanner.nextDouble();

            if (num > 100) {
                cantMayores++;
            } else if (num < 0) {
                cantNegativos++;
            } else if (num > 0) {
                sumPositivos += num;
                cantPositivos++;
            }
        }

        double promPositivos = 0;
        if (cantPositivos > 0) {
            promPositivos = sumPositivos / cantPositivos;
        }

        System.out.println("Cantidad de números mayores a 100: " + cantMayores);
        System.out.println("Cantidad de números negativos: " + cantNegativos);
        System.out.println("Promedio de los números positivos: " + promPositivos);
    }
}
