package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {

         Animal  animal = new Dog();
         Animal animalc = new Cat();

         animal.eat();
         animal.sleep();
         animal.attack();
         animalc.eat();
         animalc.sleep();
         animalc.attack();

    }
}
