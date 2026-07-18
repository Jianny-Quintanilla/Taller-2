/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("== Ingrese un numero ==");
                num [i][j] = scanner.nextInt();
            }
        }
        System.out.println("== Tu Matriz es ==");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(num[i][j]);
            }
            System.out.println("");
        }
    }
}