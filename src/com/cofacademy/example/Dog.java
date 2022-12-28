package com.cofacademy.example;

public class Dog extends Animal{

    //GENERAMOS LA SOBREESCRITURA DE MÉTODOS DE LAS CLASES HEREDADAS

    @Override
    public void eat (){
        System.out.println("The dog is eating");
    };
    @Override
    public void sleep (){
        System.out.println("The dog is sleeping");
    };
}
