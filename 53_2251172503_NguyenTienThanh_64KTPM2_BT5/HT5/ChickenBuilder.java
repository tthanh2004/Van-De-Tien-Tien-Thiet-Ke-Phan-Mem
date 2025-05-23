/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
public class ChickenBuilder implements AnimalBuilder {
    private String name;
    private String species;
    private int age;
    private float weight;

    @Override
    public void reset() {
        name = "";
        species = "Chicken";
        age = 0;
        weight = 0;
    }

    @Override
    public void getName() {
        this.name = "Clucky";
    }

    @Override
    public void getSpecies() {
        this.species = "Chicken";
    }

    @Override
    public void getAge() {
        this.age = 1;
    }

    @Override
    public void getWeight() {
        this.weight = 2.3f;
    }

    public Chicken getResult() {
        return new Chicken(name, species, age, weight);
    }
}
