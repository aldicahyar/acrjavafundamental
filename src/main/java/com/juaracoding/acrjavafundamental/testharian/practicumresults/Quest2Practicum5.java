package com.juaracoding.acrjavafundamental.testharian.practicumresults;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 06/02/2023 20:04
@Last Modified 06/02/2023 20:04
Version 1.1
*/

import java.util.Scanner;

public class Quest2Practicum5 {

//    Soal Nomor 2 Praktikum 5 Java Fundamental

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int intLoop = scanner.nextInt();

        for (int i=0;i<intLoop;i++)
        {
            for (int j=0;j<intLoop;j++)
            {
                if(j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
