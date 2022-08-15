package com.string.wuxg;
import java.util.Scanner;

public class StringDemo3 {

    public static void main(String[] args) {

        String username = "wuxiguang";
        String passwork = "123456";
        String usernameIn;
        String passwordIn;

        for (int i = 0;i < 3;i++){

            Scanner sc = new Scanner(System.in);
            System.out.println("用户名：");
            usernameIn = sc.nextLine();
            System.out.println("密码：");
            passwordIn = sc.nextLine();

            if ( usernameIn.equals(username) && passwordIn.equals(passwork)) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("您输入的有无，请重新输入，还剩" + (2-i) + "次" );
            }
        }

    }
}
