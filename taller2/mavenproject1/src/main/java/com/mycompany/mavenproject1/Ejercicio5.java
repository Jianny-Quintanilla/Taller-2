/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[12];
        for (int i = 0; i < num.length; i++){
            System.out.println("== Ingrese un numero ==");
            num[i] = scanner.nextInt();
            num[i] = (num[i] + i);
        }
        for (int i = 0; i < num.length; i++){
            System.out.println("== Tu dato en la posicion " + i + " es " + num[i]);
        }
    }
}