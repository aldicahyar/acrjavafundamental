package com.juaracoding.acrjavafundamental.testharian.testarray;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/01/2023 20:52
@Last Modified 13/01/2023 20:52
Version 1.1
*/

public class LinearSearch {

    public static void main(String[] args) {

        int[] intArr = {3,8,5,2,1,9,10};
        int intB = 1;
        boolean isFound = true;

        for(int i=0;i<intArr.length;i++)
        {
            if(intB==intArr[i])
            {
                System.out.println("Angka "+intB+" sudah ditemukan , pada index ke "+i);
                isFound = false;
                break;
            }
        }

        if(isFound)
        {
            System.out.println("Angka  "+intB+" yang anda cari tidak ditemukan !! ");
        }
    }
}
