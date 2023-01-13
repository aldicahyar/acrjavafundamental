package com.juaracoding.acrjavafundamental.testharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 11/01/2023 19:55
@Last Modified 11/01/2023 19:55
Version 1.1
*/

public class LuasSegitiga {

    public static void main(String[] args) {

        luasSegitiga(4, 6);
    }
    private static void luasSegitiga(int alas, int tinggi) {
        double luas = 0.5 * alas * tinggi;
        System.out.println(luas);
    }
}
