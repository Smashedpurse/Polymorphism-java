package com.cofacademy.example;

public class Cat extends Animal{

    //SOBREESCRITURA EN LA SUBCLASE CAT
    @Override
    public void eat (){
        System.out.println("The cat is eating");
    };
    @Override
    public void sleep (){
        System.out.println("The cat is sleeping");
    };
}
