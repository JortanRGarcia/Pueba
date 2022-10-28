package tarea2java;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        char cont = 'S';
        int matricula, n1p, n2p, nm;
        Scanner user = new Scanner(System.in);

        while (cont == 'S') {
            System.out.println("Ingrese numero de matricula: ");
            matricula = user.nextInt();
            System.out.println("Ingrese nota del primer parcial: ");
            n1p = user.nextInt();
            System.out.println("Ingrese nota del segundo parcial: ");
            n2p = user.nextInt();
            System.out.println("Ingrese nota del mejoramiento: ");
            nm = user.nextInt();
            if ((n1p + n2p) >= 120) {
                System.out.println("Estudiante aprueba la materia");
                System.out.println("Desea continuar? (S/N): ");
                cont = user.next().charAt(0);
            } else if ((n1p + nm) >= 120) {
                System.out.println("Estudiante aprueba la materia");
                System.out.println("Desea continuar? (S/N): ");
                cont = user.next().charAt(0);
            } else if ((nm + n2p) >= 120) {
                System.out.println("Estudiante aprueba la materia");
                System.out.println("Desea continuar? (S/N): ");
                cont = user.next().charAt(0);
            }else{
                System.out.println("Estudiante reprueba la materia");
                System.out.println("Desea continuar? (S/N): ");
                cont = user.next().charAt(0);
            }
               

        }

    }

}
