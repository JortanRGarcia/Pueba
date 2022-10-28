package tarea2java;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int year;
        int yearB = 2004;

        Scanner user = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { //le pido 5 veces un año
            System.out.println("Ingrese un año: ");
            year = user.nextInt();
            year = year - yearB;

            if ((year % 4) == 0) { //le digo si es año bisiesto o no
                System.out.println("Felicidades, es un año bisiesto :D");
            } else {
                System.out.println("No es un año bisiesto :( ");
            }
        }

    }

}
