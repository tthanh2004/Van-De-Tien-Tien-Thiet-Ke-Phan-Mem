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
public class FourLegsAnimalFactory implements AnimalFactory{

    @Override
    public FourLegsAnimal createAnimal(){
        Random random = new Random();
        int type = random.nextInt(2); // 0 hoặc 1
        if (type == 0) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
    
}
