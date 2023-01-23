package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/01/2023 22:02
@Last Modified 13/01/2023 22:02
Version 1.1
*/

import java.util.Locale;
import java.util.Scanner;

public class CobaCoba {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        // Test Logic Praktikum1
//        System.out.print("Masukkan Kata : ");
//        String strInput3 = sc.nextLine();
//        char chX;
//        int intTask = 0;
//        int intHasil = 0;
//        for (int i=0;i<strInput3.length();i++)
//        {
//            chX =strInput3.charAt(i);
//            intTask = chX;
//            if((intTask>=32 && intTask<=90))
//            {
//                intHasil=intHasil+intTask;
//
//            } if (intTask>=32 && intTask<=122) {
//
//            }
//            intHasil=intHasil+intTask;
//        }
//        System.out.println("Hasil : "+intHasil);


//        String strCompare = "Kemarau";
//        String output = (strCompare.equals("kemarau")) ? "1":"2";
//        System.out.println(output);

//        boolean isRemainderOn= true;
//        int intVal = 1200;
//        String strCuaca = "Hujan";
//        String strExec = "";
//        if (intVal > 1500)
//            System.out.println(intVal);
//        System.out.println(strCuaca);

//        String strA = "TEA";
//        String strB = "TOA";
//        System.out.println(strB.compareTo(strA));

//        int panjang = 0;
//        Scanner sn= new Scanner(System.in);
//        panjang = sn.nextInt();
//        System.out.println(panjang);

//        int intLoop = 0;
//
//        for (int i=0;i<10;i++){
//            intLoop++;
//            for (int j=0;j<20;j++){
//                if (j==10){
//                    break;
////                    continue;
//                }
//                intLoop++;
//            }
//        }
//        System.out.println(intLoop);

//        String strSambung = "8"+3;
//        System.out.println(strSambung);

//        int intLoop = 0;
//
//        for (int i=0;i<5;i++){
//            intLoop++;
//            if (intLoop>5){
//                break;
//            }
////            intLoop++;
//
//        }
//        System.out.println(intLoop);


//
//        for (int i=0;i<10;i++) {
//            intLoop++;
//            for (int j = 0; j < 20; j++) {
//                intLoop++;
//            }
//        }
//        System.out.println(intLoop);
//        boolean isGood = true;
//        do{
//            intLoop++;
//            continue;
//        }while (!isGood);
//        System.out.println(intLoop);

//        String strWelco = "Welcome";
//        System.out.println(strWelco.substring(1, 5));

//        boolean isRemainderOn = true; int j= 1200;String strCuaca = "Hujan";
//        String strExec = "";
//        if(isRemainderOn) {
//            strExec = "1";
//            System.out.print("INI TRUE REMINDER !!");
//        }
//        else if(j>1000 )
//        {
//            strExec = "2";
//            System.out.print("INI J > 1000 !!");
//        }
//        else if (strCuaca.equals ("Hujan"))
//        {
//            strExec = "3";
//            System.out.print("SEKARANG SEDANG HUJAN !!");
//        }
//        else
//        {
//            strExec = "4";
//            System.out.print("TIDAK ADA KONDISI YANG TERPENUHI");
//        }
//        System.out.println(strExec);
//        int angka = 11;
//        if (angka%2!=0){
//            System.out.println("Angka"+angka+"Adalah Bilangan Ganjil");
//        }
//        else {
//            System.out.println("Angka"+angka+"Adalah Bilangan Genap");
//        }

//        if((5<3) && (7!=2)){
//            System.out.println("OK");
//        } else if ((4==4)||!(3>2)) {
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

//        int intChoose = 3; intChoose = 2;
//        switch (intChoose){
//            case 1:
//                System.out.println("ini Satu");break;
//            case 2:
//                System.out.println("Ini Dua");break;
//            default:
//                System.out.println("Selain Satu dan Dua");break;
//        }
//        System.out.println(Integer.toBinaryString(6));

//        Character karakter = '1';
//        System.out.println(karakter.isDigit(karakter));
//        Character huruf = 'J';
//

//        Character charUpperCase = 'l';
//        System.out.println(Character.isUpperCase(charUpperCase));
//        Character charLowerCase = 'j';
//        System.out.println(Character.isLowerCase(charLowerCase));

        //        Random random = new Random();
//        System.out.println(random.nextInt(5, 10));

//        System.out.println("Mat Solar".compareTo("Nasrullah"));
//        System.out.println("Sugiyono".compareTo("Sariyono"));
//        System.out.println("Sarimin".compareTo("sarimi"));//Angka Negatif
//        System.out.println("Bajuri".compareTo("bajuri"));//Angka Negatif

//        double angka1 = 5.5;
//
//        double angka2 = 5.48;
//
//        if (Math.abs(angka1 - angka2) < 0.000001) {
//
//            System.out.println("Angkanya sama");
//
//        }else {
//
//            System.out.println("Angkanya beda");
//        }

//        Soal Nomor 2 Praktikum 2 Java Fundamental
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan Nama Depan = ");
//        String strInput = sc.nextLine().toUpperCase();
//        System.out.println("Panjang Karakter Input adalah "+strInput.length());
//        System.out.print("Masukkan Nama Tengah = ");
//        String strInput1 = sc.nextLine().toUpperCase();
//        System.out.println("Panjang Karakter Input adalah "+strInput1.length());
//        System.out.print("Masukkan Nama Belakang = ");
//        String strInput2 = sc.nextLine().toUpperCase();
//        System.out.println("Panjang Karakter Input adalah "+strInput2.length());
//        System.out.println("Nama Lengkap : "+strInput.concat(" "+strInput1.concat(" "+strInput2)));
//        System.out.println("Inisial Dari "+strInput.concat(" "+strInput1.concat(" "+strInput2))+" Adalah "
//        +strInput.charAt(0)+strInput1.charAt(0)+strInput2.charAt(0));

//        System.out.print("Masukkan Nama Depan = ");
//        String strFirstName = sc.nextLine();
//        System.out.println("Panjang Karakter Input adalah "+strFirstName.length());
//        System.out.print("Masukkan Nama Belakang = ");
//        String strLastName = sc.nextLine();
//        System.out.println("Panjang Karakter Input adalah "+strLastName.length());
//
//        char chFirstInitial = strFirstName.charAt(0);
//        char chFirstInitialTwo = strFirstName.charAt(5);
//        char chLastInitial = strLastName.charAt(0);
//        String strKarakter = strFirstName+strLastName;
//
//
//        System.out.println("Inisial Dari "+strFirstName.concat(" "+strLastName)+" Adalah "+Character.toUpperCase(chFirstInitial)
//        +Character.toUpperCase(chFirstInitialTwo)+Character.toUpperCase(chLastInitial));
//        System.out.println("Jumlah Karakter Input adalah "+strKarakter.length());

//        String strFirstName = "Aldi";
//        String strMiddleName = "Cahya";
//        String strLastName = "Ramadhan";
//        System.out.println("Masukkan Nama Depan = "+strFirstName);
//        System.out.println("Masukkan Nama Tengah = "+strMiddleName);
//        System.out.println("Masukkan Nama Belakang = "+strLastName);
//
//        System.out.println(strFirstName.concat(strMiddleName.concat(strLastName)));
//        System.out.println("ACR "+strFirstName.concat(strMiddleName.concat(strLastName))+
//                " Adalah "+strFirstName.charAt(0)+strMiddleName.charAt(0)+strLastName.charAt(0));

//        Batas Soal Nomor 2 Praktikum 2 Java Fundamental

//        Soal Nomor 1 Praktikum 2 Java Fundamental
        Scanner sc = new Scanner(System.in);
//        int intNumber = 0;
//        double doTotal = 0.0;
//        boolean isAgain = true;
//
//        try {
//            System.out.println("Masukkan angka sepuasnya: ");
//            do {
//                intNumber = sc.nextInt();//input
//
//                doTotal += intNumber;//proses penjumlahan input
//            } while (isAgain);//perulangan utk input kembali
//        } catch (Exception e) {//exception handling utk input karakter
//            System.out.println("Jumlah: " + doTotal);//output
//            System.exit(0);//keluar dari sistem
//        }

//        double doSum = 0;
//        int intCount = 0;
//
//        System.out.print("Masukkan angka sepuasnya: ");
//        while (true) {
//            try {
//                double doInput = sc.nextDouble();
//                doSum += doInput;
//                intCount++;
//            } catch (Exception e) {
//                break;
//            }
//        }
//
//        double doAverage = doSum / intCount;
//        System.out.println("Nilai Rata-Rata : " + doAverage);


//        Batas Soal Nomor 1 Praktikum 2 Java Fundamental
    }

}



