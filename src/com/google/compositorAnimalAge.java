package com.google;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class compositorAnimalAge {
    public static void compositorAnimalAge(ArrayList<Animal> array) {
        List<Animal> animalSortAge = array.stream().sorted(Comparator.comparing(Animal::getAge)).collect(Collectors.toList());
        for (int i = 0; i <array.size() ; i++) {
            Animal animal = new Animal();
            animal = animalSortAge.get(i);
            System.out.println(animal.toString());
        }
    }
}