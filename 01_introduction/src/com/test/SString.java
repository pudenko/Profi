package com.test;

 public class SString {
     String name;

     public SString(String name) {
         this.name = name;
     }

     public void myMethod(Object o){
         SString uu = (SString) o;
         System.out.println(this.name);
         System.out.println(uu.name);
     }




   static public String missingChar(String str, int n) {

        String result = "";
        if (n == 0){
            result = str.substring(1);
        }
        else{
            result = str.substring(0,n) + str.substring(n+1, str.length());
        }


        return result;
    }
}
