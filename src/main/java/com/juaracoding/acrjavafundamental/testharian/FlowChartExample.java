package com.juaracoding.acrjavafundamental.testharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
Runtime version: 17.0.5+1-b653.23 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1010M
Cores: 8

Kotlin: 223-1.7.21-release-272-IJ8214.52
@Author aldic 
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
        int intNumber = 0, intTotal = 0;
        boolean isAgain = true;

        try {
            System.out.println("Masukkan angka sepuasnya: ");
            do {
                intNumber = sc.nextInt();//input

                intTotal += intNumber;//proses penjumlahan input
            } while (isAgain);//perulangan utk input kembali
        } catch (Exception e) {//exception handling utk input karakter
            System.out.println("Jumlah: " + intTotal);//output
            System.exit(0);//keluar dari sistem
        }
    }
}
