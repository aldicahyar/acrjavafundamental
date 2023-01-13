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
Created on 10/01/2023 20:32
@Last Modified 10/01/2023 20:32
Version 1.1
*/

public class LoopContinue {
    public static void main(String[] args) {
//        for(int j=0;j<5;j++)
//        {
//            if(j==3)
//            {
//                System.out.println(" Ini yang terlompati "+j);
//                continue;
//            }
//            System.out.println(" 1 kali loop ke "+j);
//        }


        String nama = "Satibi";

        if (nama.length()>12) {

            System.out.println(nama.substring(0,12));

        }
    }
}
