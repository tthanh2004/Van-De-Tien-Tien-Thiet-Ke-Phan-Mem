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
public class RandomAnimalFactory implements IAnimalFactory{

    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        if(type == 0){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
