package com.juaracoding.acrjavafundamental.testharian.testarray;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 12/01/2023 21:20
@Last Modified 13/01/2023 13:50
Version 1.1
*/

//import java.sql.SQLOutput;

import java.util.Scanner;
public class LoopthroughArray {

    public static void main(String[] args) {

//        int a =0;

//        System.out.println(a);

//        int [] intArr = {6,3,1,2};
//        System.out.println("NILAI intArr index ke 2 "+intArr[3]);
//        System.out.println("Alamat Memory Deklarasi ke - 1 : "+intArr);
//
//        intArr = new int[10];
//        System.out.println("NILAI intArr index ke 2 "+intArr[2]);
//        System.out.println("Alamat Memory Deklarasi ke - 2 : "+intArr);

//        int [] intArr2 = new int[5];
//        intArr2 [0] = 6;
//        intArr2 [1] = 4;
//        intArr2 [2] = 9;
//        intArr2 [3] = 8;
//        intArr2 [4] = 10;

//        String [][]cars = {
//                {"Volvo", "BMW", "Ford", "Mazda"},
//                {"HONDA","TOYOTA","DAIHATSU"}
//        };


//        System.out.println("LENGTH 2 DIMENSI cars "+cars.length);
//        System.out.println("LENGTH 2 DIMENSI cars "+cars[0].length);
//        System.out.println("LENGTH 2 DIMENSI cars "+cars[1].length);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan Banyak nya Array :");
//        int loopArr = sc.nextInt();
//
//        int [] intArr = new int[loopArr];
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            System.out.print("Masukkan Nilai Array Ke "+i+" : ");
//            intArr[i] = sc.nextInt();
//
//        }
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            System.out.print(intArr[i]+",");
//        }

//        Padamu Negeri

//        /* Sample Char Array Dari String*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan Kata : " );
//        String strInput = sc.nextLine();
//
//        for (int i=0;i<strInput.length();i++)
//        {
//            System.out.println("INDEX KE"+i+" ADALAH HURUF "+strInput.charAt(i));
//        }

/*
DUA DIMENSI
 */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan Banyak nya Baris :");
//        int loopArrBaris = sc.nextInt();
//        System.out.println("Masukkan Banyak nya Kolom :");
//        int loopArrKolom = sc.nextInt();
//
//        int [][] intArr = new int[loopArrBaris][loopArrKolom];
////        int [][] intArr = new int[2][2];
//
////        for(int i=0;i<loopArr;i++)
//        for(int i=0;i<intArr.length;i++)
//        {
//            for(int j=0;j<intArr[i].length;j++)
//            {
//                System.out.println("Masukkan Nilai Baris Ke "+i+" Kolom Ke "+j+" : ");
//                intArr[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            for(int j=0;j<intArr[i].length;j++)
//            {
//                System.out.print(intArr[i][j]+",");
//            }
//            System.out.println();
//        }


//        for (int i=0;i<cars.length;i++)
//        {
//            for(int j=0;j<cars[i].length;j++)
//            {
////                System.out.print("ISI DARI INDEX KE ["+i+"]["+j+"] ADALAH "+cars[i][j]+" ,");
//                System.out.print(cars[i][j]+" ,");
//            }
//            System.out.println();
//        }


       /* Konversi Char Ke ASCII */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();
        char chX;
        int intX;
        int intJumlah =0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if((intX>=65 && intX<=90) || (intX>=48 && intX<=57) || (intX>=32 && intX<=47)
            || (intX>=58 && intX<=64))
            {
                intJumlah=intJumlah+intX;


            }
            System.out.println("Number ASCII : "+strInput.charAt(i)+" -> "+intX);
            System.out.println("Jumlah Ke : "+intJumlah);

        }

//        int [] array = {2, 7, 3, 5, 8, 9};
//        int kuncen = array[0];
//        for (int i = 0; i < array.length; i++)
//        {
//            if (array[i] > kuncen)
//                kuncen = array[i];
//        }
//        System.out.print(kuncen);

//        int [] tahun = new int [7];
//
//        tahun[0] = 2004;
//
//        tahun[1] = 2006;
//
//        System.out.println(tahun[0] + " " + tahun[1] + " " + tahun[1]);









    }
}
