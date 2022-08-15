package com.string.wuxg;

public class StringDemo01 {

    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1:"+str1);

        char[] cha = {'a','b','c'};
        String str2 = new String(cha);
        System.out.println("str2:"+str2);

        byte[] byt = {98,99,100};
        String str3 = new String(byt);
        System.out.println("str3:"+str3);

        String str4 = "abc";
        System.out.println("str4:"+str4);

    }




}
