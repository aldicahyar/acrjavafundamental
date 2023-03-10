package com.juaracoding.acrjavafundamental.testharian.testarray;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/01/2023 20:43
@Last Modified 13/01/2023 20:43
Version 1.1
*/

public class SelectionSortASCProsedural {
    static StringBuilder sBuild = new StringBuilder();

    public static void main(String[] args) {
        int val[] = {69,89,31,56,99};
        String bef = "";
        String aft = "";
        int initz = 0;
        int intContainer = 0;


        //ASC INT
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (int num:val)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < val.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=val.length-1)
            {
                for (int j = i ; j < val.length ; j++)
                {
                    if(val[initz] > val[j])
                    {
                        initz = j;
                    }
                }
            }
            intContainer = val[i];
            val[i] = val[initz];
            val[initz] = intContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:val)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

}
