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

public class Quest1Practicum2 {

    public static void main(String[] args) {

        //deklarasi dan inisialisasi
        Scanner sc = new Scanner(System.in);
        int intNumber = 0, intTotal = 0;
        boolean isAgain = true;
        String strNilaiInput = "";
        int intLoop = 0;
        String [] strArr ;
        String strPrint = "";
        try {
            System.out.println("Masukkan angka sepuasnya: ");
            do {
                intNumber = sc.nextInt();//input
                intTotal += intNumber;//proses penjumlahan input
                strNilaiInput = strNilaiInput+intNumber+",";
                intLoop++;
            } while (isAgain);
        } catch (Exception e) {

            if(strNilaiInput.length()>2){
                strNilaiInput = strNilaiInput.substring(0,strNilaiInput.length()-1);
                strArr = strNilaiInput.split(",");
                for(int i=0;i<strArr.length;i++){
                    if(i!=strArr.length-1){
                        strPrint = strPrint+strArr[i]+",";
                    }else{
                        strPrint = strPrint.substring(0,strPrint.length()-1);
                        strPrint = strPrint+" dan "+strArr[i];
                    }
                }
                System.out.println("Rata-rata dari penjumlahan angka "+strPrint+" adalah " + (((double)intTotal)/intLoop));//output
            }else{
                System.out.println("Untuk Rata-Rata minimal harus menginput 2 angka");
            }
        }finally {
            sc.close();
        }

    }
}
