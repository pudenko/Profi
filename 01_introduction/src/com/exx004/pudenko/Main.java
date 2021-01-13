package com.exx004.pudenko;
interface Pcat{
    String iterator();
}
class Cat implements Pcat{
    @Override
    public String iterator() {
        return this.iterator;
    }

    String iterator;

    public Cat() {
        this.iterator = "gdfgdf";
    }
}
public class Main {
    public static void main(String[] args) {
        Cat test = new Cat();
        String name = test.iterator();
    }
}
