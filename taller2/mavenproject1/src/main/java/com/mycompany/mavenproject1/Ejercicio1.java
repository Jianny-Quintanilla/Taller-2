/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[10];
        for (int i = 0; i < edades.length; i++){
            System.out.println("== Ingrese un numero ==");
            edades[i] = scanner.nextInt();
        }
        for (int i = 0; i < edades.length; i++){
            System.out.println("== Posicion "+ i + " : " + edades[i] + " ==");
        }
    }
}