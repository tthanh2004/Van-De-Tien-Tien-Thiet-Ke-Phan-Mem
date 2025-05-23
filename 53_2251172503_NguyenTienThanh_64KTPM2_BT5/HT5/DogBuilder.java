/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
public class DogBuilder implements AnimalBuilder{
    private String name;
    private String species;
    private int age;
    private float weight;

    @Override
    public void reset() {
        name = "";
        species = "Dog";
        age = 0;
        weight = 0;
    }

    @Override
    public void getName() {
        this.name = "Buddy";
    }

    @Override
    public void getSpecies() {
        this.species = "Dog";
    }

    @Override
    public void getAge() {
        this.age = 3;
    }

    @Override
    public void getWeight() {
        this.weight = 12.5f;
    }

    public Dog getResult() {
        return new Dog(name, species, age, weight);
    }
}
