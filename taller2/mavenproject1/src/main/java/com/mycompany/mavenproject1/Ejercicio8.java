/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[4][4];
        int suma;
        suma = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("== Ingrese un numero entero ==");
                num [i][j] = scanner.nextInt();
            }
        }
        System.out.println("== Tu diagonal principal es ==");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j){
                System.out.println(num[i][j]);
                suma = (suma + num[i][j]);
            }
            }
        }
        System.out.println("");
        System.out.println("== La suma de tu diagonal principal es " + suma + " ==");
    }
}