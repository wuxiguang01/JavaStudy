package com.study.wuxg;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
