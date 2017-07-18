package com.jinyifei.lessons;

import java.util.Scanner;

/**
 * Created by acera on 2017/7/18.
 * 输入
 */
public class Lesson10__Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer:");
        int a = scanner.nextInt();
        System.out.print("Input an integer:");
        int b = scanner.nextInt();
        System.out.print("Input an integer:");
        int c = scanner.nextInt();
        System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
        scanner.close();
    }
}
