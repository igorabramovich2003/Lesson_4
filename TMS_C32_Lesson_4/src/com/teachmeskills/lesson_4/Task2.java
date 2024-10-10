package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        System.out.println("Твой массив: " + Arrays.toString(array));
        System.out.println("Макс значение: " + Arrays.stream(array).max().getAsInt());
        System.out.println("Мин значение: " + Arrays.stream(array).min().getAsInt());
        System.out.println("Среднее значеие: " + Arrays.stream(array).average().getAsDouble());
    }
}
