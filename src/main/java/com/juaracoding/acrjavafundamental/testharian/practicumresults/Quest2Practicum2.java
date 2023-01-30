package com.juaracoding.acrjavafundamental.testharian.practicumresults;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 24/01/2023 19:40
@Last Modified 24/01/2023 19:40
Version 1.1
*/

import java.util.Scanner;

public class Quest2Practicum2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan : ");
        String strFirstName = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang : ");
        String strLastName = scanner.nextLine();
        String [] arrFirstName = strFirstName.split(" ");
        String [] arrLastName  = strLastName.split(" ");
        String strInisial = "";
        String strFullName = "";

        if(!strFirstName.equals("")){
            for (int i=0;i<arrFirstName.length;i++)
            {
                strInisial = strInisial+arrFirstName[i].charAt(0);
                strFullName = strFullName+arrFirstName[i]+" ";
            }
        }
        if(!strLastName.equals("")){
            for (int i=0;i< arrLastName.length;i++)
            {
                strInisial = strInisial+arrLastName[i].charAt(0);
                strFullName = strFullName+arrLastName[i]+" ";
            }
        }
        System.out.println("Inisial "+strFullName+" adalah "+strInisial.toUpperCase());

    }
}
