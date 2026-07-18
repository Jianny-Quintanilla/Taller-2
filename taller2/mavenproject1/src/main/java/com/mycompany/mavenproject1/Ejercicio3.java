/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[15];
        int posicionma;
        int posicionme;
        int mayor;
        int menor;
        mayor = 0;
        menor = 0;
        posicionma = 0;
        posicionme = 0;
        for (int i = 0; i < num.length; i++){
            System.out.println("== Ingrese un numero entero ==");
            num[i] = scanner.nextInt();
            if (i == 0){
                mayor = num[0];
                menor = num[0];
                posicionma = i;
                posicionme = i;
            } else {
            if (num[i] > mayor){
                mayor = num[i];
                posicionma = i;
            }
            if (num[i] < menor){
                menor = num[i];
                posicionme = i;
            }
            }
        }
        System.out.println("== Tu numero mayor es " + mayor + " ==");
        System.out.println("== Tu numero menor es " + menor + " ==");
        System.out.println("== La posicion de tu numero mayor es " + posicionma + " ==");
        System.out.println("== La posicion de tu numero menor es " + posicionme + " ==");
    }
}