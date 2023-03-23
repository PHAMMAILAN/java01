/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab01;

import java.util.Scanner;

/**
 *
 * @author ngoth
 */
public class Lab01 {
    
//    int m;
//    static int j;
//
//    public void display () {
//        System.out.println("m = " + m);
//    }
    
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        char c = '\uffff';
//        System.out.println("c = " + c);
//        int i = 5;
//        int j;
//        Lab01 l = new Lab01();
//        l.display();
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);

// casting
        
//        int i = 5;
//        double d = 2.5;
//        d = i;      // ép kiểu tự động
//        i = (int)d;     // ep kieu tuong minh
//        System.out.println("i = " + i);

//convert from string to the primitive type
//        System.out.println("Nhap vao mot chuoi so: ");
//        Scanner s = new Scanner(System.in);
//        String str;
//        int a = 0;
//        int b = 0;
//        String s1 = s.nextLine();
//        String s2 = s.nextLine();      
//        str = s1 + s2;
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
//        System.out.println("str = " + str);
//        
//        try {
//            a = Integer.parseInt(s1);
//            b = Integer.parseInt(s2);
//        } catch (NumberFormatException e) {
//            System.out.println("Ban nhap khong dung chuoi so!");
//        } finally {
//            System.out.println("End of try");
//        }
//        System.out.println("End of main");


//        int c = a + b;
//        System.out.println(a + " + " + b +  " = " + a + b);         //convert lên String
//        System.out.println("a + b = " + a + b);                     //convert lên String
//        System.out.println("a + b = " + a + b);
//        System.out.println("a + b = " + c);


// try catch finally
//        System.out.println("Nhap vao 2 so: ");
//        Scanner s = new Scanner(System.in);
//        double a = s.nextInt();
//        double b = s.nextInt();
//        
//        System.out.println(a + "/" + b + " = " + a/b );
       
// array
//        int [] a1 = {1, 3, 5};
//        int [] a2 = {2, 4, 6};
//        a1 = a2;
//        a2[0] = 10;
//        System.out.println(a1[0]);

// boxing and unboxing
        Integer a = Integer.valueOf("123");
        Integer b = Integer.valueOf(5);
        Integer c = Integer.valueOf("12345", 10);
        int i = Character.MIN_RADIX;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        int x = a.intValue();
        System.out.println("x = " + x);
        int y = c;
        System.out.println("y = " + y);
    }
}
