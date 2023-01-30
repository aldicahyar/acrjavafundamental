package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 25/01/2023 1:31
@Last Modified 25/01/2023 1:31
Version 1.1
*/

class One {
    public void method(){
        System.out.println("Class One Method");
    }
}

class Two extends One implements INumber{
    public void method(){
        System.out.println("Class TWO Method");
    }
}

