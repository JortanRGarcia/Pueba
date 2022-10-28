package tarea2java;

import java.util.Scanner;

public class Ejercicio2_while {
    public static void main(String[] args){
        double promedio;
        double suma=0;
        int contador = 0;
        Scanner user = new Scanner(System.in);
        
        while(contador<5){
            System.out.println("Inrgese la nota "+(contador+1));
            suma = suma+ user.nextDouble();
            contador++;
        }
        promedio = suma/5;
        System.out.println("El promedio es: "+promedio);
        
    }
    
}
