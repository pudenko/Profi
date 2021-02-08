package com.test;

public class Main {
    public static void main(String[] args) {
//        SString.missingChar("asd",4);



        SString o1 = new SString("Objeckt1");
        SString o2 = new SString("Objeckt2");

        Object o3 = o2;



        o1.myMethod(o2);
        System.out.println("!!!!!!!");
        o2.myMethod(o1);



    }
}
