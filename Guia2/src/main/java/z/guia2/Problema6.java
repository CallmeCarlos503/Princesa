/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;

/**
 *
 * @author CallmeCarlos
 */
public class Problema6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Ingrese un número entero: ");
            int num = scanner.nextInt();

            if (num % 3 == 0) {
                suma += num;
            }
        }

        System.out.println("La suma de los números múltiplos de 3 es: " + suma);
    }
}
