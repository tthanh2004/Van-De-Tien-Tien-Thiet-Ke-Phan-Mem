/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
public class BasicAnimalFactory implements IAnimalFactory {
    private int index = 0;
    @Override
    public IAnimal createAnimal() {
        if(index == 0){
            index++;
            return new Dog();
        }
        
        if(index == 1){
            index = 0;
            return new Cat(); 
        }
        return null;
    }
}
