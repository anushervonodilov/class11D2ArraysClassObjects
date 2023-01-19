package com.class11;

public class CatTester {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.sleep();
        cat1.eat();

        cat1.name = "Zardak";
        cat1.age = 2;
        cat1.color = "Orange";
        cat1.breed = "Just a boy";
        cat1.attitude = true;
        cat1.weight = 4.50;

        Cat cat2 = new Cat();
        cat2.name = "Loki";
        cat2.breed = "Domestic";
        cat2.color = "White";

        cat2.speak();


    }
}
