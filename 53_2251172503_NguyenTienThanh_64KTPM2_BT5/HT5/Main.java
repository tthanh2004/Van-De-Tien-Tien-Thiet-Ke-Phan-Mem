/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        DogBuilder dogBuilder = new DogBuilder();
        director.makeAnimal(dogBuilder);
        Dog dog = dogBuilder.getResult();

        ChickenBuilder chickenBuilder = new ChickenBuilder();
        director.makeAnimal(chickenBuilder);
        Chicken chicken = chickenBuilder.getResult();

        System.out.println("Dog: " + dog.name + ", Age: " + dog.age);
        System.out.println("Chicken: " + chicken.name + ", Age: " + chicken.age);
    }
}

