package com.juaracoding.acrjavafundamental.testharian.praktikum_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/01/2023 19:21
@Last Modified 13/01/2023 19:21
Version 1.1
*/

import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        Soal Ke 1
        System.out.print("Masukkan Kata : ");
        String strInput3 = sc.nextLine();
        char chX;
        int intTask = 0;
        int intHasil = 0;
        for (int i=0;i<strInput3.length();i++)
        {
            chX =strInput3.charAt(i);
            intTask = chX;
            if((intTask>=65 && intTask<=90) || (intTask>=48 && intTask<=57) || (intTask>=32 && intTask<=47)
            || (intTask>=58 && intTask<=64))
            {

                intHasil=intHasil+intTask;

            }
        }
        System.out.println("Hasil : "+intHasil);
        
//        Soal Ke2
        
        System.out.print("Masukkan Kata : ");
        String strInput2 = sc.nextLine();
        char chY;
        int intY = 0;
        int intHasil2 = 0;
        for (int i=0;i<strInput2.length();i++)
        {
            chY =strInput2.charAt(i);
            intY = chY;
            if((intY>=65 && intY<=90) || (intY>=48 && intY<=57) || (intY>=32 && intY<=47)
            || (intY>=58 && intY<=64))
            {

                intHasil2=intHasil2+intY;

            }
        }
        System.out.println("Hasil : "+intHasil2);
        
        
//        Soal Ke 3
        
        System.out.print("Masukkan Kata : ");
        String strInput4 = sc.nextLine();
        char chTask3;
        int intTask3 = 0;
        int intResults3 = 0;
        for (int i=0;i<strInput4.length();i++)
        {
            chTask3 =strInput4.charAt(i);
            intTask3 = chTask3;
            if((intTask3>=32 && intTask3<=122))
            {

                intResults3=intResults3+intTask3;

            }
            System.out.println("Number ASCII : "+strInput4.charAt(i)+" -> "+intTask3);

        }
        System.out.println("Hasil : "+intResults3);
    }
}
