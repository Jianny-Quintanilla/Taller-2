/**
 * @author [Jianny Jhossue Quintanilla Zambrano]
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[10];
        double suma;
        double promedio;
        suma = 0;
        for (int i = 0; i < num.length; i++){
            System.out.println("== Ingrese un numero ==");
            num[i] = scanner.nextDouble();
            suma = (suma + num[i]);
        }
        promedio = (suma / num.length);
        System.out.println("== La suma de tus numeros es " + suma);
        System.out.println("== El promedio de tus numeros es " + promedio);
    }
}