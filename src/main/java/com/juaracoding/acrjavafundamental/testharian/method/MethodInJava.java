package com.juaracoding.acrjavafundamental.testharian.method;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 16/01/2023 20:59
@Last Modified 16/01/2023 20:59
Version 1.1
*/
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MethodInJava {
    public int intZ;
    private int intX ;
    protected  int intY;

    int intA;

    public static void main(String[] args) {
        int intAngka;
    }

    //    public boolean sampleMethod(int intX){
    public void sampleMethod(int intX){// nama method nya sampleMethodINT
        System.out.println("Hello");
//        int intX = 4;
        boolean isGood = true;
        if(intX == 4)
        {
            isGood = false;
        }
//        return isGood;

    }

    public void sampleMethod(){// nama method nya sampleMethod

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        return new ArrayList();
    }

    public void ambilMethod(){
        sampleMethod();
    }

    public double volumeKubusOne(double doLuasPersegi){

        double doSisi = Math.sqrt(doLuasPersegi);

        return (doSisi*doSisi*doSisi);

    }
    public double volumeKubusTwo(double doLuasPersegi){

        return Math.pow(Math.sqrt(doLuasPersegi),3);

    }

    public double luasPersegi(double sisi){

//        System.out.println("Nilai persegi dari sisi yang berjumlah "+sisi+" adalah "+(sisi*sisi));

        double douSisi = sisi*sisi;
        System.out.println("Nilai persegi dari sisi yang berjumlah "+sisi+" adalah "+douSisi);
        return douSisi;
    }

    public boolean cekBilanganIsTen(int intBilangan){

        boolean isCek = (intBilangan>=10);
        System.out.println(isCek);

//        return (intBilangan>=10);
        return isCek;
    }

    public void sampleMethod(String strK) throws ArithmeticException,IOException{// nama method nya sampleMethodSTR

    }

    protected void sampleMethodTwo(){

    }

    private void sampleMethodThree(){

    }

    void sampleMethodFour(){

    }

}

