package com.demo;

public class TestMyClass {

    public static void main(String[] args) {

        MyClass ob = new MyClass();
        ob.m3();
        ob.mymethod1();

        MyInterface mint = new MyClass();

        // anonymous class
        MtFunctionInterface mob1 = new MtFunctionInterface() {
            @Override
            public void method1() {
                System.out.println("in anonymous class method1");
            }
        };

        mob1.method1();

        // lambda expression
        MtFunctionInterface mob2 = () -> {
            System.out.println("in lambda method1");
        };

        mob2.method1();

        mob1.method1();
    }
}