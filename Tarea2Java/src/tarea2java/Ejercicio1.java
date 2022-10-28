/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2java;

/**
 *
 * @author jorgs
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //pido valores de kwh y guardo en variable cantidad
        Scanner cant = new Scanner(System.in);
        double cantidad;
        System.out.println("Digite la cantidad consumida de kWh: ");
        cantidad = cant.nextDouble();

        //pido valores del precio del kwh y guardo en valor
        Scanner val = new Scanner(System.in);
        double valor;
        System.out.println("Ingrese el valor del kWh: ");
        valor = val.nextDouble();

        //Empiezo mi sentencia if
        if (cantidad > 700) {
            double exceso = cantidad - 700;
            double impuesto = (valor * 0.05)+valor;
            double valorAgregado = exceso * impuesto;
            System.out.println("la cantidad consumida en kWh es: " + cantidad);
            System.out.println("El valor por kWh es de: " + valor);
            System.out.println("Su exceso de consumo es de: "+exceso+" kWh");
            System.out.println("Valor adicional por impuesto 5%: "+valorAgregado);
            System.out.println("El valor a pagar es de: " + ((700*valor) + valorAgregado));
        } else {
            System.out.println("la cantidad consumida en kWh es: " + cantidad);
            System.out.println("El valor por kWh es de: " + valor);
            System.out.println("El valor a pagar es de: " + (cantidad * valor));
        }

    }
}
