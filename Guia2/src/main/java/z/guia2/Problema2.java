/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.guia2;

import java.util.Scanner;
public class Problema2 {

    public static void main(String[] args) {
        double costoxGramo = 0;
        int zona = 0;
        double peso = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete en gramos: ");
        peso = scanner.nextDouble();
        System.out.print("Ingrese la zona a la que va dirigido el paquete (1-5): ");
        zona = scanner.nextInt();
        switch (zona) {
            case 1:
                costoxGramo = 11;
                break;
            case 2:
                costoxGramo = 10;
                break;
            case 3:
                costoxGramo = 12;
                break;
            case 4:
                costoxGramo = 24;
                break;
            case 5:
                costoxGramo = 27;
                break;
            default:
                System.out.println("La zona ingresada no es válida");
                return;
        }

        if (peso <= 5000) {
            double costoEnvio = peso * costoxGramo;
            System.out.println("El costo total del envío es de $" + costoEnvio);
        } else {
            System.out.println("El paquete no puede ser transportado debido a que su peso es superior a 5 kg");
        }
    }
}
