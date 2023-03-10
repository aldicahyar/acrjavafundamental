package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 02/02/2023 12:49
@Last Modified 02/02/2023 12:49
Version 1.1
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCodeQuestionTwoPratice4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int intSelect;
        while (true) {
            System.out.println("Select Method:");
            System.out.println("1. Hitung Luas Lingkaran");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Persegi");
            System.out.println("4. Hitung Luas Segitiga");
            System.out.println("5. Hitung Luas Belah Ketupat");
            try {
                System.out.print("Silahkan Pilih Menu : ");
                intSelect = input.nextInt();
                switch (intSelect) {
                    case 1:
                        System.out.println("Luas Lingkaran");
                        luasLingkaran();
                        break;
                    case 2:
                        System.out.println("Luas Persegi Panjang");
                        luasPersegiPanjang();
                        break;
                    case 3:
                        System.out.println("Luas Persegi");
                        luasPersegi();
                        break;
                    case 4:
                        System.out.println("Luas Segitiga");
                        luasSegitiga();
                        break;
                    case 5:
                        System.out.println("Luas Belah Ketupat");
                        luasBelahKetupat();
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        continue;
                }
            }catch (InputMismatchException e) {
                System.out.println("Input harus angka");
                input.nextLine();
                continue;
            }
            System.out.println("Apakah anda ingin memilih menu lain? (Y/N)");
            String strSelectNext = input.next();
            if (!strSelectNext.equalsIgnoreCase("Y")){
                break;
            }
        }
    }

    private static void luasLingkaran() {
        System.out.print("Masukkan jari-jari: ");
        double douR = input.nextInt();
        double douWide = Math.PI * douR * douR;
        System.out.println("Anda menghitung luas lingkaran dengan input jari-jari adalah " + douR + " cm" + " Luas lingkaran adalah " + douWide);
    }

    private static void luasPersegiPanjang() {
        System.out.print("Masukkan Panjang: ");
        double douLong = input.nextDouble();
        System.out.print("Masukkan Lebar: ");
        double douWidth = input.nextDouble();
        double douWide = douLong * douWidth;
        System.out.println("Anda menghitung luas persegi panjang dengan input panjang " + douLong + " dan lebar " + douWidth + " Luas persegi panjang adalah " + douWide);
    }

    private static void luasPersegi() {
        System.out.print("Masukkan sisi: ");
        double douSide = input.nextDouble();
        double douWide = douSide * douSide;
        System.out.println("Anda menghitung luas persegi dengan input sisi " + douSide + " Luas persegi adalah " + douWide);
    }

    private static void luasSegitiga() {
        System.out.print("Masukkan alas: ");
        double douAlas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double douHigh = input.nextDouble();
        double douWide = 0.5 * douAlas * douHigh;
        System.out.println("Anda menghitung luas segitiga dengan input alas " + douAlas + " dan tinggi " + douHigh + " Luas segitiga adalah " + douWide);
    }
    private static void luasBelahKetupat() {
        System.out.print("Masukkan diagonal 1: ");
        double douDiagonal1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double douDiagonal2 = input.nextDouble();
        double douWide = 0.5 * douDiagonal1 * douDiagonal2;
        System.out.println("Anda menghitung luas belah ketupat dengan input diagonal 1 " + douDiagonal1 + " dan diagonal 2 " + douDiagonal2 + " Luas belah ketupat adalah " + douWide);
    }

}
