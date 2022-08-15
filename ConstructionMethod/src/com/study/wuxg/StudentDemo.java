package com.study.wuxg;

public class StudentDemo {

    public static void main(String[] args) {
        Student sd = new Student();
        sd.setName("吴希广");
        sd.setAge(30);
        sd.show();

        Student sd2 = new Student("wuxiguang",30);
        sd2.show();

    }
}
