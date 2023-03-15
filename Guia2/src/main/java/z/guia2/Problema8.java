/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;

public class Problema8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            num = sc.nextInt();
            if (num != 0) {
                int cubo = num * num * num;
                int cuarta = cubo * num;
                System.out.println(num + " ^ 3 = " + cubo);
                System.out.println(num + " ^ 4 = " + cuarta);
            } else {
                continuar = false;
            }
        }

        sc.close();
    }
}
