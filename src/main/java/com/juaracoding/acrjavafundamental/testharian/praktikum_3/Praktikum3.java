package com.juaracoding.acrjavafundamental.testharian.praktikum_3;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 23/01/2023 17:32
@Last Modified 23/01/2023 17:32
Version 1.1
*/

import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] args) {

        /*
        Soal Nomor 1 Praktikum 3 Java Fundamental
    */


            int intInput, intSecond = 0, intMinute = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Detik : ");
            intInput = sc.nextInt();

            if (intInput<=60){
                intSecond = intInput%60;
            } else if (intInput>=60) {
                intSecond = intInput % 60;
                intMinute = intInput / 60;

            }
            System.out.print(intInput+" Detik Sama Dengan "+intMinute+" Menit "+intSecond+" Detik");
    }
}
