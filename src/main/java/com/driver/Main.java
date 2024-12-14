package com.driver;

public class Main {

    public static class A{
        public String math(){

            return "Invoking method from class A";

        }
    }

    public static class B extends A {
        @Override
        public String math() {
            return "Method is overridden in Extended class B";
        }

    }

    public static void main(String[] args) {
        B obj1 = new B();

        System.out.println(obj1.math());

        B obj2 = new B();

        System.out.println(obj2.math());
    }

}