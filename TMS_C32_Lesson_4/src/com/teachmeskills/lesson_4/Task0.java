package com.teachmeskills.lesson_4;
import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 14, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int inputNumber = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == inputNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + inputNumber + " присутствует в массиве.");
        } else {
            System.out.println("Число " + inputNumber + " отсутствует в массиве.");
        }
    }
}
