/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;
public class Problema10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        double a = sc.nextDouble();

        System.out.println("Ingrese el valor de b:");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor de c:");
        double c = sc.nextDouble();

        double alternativa = b * b - 4 * a * c;

        if (alternativa < 0) {
            System.out.println("La ecuación no tiene solución real.");
        } else if (alternativa == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución única es x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(alternativa)) / (2 * a);
            double x2 = (-b - Math.sqrt(alternativa)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        }

        sc.close();
    }
}
