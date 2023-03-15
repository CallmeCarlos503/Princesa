/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        int n = 10;
        double p1 = 70;
        double p4 = 50;

        for (int i = 1; i <= n; i++) {
            Scanner s = new Scanner(System.in);
            System.out.print("Cliente #" + i + ", ¿cuántas llantas va a comprar?: ");
            int c = s.nextInt();

            double t = 0;
            if (c >= 4) {
                t = c * p4;
            } else {
                t = c * p1;
            }

            System.out.println("Cliente #" + i + ", el total a pagar es de $" + t);
        }
    }
}
