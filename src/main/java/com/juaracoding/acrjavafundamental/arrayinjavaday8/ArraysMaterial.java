package com.juaracoding.acrjavafundamental.arrayinjavaday8;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 12/01/2023 19:47
@Last Modified 12/01/2023 21:04
Version 1.1
*/

public class ArraysMaterial {

    public static void main(String[] args) {
        // Assigning Values


        //Method 1
        int [] intScore ={1,2,3,4,5};
        System.out.println(intScore[2]);
        //Method 2
        int [] intScore2 = new int[4];
        intScore2[0]=1;
        intScore2[1]=2;
        intScore2[2]=3;
        intScore2[3]=4;
        System.out.println(intScore2[2]);

        double [] doArr = new double[8];
        doArr[2] = 3.0;
        System.out.println(doArr[4]);

        int [] intArr2 ={3,6,3,1,6,3,4,1};
        System.out.println(intArr2[2]);




    }
}
