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
public class TwoLegsAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(){
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0) {
            return new Duck();
        } else {
            return new Chicken();
        }
    }
}
