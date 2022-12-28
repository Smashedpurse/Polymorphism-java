package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {

        //DECLARACIÓN DE OBJETO DE TIPO ANIMAL (SUPER CLASE) CON POLIMOFISMO
         Animal  animal = new Dog();
         Animal animalc = new Cat();

         /*animal.eat();
         animal.sleep();
         animal.attack();
         animalc.eat();
         animalc.sleep();
         animalc.attack();
          */


         Animal [] animalArray = new Animal[4];

         animalArray[0]= new Animal();
         animalArray[1]= new Dog();
         animalArray[2]= new Cat();
         animalArray[3]= new Dog();

         for (Animal a : animalArray ) {
             a.eat();
         }
    }
}
