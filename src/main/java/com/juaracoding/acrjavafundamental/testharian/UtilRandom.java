package com.juaracoding.acrjavafundamental.testharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
Runtime version: 17.0.5+1-b653.23 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1010M
Cores: 8

Kotlin: 223-1.7.21-release-272-IJ8214.52
@Author aldic 
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
