package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
        }
        System.out.println("Твой массив: " + Arrays.toString(array));
        System.out.print("Введи число для удаления: ");
        int numberDelete = sc.nextInt();
        int j = 0;
        for (int num : array) {
            if (num == numberDelete) {
                j++;
            }
        }
        if (j == 0)
            System.out.println("Числа нет в массиве");
        else {
            int[] newArray = new int[array.length - j];
            j = 0;
            for (int num : array) {
                if (num != numberDelete) {
                    newArray[j] = num;
                    j++;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(newArray));
        }
    }
}
