package com.juaracoding.acrjavafundamental.testharian.practicumresults;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 24/01/2023 19:10
@Last Modified 24/01/2023 19:10
Version 1.1
*/

import java.util.Scanner;

public class Quest1Practicum3 {

    public static void main(String[] args) {
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
