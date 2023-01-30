package com.juaracoding.acrjavafundamental.testharian.practicumresults;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 24/01/2023 19:01
@Last Modified 24/01/2023 19:01
Version 1.1
*/

import java.util.Random;

public class Quest2Practicum3 {

    public static void main(String[] args) {
        String strVokal = "aiueo";
        String strKonso = "bcdfghjklmnpqrstvwxyz";
        String strAlphabet ="abcdefghijklmnopqrstuvwxyz";
        int intVokal = strVokal.length()-1;
        int intKonso = strKonso.length()-1;
        int intAlphabet = strAlphabet.length()-1;
        String strOutput ="";
        Random rand = new Random();
        int intPenampung = rand.nextInt(2);
        int intTotalLoop = rand.nextInt(12,26);

        for(int i=0;i<intTotalLoop;i++){
            if(i<7){
                if(intPenampung==1){
                    intPenampung=2;
                    strOutput += strKonso.charAt(rand.nextInt(intKonso));
                }else{
                    intPenampung=1;
                    strOutput += strVokal.charAt(rand.nextInt(intVokal));
                }
            }else{
                strOutput += strAlphabet.charAt(rand.nextInt(intAlphabet));
            }

        }
        System.out.println(strOutput.substring(0,1).toUpperCase()+strOutput.substring(1));
    }
    }

