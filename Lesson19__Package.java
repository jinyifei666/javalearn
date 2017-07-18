package com.jinyifei.lessons;

import com.jinyifei.lessons.lesson19.A;

/**
 * Created by acera on 2017/7/18.
 * 包
 */
public class Lesson19__Package {
    public static void main(String[] args) {

        A a = new A();
        a.print();
        System.out.println("public:" + a.data_public);
        // System.out.println("protected:" + a.data_protected); // Error!没有访问权限
        // System.out.println("default:" + a.data_default); // Error!没有访问权限
        // System.out.println("private:" + a.data_private); // Error!没有访问权限

        B b = new B();
    }

}

class B extends A{

    public B(){
        System.out.println("public:" + this.data_public);
        System.out.println("protected:" + this.data_protected);
        // System.out.println("default:" + this.data_default); // Error!没有访问权限
        // System.out.println("private:" + this.data_private); // Error!没有访问权限
    }
}
