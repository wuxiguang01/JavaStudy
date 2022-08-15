package com.string.wuxg;

public class StringDemo02 {

    public static void main(String[] args) {


        char[] cha = {'a','b','c'};
        String str1 = new String(cha);
        String str2 = new String(cha);
        System.out.println(str1 == str2);//false

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);//true
        //==比较的是内存地址
        System.out.println(str1 == str3);//false

        //equals比较的是内容
        boolean tt = str1.equals(str2);
        System.out.println(tt);
        System.out.println(str1.equals(str3));

    }
}
