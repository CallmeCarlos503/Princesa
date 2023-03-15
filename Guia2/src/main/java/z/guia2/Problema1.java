/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;
public class Problema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasT = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salarioBruto;

        if (horasT <= 44) {
            salarioBruto = horasT * tarifaPorHora;
        } else {
            salarioBruto = 44 * tarifaPorHora + (horasT - 44) * tarifaPorHora * 2;
        }

        double salarioNeto = salarioBruto * 0.85; 
        System.out.println("El salario neto semanal de " + nombre + " es de $" + salarioNeto);
    }
}
