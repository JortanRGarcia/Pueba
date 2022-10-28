package tarea2java;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int personas;
        double distancia, valorB, total, x;
        double descuento = 0;
        Scanner user = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que van a viajar: ");
        personas = user.nextInt();
        System.out.println("Ingrese la cantidad de kilometros a recorrer: ");
        distancia = user.nextDouble();

        if (distancia > 200) {
            x = distancia-200;
            valorB = 20+(0.1*x);
        } else {
            valorB = 20;
        }
        total = valorB * personas;
        if (distancia > 400) {
            descuento = descuento + (total * 0.15);
        }
        if (personas >= 3) {
            descuento = descuento + (total * 0.10);
        }
        total = total-descuento;
        System.out.println("Precio del billete individual: $"+(total/personas));
        System.out.println("Precio total a pagar: $"+total);
    }
}
