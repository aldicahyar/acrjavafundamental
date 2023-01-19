package com.juaracoding.acrjavafundamental.testharian.praktikum_2;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 18/01/2023 19:29
@Last Modified 18/01/2023 19:29
Version 1.1
*/

import java.util.Scanner;

public class Praktikum2 {

    /*
    	Soal Nomor 2 Praktikum 2 Java Fundamental
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan = ");
        String strFirstName = sc.nextLine();
        System.out.print("Masukkan Nama Belakang = ");
        String strLastName = sc.nextLine();

        char chFirstInitial = strFirstName.charAt(0);
        char chFirstInitialTwo = strFirstName.charAt(5);
        char chLastInitial = strLastName.charAt(0);

        System.out.println("Inisial Dari "+strFirstName.concat(" "+strLastName)+" Adalah "+Character.toUpperCase(chFirstInitial)
                +Character.toUpperCase(chFirstInitialTwo)+Character.toUpperCase(chLastInitial));
    }
}
