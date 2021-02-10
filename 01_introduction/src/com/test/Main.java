package com.test;

class TT{

}

public class Main {
    public static boolean or35 (int n) {
        if(n > 0){

            if(n%3 > 0 && 0 < n%6){
                return false;
            }

            else {
                return true;
            }

        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
//        SString.missingChar("asd",4);
        System.out.println(or35(2));



//        SString o1 = new SString("Objeckt1");
//        SString o2 = new SString("Objeckt2");
//
//        Object o3 = o2;
//
//
//
//        o1.myMethod(o2);
//        System.out.println("!!!!!!!");
//        o2.myMethod(o1);



    }
}
