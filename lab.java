package com.company;

import java.util.Scanner;

public class lab {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        while (!in.hasNextInt()) {
            System.out.println("Ошибка");
            in.next();
        }
        int n = in.nextInt();
        double[] array = new double [n];

        System.out.println("Введите массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }



        double avr = array[0];
        int x = 1;

        for (int i = 1; i < array.length; i++) {
            avr += array[i];
            x++;
            array[i] = avr / x;

        }

        System.out.println();
        System.out.println("Сглаженный массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
