package tarea2java;

import java.util.Scanner;

public class Ejercicio2_DoWhile {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int i = 0;
        double nota, suma = 0, prom;
        do {
            System.out.println("Ingrese calificacion " + (i + 1));
            nota = user.nextDouble();
            suma = suma + nota;
            prom = suma / 5;
            i++;
        } while (i < 5);
        System.out.println("El promedio es: "+prom);
        
    }

}
