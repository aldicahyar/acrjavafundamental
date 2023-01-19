package com.juaracoding.acrjavafundamental.testharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 11/01/2023 18:25
@Last Modified 11/01/2023 18:25
Version 1.1
*/

import java.util.Scanner;

public class FlowChartExample {

    public static void main(String[] args) {

        //deklarasi dan inisialisasi
        Scanner sc = new Scanner(System.in);
        int intNumber = 0;
        double doTotal = 0.0;
        boolean isAgain = true;

        try {
            System.out.println("Masukkan angka sepuasnya: ");
            do {
                intNumber = sc.nextInt();//input

                doTotal += intNumber;//proses penjumlahan input
            } while (isAgain);//perulangan utk input kembali
        } catch (Exception e) {//exception handling utk input karakter
            System.out.println("Jumlah: " + doTotal);//output
            System.exit(0);//keluar dari sistem
        }
    }
}
