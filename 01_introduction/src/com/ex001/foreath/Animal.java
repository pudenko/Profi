package com.ex001.foreath;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " " + price;
    }
//   public void print(){
//       System.out.println(price);
//   }
}
