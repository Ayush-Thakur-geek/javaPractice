package com.thakur;
import java.lang.*;
public class Strings {
    public static void main(String[] args) {
        String a="Ayush";
        String b="Ayush";
        System.out.println(a==b);
        String c=new String("Ayush");
        String d=new String("Ayush");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.charAt(0));
        String e="5";
        System.out.println(e.charAt(0));
        String n=null;
        System.out.println(n);
    }
}
