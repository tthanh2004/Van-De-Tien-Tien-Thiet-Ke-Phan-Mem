/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        IAnimalFactory factory;
        Random ran = new Random();
        int type = ran.nextInt(2);
        if(type == 0){
            factory = new BasicAnimalFactory();
        }
        else{
            factory = new RandomAnimalFactory();
        }
        for (int i = 0; i < 3; i++) {
            IAnimal animal = factory.createAnimal();
            animal.makeSound();
        }
    }
}
