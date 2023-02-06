package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 05/02/2023 15:23
@Last Modified 05/02/2023 15:23
Version 1.1
*/

import java.util.Scanner;

public class TestCodeQu2Pra5 {

    /*
	Soal Nomor 2 Praktikum 5 Java Fundamental
    */


    public static void main(String[] args) {
        int intVariable1, intVariable2, intResult;
        System.out.print("Masukkan Jumlah Baris : ");
        Scanner scanner = new Scanner(System.in);
        intResult = (int) scanner.nextInt();

        for (intVariable1 = 1;intVariable1<=intResult;intVariable1++){
            for (intVariable2 = 1 ; intVariable2 <= intVariable1 ; intVariable2++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
