package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 09/02/2023 14:58
@Last Modified 09/02/2023 14:58
Version 1.1
*/

import java.util.Scanner;

public class TestCodeQu1Pra6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;


        System.out.print("Masukkan angka (ketik 'stop' untuk berhenti):");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers[count++] = number;
            } catch (NumberFormatException e) {
                System.out.print("Input yang diterima hanya berupa angka, silakan coba lagi.");
            }
        }

        sc.close();

        sortNumbersAscending(numbers, count);

        System.out.print("Hasil pengurutan angka:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void sortNumbersAscending(int[] numbers, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}


