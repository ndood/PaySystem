package com.chenshun.test;

import org.junit.Test;

import java.util.Scanner;

/**
 * User: chenshun131 <p />
 * Time: 18/1/24 21:26  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
public class data13 {

    @Test
    public void T1() {
        int a = 129;
        int b = 128;
        System.out.println("a 和b 与的结果是：" + (a & b));
    }

    @Test
    public void T2() {
        int a = 129;
        int b = 128;
        System.out.println("a 和b 或的结果是：" + (a | b));
    }

    @Test
    public void t3() {
        int a = 2;
        System.out.println(String.format("a(%s) 非的结果是：%s(%s)", Integer.toBinaryString(a), ~a, Integer.toBinaryString(~a)));
    }

    @Test
    public void t4() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
        try {
            int num1 = input.nextInt();
            System.out.println("请输入除数：");
            int num2 = input.nextInt();
            System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
        } catch (Exception e) {
            System.err.println("出现错误：被除数和除数必须是整数，除数不能为零。");
            System.out.println(e.getMessage());
        }
    }

}
