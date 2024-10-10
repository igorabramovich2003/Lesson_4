package com.teachmeskills.lesson_4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        int average1 = (int)Arrays.stream(numbers1).average().orElse(0.0);
        int average2 = (int)Arrays.stream(numbers2).average().orElse(0.0);
        if (average1 > average2) {
            System.out.println("среднее арифметическое массива 1 больше средне арифметического массива 2");
        }else if (average2 > average1) {
            System.out.println("среднее арифметическое массива 2 больше средне арифметического массива 1");
        }else{
            System.out.println("среднее арифметическое массива 1 равно средне арифметическому массива 2");
        }
    }
}
