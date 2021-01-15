package ex006.iterator_with_objects;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " " + price + "$";
    }
}
