package com.lv.reflect;

public class ClassDemo1 {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Class c1 = Foo.class;
        Class c2 = foo.getClass();
        System.out.println(c1 == c2);
    }
}

class Foo{}

