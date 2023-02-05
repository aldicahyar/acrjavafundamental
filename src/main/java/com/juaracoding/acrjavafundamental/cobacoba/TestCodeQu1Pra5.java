package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 05/02/2023 15:32
@Last Modified 05/02/2023 15:32
Version 1.1
*/

import java.util.Scanner;

public class TestCodeQu1Pra5 {

    public static void main(String[] args) {
//        int i, j, n, s ;
//        System.out.print("Masukkan Jumlah Baris : ");
//        Scanner scanner = new Scanner(System.in);
//        n = (int) scanner.nextInt();
//
//        for (i = 1; i <= n ; i++)
//        {
//         s = n - i;
//         for (j = 1; j <= s ; j++)
//         {
//             System.out.println(" ");
//         }
//         for (j = 1 ; j <= i ; j++)
//         {
//             System.out.println("*");
//         }
//            System.out.println();
//
//        }

        /*Pendeklarasian variabel*/
        int i, j, n, s;
        /*Inputan*/
        System.out.print ("Masukan jumlah baris : ");
        Scanner sc = new Scanner(System.in);
        n = (int) sc.nextInt();
        /*Perulangan*/
        for (i = 1; i <= n; i++)
        {
            s = n - i;
            for(j = 1; j <= s; j++)
            {
                System.out.print(" ");  /*Menampilkan jarak dengan spasi*/
            }
            for (j = i; j >= 1; j--)
            {
                System.out.print(j);  /*Menampilkan simbol bintang*/
            }
            System.out.println();
        }



    }
}
