package com.google;

import java.util.ArrayList;

public class showAnimal {
    public static void showAnimal(ArrayList<Animal> array){
        for (int i = 0; i <array.size() ; i++) {
            Animal animal = new Animal();
            animal = array.get(i);
            System.out.println(animal.toString());
        }
    }
}
