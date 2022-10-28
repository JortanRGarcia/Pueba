/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2java;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        short x = (short) (100 * Math.random() + 1);
        short user;
        Scanner num = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            user = num.nextShort();
            if (i < 4) {
                if (user < x) {
                    System.out.println("El numero ingresado es MENOR, intente nuevamente");
                    System.out.println("Dispone " + (4 - i) + " intentos");
                } else if (user > x) {
                    System.out.println("El numero ingresado es MAYOR, intente nuevamente");
                    System.out.println("Dispone " + (4 - i) + " intentos");
                } else {
                    System.out.println("Felicidades, ha ganado al acertar el numero");
                    i = 4;
                }
            }else{
                System.out.println("No dispone mas intentos");
            }
        }
        System.out.println("El numero era: " + x);
        System.out.println("FIN DEL JUEGO");

    }
}
