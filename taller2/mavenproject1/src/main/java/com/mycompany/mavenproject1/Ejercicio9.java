/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[5][5];
        int mayor;
        int menor;
        mayor = 0;
        menor = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("== Ingrese un numero ==");
                num [i][j] = scanner.nextInt();
                if (i == 0){
                mayor = num[0][0];
                menor = num[0][0];
            } else {
            if (num[i][j] > mayor){
                mayor = num[i][j];
            }
            if (num[i][j] < menor){
                menor = num[i][j];
            }
        }
            }
        }
        System.out.println("== Tu numero mayor es " + mayor + " ==");
        System.out.println("== Tu numero menor es " + menor + " ==");
    }
}