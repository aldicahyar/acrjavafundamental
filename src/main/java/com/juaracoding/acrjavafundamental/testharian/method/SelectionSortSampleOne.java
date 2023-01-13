package com.juaracoding.acrjavafundamental.testharian.method;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/01/2023 21:39
@Last Modified 13/01/2023 21:39
Version 1.1
*/

public class SelectionSortSampleOne {

    static StringBuilder sBuild = new StringBuilder();

    public static void main(String[] args)
    {
        int val[] = {69,89,31,56,99};
        selectionSortDESCInt(val);
//        selectionSortASCInt(val);

        double ipk[] = {4.0,1.1,3.2,3.9,2.4};
        selectionSortDESCDouble(ipk);
        selectionSortASCDouble(ipk);
////
//        String []nameList = {"Namaste","Asu","Monyet","Elena","Lamida","Ebuset","Susi","Similikiti"};
//        selectionSortDESCString(nameList);
//        selectionSortASCString(nameList);
////
//        char []characters = {'V','K','Z','X','H','M','C','N'};
//        selectionSortDESCChar(characters);
//        selectionSortASCChar(characters);
    }

    public static void selectionSortDESCInt(int[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        int container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("==BEFORE==");
        for (int num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] < nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortDESCInt

    public static void selectionSortASCInt(int[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        int container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (int num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] > nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortASCInt

    public static void selectionSortDESCDouble(double[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        double container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (double num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] < nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (double num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortDESCDouble

    public static void selectionSortASCDouble(double[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        double container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (double num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] > nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (double num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortASCDouble

    public static void selectionSortDESCString(String[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        String container = "";

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz].compareTo(nums[j]) < 0)
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortDESCString

    public static void selectionSortASCString(String[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        String container = "";

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz].compareTo(nums[j]) > 0)
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortASCString

    public static void selectionSortDESCChar(char[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        char container = 'k';

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] < nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortDESCChar

    //    public static void getInitString(String strInit)//strIni must be filled with BEFORE or AFTER
//    {
//        System.out.println("\n==AFTER==");
//        for (char num:nums)
//        {
//            aft = sBuild.append(num).append(",").toString();
//        }
//        System.out.print(aft.substring(0,aft.length()-1));
//    }
    public static void selectionSortASCChar(char[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        char container = 'j';

//        getInitString("BEFORE");
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
//                    if(nums[initz].compareTo(nums[j]) > 0)
                    if(nums[initz]>nums[j])
                    {
                        initz = j;
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
        }
//        getInitString("AFTER");
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortASCChar
}
