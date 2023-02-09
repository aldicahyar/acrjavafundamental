package com.juaracoding.acrjavafundamental.testharian.practicumresults;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 06/02/2023 19:17
@Last Modified 06/02/2023 19:17
Version 1.1
*/

import java.util.Scanner;

public class Quest1Practicum5 {

    public static void main(String[] args) {

         /*
          Soal Nomor 1 Praktikum 5 Java Fundamental
          */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int intLoop = scanner.nextInt();
        int intCursor = 0;//diset bernilai i atau jumlah baris yang akan print nilainya dan dikurangi terus
        String strConvert="";
        String strPrintSpace="";//print spasi
        StringBuilder sBuild = new StringBuilder();
        int intLengthSpace=0;
        int intBackward = 0;
        String strPrintRow = "";
        for (int i=1;i<=intLoop;i++)
        {
            intCursor=i;
            intBackward=intLoop;
            for (int j=1;j<=intLoop;j++)
            {
                if(j>intLoop-i)
                {
                    sBuild.setLength(0);
                    strPrintRow = sBuild.append(strPrintRow).append(intCursor).toString();
                    intCursor--;
                }else{
                    strPrintSpace="";
                    strConvert = String.valueOf(intBackward);
                    intLengthSpace =strConvert.length();
                    if(intLengthSpace!=1)
                    {
                        for (int k=0;k<intLengthSpace;k++){
                            sBuild.setLength(0);
                            strPrintSpace = sBuild.append(strPrintSpace).append(" ").toString();
                        }

                        sBuild.setLength(0);
                        strPrintRow = sBuild.append(strPrintRow).append(strPrintSpace).toString();
                    }else{
                        sBuild.setLength(0);
                        strPrintRow = sBuild.append(strPrintRow).append(" ").toString();
                    }
                }
                intBackward--;
            }
            sBuild.setLength(0);
            strPrintRow = sBuild.append(strPrintRow).append("\n").toString();
        }
        System.out.println(strPrintRow);


    }
}
