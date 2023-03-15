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
public class Problema9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVentas, venta, ventasMenor500 = 0, ventasEntre500y900 = 0, ventasMayor900 = 0;

        System.out.print("Ingrese el número de ventas realizadas: ");
        nVentas = sc.nextInt();

        for (int i = 1; i <= nVentas; i++) {
            System.out.print("Ingrese el valor de la venta #" + i + ": ");
            venta = sc.nextInt();

            if (venta <= 500) {
                ventasMenor500++;
            } else if (venta > 500 && venta < 900) {
                ventasEntre500y900++;
            } else if (venta >= 900) {
                ventasMayor900++;
            }
        }

        System.out.println("Ventas de $500 o menos: " + ventasMenor500);
        System.out.println("Ventas entre $500 y $900: " + ventasEntre500y900);
        System.out.println("Ventas de $900 o más: " + ventasMayor900);

        sc.close();
    }
}
