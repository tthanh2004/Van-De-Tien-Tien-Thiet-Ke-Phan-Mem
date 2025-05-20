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
    public static void main(String[] args){
        AnimalFactory factory;
        Random ran = new Random();
        int type = ran.nextInt(2);
        if(type == 0){
            factory = new FourLegsAnimalFactory();
        }
        else{
            factory = new TwoLegsAnimalFactory();
        }
        for (int i = 0; i < 10; i++) {
            Animal animal = factory.createAnimal();
            animal.getName();
        }
    }
}
