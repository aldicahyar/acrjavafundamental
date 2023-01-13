package com.juaracoding.acrjavafundamental.testharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 11/01/2023 21:04
@Last Modified 11/01/2023 21:04
Version 1.1
*/

import java.util.Random;
//FOR JDK 17
public class UtilRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        for(int i=0;i<10;i++)
        {
            if(rand.nextInt(5)==11)
            {
                System.out.println("INI ANGKA 11");
            }
//			System.out.println("Random Number "+i+" -> "+rand.nextInt(5,11));
        }
        System.out.println("selesai");
//5=6
        //6=1
        //7=3
        //8=3
        //9=2
        //10=1
        //11=X
    }
}
