/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2java;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        double valor;
        double suma=0;
        Scanner sum= new Scanner(System.in);
        for (int i=0 ; i<5 ; i++){
            System.out.println("escriba el "+(i+1)+" numero");
            valor = sum.nextDouble();
            suma= suma+valor;       
        }
        System.out.println("el promedio es: "+(suma/5));
    }
    
}
