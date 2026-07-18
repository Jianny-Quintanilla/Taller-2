/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[20];
        int par;
        int impar;
        int sumapar;
        int sumaimpar;
        par = 0;
        impar = 0;
        sumapar = 0;
        sumaimpar = 0;
        for (int i = 0; i < num.length; i++){
            System.out.println("== Ingrese un numero ==");
            num[i] = scanner.nextInt();
            if (num[i] % 2 == 0){
                sumapar = (sumapar + num[i]);
                par = (par + 1);
            }else
            {if (num[i] % 2 == 1){
                sumaimpar = (sumaimpar + num[i]);
                impar = (impar + 1);
            }
            }
            }
        System.out.println("== Tu cantidad de numeros pares es " + par + " ==");
        System.out.println("== Tu cantidad de numeros impares es " + impar + " ==");
        System.out.println("== Tu suma de los numeros pares es " + sumapar + " ==");
        System.out.println("== Tu suma de los numeros impares es " + sumaimpar + " ==");
        }
    }
