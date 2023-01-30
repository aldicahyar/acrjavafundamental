package com.juaracoding.acrjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 30/01/2023 22:29
@Last Modified 30/01/2023 22:29
Version 1.1
*/

import java.util.Random;

public class TestCodeQuestionOnePractice4 {

    public static void main(String[] args) {
        Random random = new Random();
        String strCharRandom = "abcdefghijklmnopqrstuvwxyz";
        String strConnectorRandom = "_.";
        String strProviderEmail = "gmail,hotmail,yahoo,ymail";
        String strDot = ".";
        String strDomain = "com,co.id,gov,edu,sch,org,xyz";
        String [] strProviderEmailList = strProviderEmail.split(",");
        String [] strDomainList = strDomain.split(",");
        int length = random.nextInt(25,30);
        StringBuilder email = new StringBuilder();
        for (int i=0;i<length;i++){
            switch (i){
                case 11:
                case 18:
                    email.append(strConnectorRandom.charAt(random.nextInt(strConnectorRandom.length())));
                    break;
                case 8:
                    email.append(random.nextInt(100));
                    break;
//                case 23:
//                    email.append("@");
//                    break;
//                case 24:
//                    email.append(strProviderEmailList[random.nextInt(strProviderEmailList.length)]);
//                    break;
//                case 25:
//                    email.append(strDomainList[random.nextInt(strDomainList.length)]);
//                    break;
                default:
                    email.append(strCharRandom.charAt(random.nextInt(strCharRandom.length())));
                    break;
            }
        }
        System.out.println(email.append("@")+strProviderEmailList[random.nextInt(strProviderEmailList.length)]+strDot+strDomainList[random.nextInt(strDomainList.length)]);
        System.out.println(email.length());
    }
}
