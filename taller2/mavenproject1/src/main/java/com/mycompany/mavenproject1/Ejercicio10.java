/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[3][5];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("== Ingrese un numero entero ==");
                num [i][j] = scanner.nextInt();
                num [i][j] = (num[i][j] + (i*j));
            }
        }
        System.out.println("== Tu matriz es ==");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(num[i][j]);
            }
        System.out.println("");
        }
    }
}